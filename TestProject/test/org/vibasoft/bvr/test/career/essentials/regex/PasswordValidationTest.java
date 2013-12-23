package org.vibasoft.bvr.test.career.essentials.regex;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PasswordValidationTest {

	static PasswordValidation test;
	@BeforeClass
	public static void setUp() throws Exception {
		test = new PasswordValidation();
	}

	@After
	public void tearDown() {
		System.out.println("Test4RegexTestOne.tearDown()");
		test.resetMatcher();
	}
	
	@Test
	public void test() {
//		fail("Not yet implemented");
		Assert.assertTrue(test.validatePassword("John123"));
	}
	
	@Test
	public void testMinLength() {
		Assert.assertFalse("Can't be <6", test.validatePassword("John123"));
	}
	
	@Test
	public void testMaxLength() {
		Assert.assertFalse("Can't be >17",test.validatePassword("Jonathanon-Christopher-IX"));
//		Assert.assertTrue("Can't be >17",test.validateUserName("Peter-Christopher"));
	}
	
	@Test
	public void testCantEndWith() {
		Assert.assertFalse("Can't end with .-_",test.validatePassword("s.g.r."));
	}
	
	@Test
	public void testMustStartWith() {
		Assert.assertFalse("Must start with an alphabet",test.validatePassword("23Lucky"));
	}
	
	@Test
	public void validNames() {
		Assert.assertTrue("Min Length 6", test.validatePassword("Joeyt2"));
		Assert.assertTrue("Max Length 15", test.validatePassword("PeterChristop2"));
		Assert.assertFalse("Special characters are allowed anywhere",test.validatePassword("s.g-h_k.r"));
		Assert.assertTrue("end with numeric",test.validatePassword("Lucky23"));
		
		Assert.assertFalse("invalid special characters", test.validatePassword("Jo*&abc"));
	}
}
