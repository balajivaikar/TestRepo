package org.vibasoft.bvr.test.rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import org.vibasoft.bvr.test.career.essentials.common.Node;
import org.vibasoft.bvr.test.career.essentials.common.Node.OPERATOR;

public class TestRmiServerImpl extends UnicastRemoteObject implements TestRmiRemote{

	/**
	 * 
	 */
	private static final long serialVersionUID = -604714710586395347L;
	
	String name = "";
	Node node;
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

	@Override
	public Node getNode() throws RemoteException {
		// TODO Auto-generated method stub
//		return new Node(5,10,OPERATOR.ADD)s;
		return node;
	}

	@Override
	public void setNode(Node root) throws RemoteException {
		// TODO Auto-generated method stub
		this.node = root;
	}

	@Override
	public int evaluateTree() throws RemoteException {
		// TODO Auto-generated method stub
		return node.evaluate();
	}
	
	
	
	

	
}
