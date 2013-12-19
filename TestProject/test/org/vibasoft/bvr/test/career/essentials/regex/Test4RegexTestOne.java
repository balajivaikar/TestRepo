/**
 * 
 */
package org.vibasoft.bvr.test.career.essentials.regex;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Balaji
 *
 */
public class Test4RegexTestOne {

	static RegexTestOne test;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUp() throws Exception {
		test = new RegexTestOne();
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
		Assert.assertTrue(test.validateUserName("John123"));
	}

	@Test
	public void testMinLength() {
		Assert.assertFalse("Can't be <2", test.validateUserName("P"));
	}
	
	@Test
	public void testMaxLength() {
		Assert.assertFalse("Can't be >17",test.validateUserName("Jonathanon-Christopher-IX"));
	}
	
	@Test
	public void testCantEndWith() {
		Assert.assertFalse("Can't end with .-_",test.validateUserName("s.g.r."));
	}
	
	@Test
	public void testMustStartWith() {
		Assert.assertFalse("Must start with an alphabet",test.validateUserName("23Lucky"));
	}
	
	@Test
	public void validNames() {
		Assert.assertTrue("Min Length 2", test.validateUserName("Jo"));
		Assert.assertTrue("Max Length 17", test.validateUserName("Peter-Christopher"));
		Assert.assertTrue(".-_allowed in the middle",test.validateUserName("s.g-h_k.r"));
		Assert.assertTrue("end with numeric",test.validateUserName("Lucky23"));
		Assert.assertTrue("invalid special characters", test.validateUserName("Jo*&abc"));
	}
}

