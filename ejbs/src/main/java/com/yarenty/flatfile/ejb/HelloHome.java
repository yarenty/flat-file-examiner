package com.yarenty.flatfile.ejb;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;

/**
 * Created by yarenty on 15/07/2014.
 */
public interface HelloHome extends EJBHome {
    public HelloObject create() throws RemoteException, CreateException;
}