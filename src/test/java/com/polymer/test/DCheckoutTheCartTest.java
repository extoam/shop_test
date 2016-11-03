package com.polymer.test;

import org.testng.annotations.Test;


public class DCheckoutTheCartTest extends TestBase {
	

	  @Test
	  public void checkoutTheCart() throws  InterruptedException {
		 
		    openHomePage();
		    openTheCart();
		    openCheckout();
		    fillInForms();
		    submitTheForms();
		    finishCheckOut();
		  }

}
