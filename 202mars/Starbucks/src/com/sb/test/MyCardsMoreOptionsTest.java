package com.sb.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sb.view.CreditBalance;

public class MyCardsMoreOptionsTest {

	@Test
	public void testGetBalance() {
		float expectedf = 16.4f;
		float actualf; 
		CreditBalance bal = new CreditBalance();
		actualf = bal.getBalance();
		assertEquals("Valid!",expectedf, actualf);
		//fail("Not yet implemented");
		fail("Not yet implemented");
	}

}
