/**
 * TestRmiServerImplTest.java
 * @author Balaji
 * @date Jan 9, 2014
 */
package org.vibasoft.bvr.test.rmi;

import static org.junit.Assert.*;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
