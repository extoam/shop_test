package com.polymer.test;

import org.testng.annotations.Test;


public class CAddItemsToCartTest  extends TestBase {
	  
	@Test
	
	public void addItemsToTheCart()  throws InterruptedException {
		
		openHomePage();
		openLadiesOuterwearPage();
	    openItemForDetails();
	    addLadiesItemToCart();
	    verifyLadiesItemInCart();
	    openTShirtPage();
	    openTShirtForDetails();
	    addTshirtToCart();
	  
	  }


}
