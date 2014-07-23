package com.yarenty.flatfile.ejb;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

/**
 * Created by yarenty on 15/07/2014.
 */
public interface HelloObject extends EJBObject {
    public String sayHello() throws RemoteException;
}
