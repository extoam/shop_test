package com.polymer.test;

import org.testng.annotations.Test;


public class BLadiesOuterwearListVerifyTest  extends TestBase  {


  @Test
  public void verifyLadiesListOfItems()  throws InterruptedException {
	  openHomePage();
	   openLadiesOuterwearPage();
	   verifyLadiesList();
	   verifyListOfLadiesItem();
	   
  
  }


}