/**
 * TestRmiServerImplTest.java
 * @author Balaji
 * @date Jan 9, 2014
 */
package org.vibasoft.bvr.test.rmi;

import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import org.vibasoft.bvr.test.career.essentials.common.Node;
import org.vibasoft.bvr.test.career.essentials.common.Node.OPERATOR;

/**
 * 
 */
public class TestRmiServerImplTest {

	static Registry registry;
	static TestRmiRemote stub;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		registry = LocateRegistry.getRegistry("localhost", 2222);
		stub = (TestRmiRemote) registry.lookup("testRmiServer");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		stub = null;
		registry = null;
	}

	@Test
	public void testValid() {
		try {
			stub.setName("Balaji");
			assertEquals("Hello Balaji", stub.sayHello());
			Node rootNode = new Node();
				rootNode.setLhsValue(10);
				rootNode.setRhsValue(20);
				rootNode.setOperator(OPERATOR.MULTIPLY);
			stub.setNode(rootNode);
			Node responseNode = stub.getNode();
			System.out.println("evaluating responseNode: " + responseNode.evaluate());
			System.out.println("evaluateTree: " + stub.evaluateTree());
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
