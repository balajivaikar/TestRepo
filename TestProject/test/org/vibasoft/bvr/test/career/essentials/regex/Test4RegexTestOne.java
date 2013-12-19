/**
 * 
 */
package org.vibasoft.bvr.test.career.essentials.regex;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Balaji
 *
 */
public class Test4RegexTestOne {

	RegexTestOne test;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		test = new RegexTestOne();
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
		Assert.assertTrue(test.validateUserName("John123"));
	}

}
