package com.yarenty.flatfile.jsp;

import com.yarenty.flatfile.ejb.Tasks;
import com.yarenty.flatfile.model.Task;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.jndi.SimpleNamingContextBuilder;
import org.springframework.web.servlet.ModelAndView;

import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import java.util.Hashtable;
import java.util.List;

import static org.junit.Assert.*;

public class HelloControllerTest {

    NamingEnumeration<NameClassPair> list;
    Tasks tasks;

    @Before
    public void Setup(){

        tasks = new Tasks() {
            @Override
            public List<Task> getTodayTasks() {
                return null;
            }
        };

         list =        new NamingEnumeration<NameClassPair>() {

            @Override
            public NameClassPair next() throws NamingException {
                return null;
            }

            @Override
            public boolean hasMore() throws NamingException {
                return false;
            }


            @Override
            public void close() throws NamingException {

            }


            @Override
            public boolean hasMoreElements() {
                return false;
            }


            @Override
            public NameClassPair nextElement() {
                return null;
            }
        };

    }

    @Test
    public void testHandleRequest() throws Exception {
        HelloController controller = new HelloController();

        SimpleNamingContextBuilder builder = new SimpleNamingContextBuilder();


        Hashtable ctx  = new Hashtable<Object, Object>();

        ctx.put("java:global/MyTasks",tasks);

        builder.createInitialContextFactory(ctx);
        builder.bind("java:global/MyTasks",tasks);
        builder.bind("java:global",list);



        builder.activate();

        ModelAndView modelAndView = controller.handleRequest(null, null);

        assertEquals("hello", modelAndView.getViewName());
    }
}