package com.polymer.test;


import org.testng.annotations.Test;


public class AMenOuterwearListVerifyTest extends TestBase {


 

  @Test
  public void verifyListOfItems()  throws InterruptedException {
	openHomePage();
    openMensOutwearPage();
    verifyNameofList(); 
	verifyListOfMensItem();
	  }


}