package org.vibasoft.bvr.test.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TestRmiRemote extends Remote{

	public void setName(String name) throws RemoteException;
	public String getName() throws RemoteException;
	public String sayHello() throws RemoteException;
	
}
