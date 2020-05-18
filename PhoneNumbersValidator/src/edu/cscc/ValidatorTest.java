package edu.cscc;

import org.junit.Assert;
import org.junit.Test;


public class ValidatorTest {

	@Test
	public void testCheckPat1() {
		Assert.assertTrue(Validator.checkPat1("(696) 377-6655"));
		Assert.assertFalse(Validator.checkPat1("1097679382"));
		Assert.assertFalse(Validator.checkPat1("(167) 280-3318"));
		Assert.assertFalse(Validator.checkPat1("121-975-5214"));
		Assert.assertFalse(Validator.checkPat1("459-506-6160 ext 2015"));
		Assert.assertFalse(Validator.checkPat1("442062430"));
		Assert.assertFalse(Validator.checkPat1("463727"));
		Assert.assertFalse(Validator.checkPat1("(978 971-5035"));
		Assert.assertFalse(Validator.checkPat1("banana"));
		Assert.assertFalse(Validator.checkPat1("(283)    418-5372"));
		Assert.assertFalse(Validator.checkPat1("243-770-####"));
		
	}

	@Test
	public void testCheckPat2() {
		Assert.assertTrue(Validator.checkPat2("788-708-9427"));
		Assert.assertFalse(Validator.checkPat2("1097679382"));
		Assert.assertFalse(Validator.checkPat2("(167) 280-3318"));
		Assert.assertFalse(Validator.checkPat2("121-975-5214"));
		Assert.assertFalse(Validator.checkPat2("459-506-6160 ext 2015"));
		Assert.assertFalse(Validator.checkPat2("442062430"));
		Assert.assertFalse(Validator.checkPat2("463727"));
		Assert.assertFalse(Validator.checkPat2("(978 971-5035"));
		Assert.assertFalse(Validator.checkPat2("banana"));
		Assert.assertFalse(Validator.checkPat2("(283)    418-5372"));
		Assert.assertFalse(Validator.checkPat2("243-770-####"));
		
	}

	@Test
	public void testCheckPat3() {
		Assert.assertTrue(Validator.checkPat3("8597644748"));
		Assert.assertFalse(Validator.checkPat3("1097679382"));
		Assert.assertFalse(Validator.checkPat3("(167) 280-3318"));
		Assert.assertFalse(Validator.checkPat3("121-975-5214"));
		Assert.assertFalse(Validator.checkPat3("459-506-6160 ext 2015"));
		Assert.assertFalse(Validator.checkPat3("442062430"));
		Assert.assertFalse(Validator.checkPat3("463727"));
		Assert.assertFalse(Validator.checkPat3("(978 971-5035"));
		Assert.assertFalse(Validator.checkPat3("banana"));
		Assert.assertFalse(Validator.checkPat3("(283)    418-5372"));
		Assert.assertFalse(Validator.checkPat3("243-770-####"));
		
	}

}
