package org.vibasoft.bvr.test.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import org.vibasoft.bvr.test.career.essentials.common.Node;

public interface TestRmiRemote extends Remote{

	public void setName(String name) throws RemoteException;
	public String getName() throws RemoteException;
	public String sayHello() throws RemoteException;
	public Node getNode() throws RemoteException;
	public void setNode(Node root) throws RemoteException;
	public int evaluateTree() throws RemoteException;
	
}
