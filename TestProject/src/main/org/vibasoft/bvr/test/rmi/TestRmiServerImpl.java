package org.vibasoft.bvr.test.rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class TestRmiServerImpl extends UnicastRemoteObject implements TestRmiRemote{

	/**
	 * 
	 */
	private static final long serialVersionUID = -604714710586395347L;
	
	String name = "";
	protected TestRmiServerImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		try {
			 TestRmiServerImpl impl = new TestRmiServerImpl();
			Registry registry = LocateRegistry.createRegistry(2222);
			registry.bind("testRmiServer", impl);
			System.out.println("TestRmiServerImpl.main(): successfully started & registered 'testRmiServer'");
			System.out.println("TestRmiServerImpl.main(): waiting to serve");
//			Naming.bind("testRmiServer", impl);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void setName(String name) {
		this.name = name; 
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Hello " + name;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("TestRmiServerImpl.finalize(): Shutting down server");
		super.finalize();
		
	}

	
}
