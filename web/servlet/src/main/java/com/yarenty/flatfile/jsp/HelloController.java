package com.yarenty.flatfile.jsp;

import com.yarenty.flatfile.ejb.Tasks;
import com.yarenty.flatfile.model.Task;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.ejb.EJB;
import javax.naming.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 * Created by yarenty on 15/07/2014.
 */
public class HelloController implements Controller {

    protected final Log logger = LogFactory.getLog(getClass());
    @EJB(name = "TasksBeans")
    private Tasks tasks;

    /**
     * @param args
     */
    public static void main(String[] args) {


    }

    /**
     * this one is easy hello world
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {
        logger.info("will return some HELLO");
        //String req = request.getContentType();
        //logger.info("REQUESTED::"+req);

        //	ModelAndView modelAndView = new ModelAndView("WEB-INF/jsp/hello.jsp");

        String now = (new Date()).toGMTString();

        return new ModelAndView("hello", "now", getTask()); // no more full path
        //- added view Resolver with prefix and suffix
    }

    public String getTask() throws NamingException {

        if (tasks == null) {
            logger.error("NO tasks!!!");

            Properties env = new Properties();
            //env.put(Context.INITIAL_CONTEXT_FACTORY, org.jboss.naming.remote.client.InitialContextFactory.class.getName());
            //env.put(Context.PROVIDER_URL,"remote://localhost:4447");
            Context ctx = new InitialContext(env);

            printAll(ctx);
            logger.info("Initialize context");
            // foo/EJB-NAME/remote
            tasks = (Tasks) ctx.lookup("java:global/MyTasks");
            logger.info("YEAH!!!!");
        }


        List<Task> listTask = tasks.getTodayTasks();

        StringBuilder sb = new StringBuilder();
        for (Task task : listTask) {
            sb.append(task.getId()).append(":").append(task.getDescription()).append("\n");
        }

        return sb.toString();

    }

    private void printAll(Context ctx) throws NamingException {


        NamingEnumeration<NameClassPair> list = ctx.list("java:global");
        while (list.hasMore()) {
            logger.info(">>" + list.next().getName());
        }

        list = ctx.list("*");
        while (list.hasMore()) {
            logger.info("->" + list.next().getName());
        }

        listContext(ctx, "+");

    }


    void listContext(Context ctx, String indent) throws NamingException {

        NamingEnumeration list = ctx.listBindings("java:global");
        while (list.hasMore()) {
            Binding item = (Binding) list.next();
            logger.info(">>" + indent + item.getClassName() + " " + item.getName());
            if (item.getObject() instanceof Context) {
                listSubContext((Context) item.getObject(), indent + "-");
            }
        }
    }

    void listSubContext(Context ctx, String indent) throws NamingException {

        NamingEnumeration list = ctx.listBindings("");
        while (list.hasMore()) {
            Binding item = (Binding) list.next();
            logger.info(">>" + indent + item.getClassName() + " " + item.getName());
            if (item.getObject() instanceof Context) {
                listSubContext((Context) item.getObject(), indent + "-");
            }
        }
    }

}