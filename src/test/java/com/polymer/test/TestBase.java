package com.polymer.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestBase {
	  private static WebDriver driver;
	  private  static String baseUrl;
	  private static StringBuffer verificationErrors = new StringBuffer();

	
	@BeforeTest(alwaysRun = true)
	public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "https://shop.polymer-project.org";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
// Open Home Page
	protected void openHomePage() throws InterruptedException {
		driver.get(baseUrl + "/");
		 Thread.sleep(2000);
	}
		
// Check Men's outerwear page  	
	protected void openMensOutwearPage() {
			
		    driver.findElement(By.linkText("Men's Outerwear")).click();
		    try {
		        assertEquals(driver.getTitle(), "Men's Outerwear - SHOP");
		      } catch (Error e) {
		        verificationErrors.append(e.toString());
		      }
		}

	protected void verifyNameofList() throws InterruptedException {
			try {
		    	
             assertEquals(driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/header/h1")).getText(), "Men's Outerwear");
		    	 System.out.println("List of  " + driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/header/h1")).getText() + "  items is opened");
		    } catch (AssertionError e) {
		    	 {
			    	  System.out.println("Report Error " + e);
		    	 }
		    }  	  
		    try {
		    	    assertEquals(driver.findElement(By.cssSelector("span.style-scope.shop-list")).getText(), "(16 items)");
		        	System.out.println("Number of items is displayed ");
			   
		    } catch (Error e) {
		    	      verificationErrors.append(e.toString());
		    }
		    
			  Thread.sleep(2000);
		}

	protected void verifyListOfMensItem() {
			try {
			  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[1]")));
			  System.out.println(driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[1]")).getText() + " is  on the page");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
			try {
			  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[2]")));
			  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[1]")).getText() + " is  on the page");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
			try {
			  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[3]")));
			  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[3]")).getText() + " is  on the page");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
			try {
			  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[4]")));
			  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[4]")).getText() + " is  on the page");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
			try {
			  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[5]")));
			  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[5]")).getText() + " is  on the page");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
			try {
			  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[6]")));
			  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[6]")).getText() + " is  on the page");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
			try {
			  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[7]")));
			  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[7]")).getText() + " is  on the page");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
			try {
			  assertTrue(isElementPresent(By.xpath("//html/body/shop-app/iron-pages/shop-list/ul/li[8]")));
			  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[8]")).getText() + " is  on the page");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
			try {
			  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[9]")));
			  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[9]")).getText() + " is  on the page");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
			try {
			  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[10]")));
			  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[10]")).getText() + " is  on the page");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
			try {
			  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[11]")));
			  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[11]")).getText() + " is  on the page");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
			try {
			  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[12]")));
			  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[12]")).getText() + " is  on the page");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
			try {
			  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[13]")));
			  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[13]")).getText() + " is  on the page");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
			try {
			  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[14]")));
			  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[14]")).getText()  + " is  on the page");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
			try {
			  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[15]")));
			  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[15]")).getText() + " is  on the page");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
			try {
			  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[16]")));
			  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[16]")).getText() + " is  on the page");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
		}
	
	
// Check Ladies' outerwear	
	
protected void openLadiesOuterwearPage() {
	
	
	    driver.findElement(By.linkText("Ladies Outerwear")).click();
		 try {
		      assertEquals(driver.getTitle(), "Ladies Outerwear - SHOP");
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }
}

protected void verifyLadiesList() throws InterruptedException {
		try {
	    	
         assertEquals(driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/header")).getText(), "Ladies Outerwear (6 items)");
	    	 System.out.println("List of  " + driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/header")).getText() + "  items is opened");
	    } catch (AssertionError e) {
	    	 {
		    	  System.out.println("Report Error " + e);
	    	 }
	    }  	  
	    
		  Thread.sleep(2000);
	}

protected void verifyListOfLadiesItem() {
	try {
		  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[1]")));
		  System.out.println(driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[1]")).getText() + " is  on the page");
		} catch (Error e) {
		  verificationErrors.append(e.toString());
		}
		try {
		  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[2]")));
		  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[2]")).getText() + " is  on the page");
		} catch (Error e) {
		  verificationErrors.append(e.toString());
		}
		try {
		  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[3]")));
		  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[3]")).getText() + " is  on the page");
		} catch (Error e) {
		  verificationErrors.append(e.toString());
		}
		try {
		  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[4]")));
		  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[4]")).getText() + " is  on the page");
		} catch (Error e) {
		  verificationErrors.append(e.toString());
		}
		try {
		  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[5]")));
		  System.out.println( driver.findElement(By.xpath("//html/body/shop-app/iron-pages/shop-list/ul/li[5]")).getText() + " is  on the page");
		} catch (Error e) {
		  verificationErrors.append(e.toString());
		}
		try {
		  assertTrue(isElementPresent(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[6]")));
		  System.out.println( driver.findElement(By.xpath("/html/body/shop-app/iron-pages/shop-list/ul/li[6]")).getText() + " is  on the page");
		} catch (Error e) {
		  verificationErrors.append(e.toString());
		}
		
	}


// Add Items to the Cart


protected void openItemForDetails() throws InterruptedException {
	driver.findElement(By.xpath("//img[@alt='Ladies Colorblock Wind Jacket']")).click();
	Thread.sleep(2000);
}


protected void addLadiesItemToCart() throws InterruptedException {
	 driver.findElement(By.cssSelector("button.style-scope.shop-detail")).click();
	 Thread.sleep(2000);
}

protected void   verifyLadiesItemInCart() throws InterruptedException {
	driver.findElement(By.id("viewCartAnchor")).click();
	driver.findElement(By.xpath("/html/body/shop-app/shop-cart-modal/div[2]/shop-button[1]/a")).click();
	Thread.sleep(2000);
	try {
	      assertTrue(isElementPresent(By.linkText("Ladies Colorblock Wind Jacket")));
	      System.out.println("Ladies Colorblock Wind Jacket is added to the cart");
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
}

protected void addTshirtToCart() throws InterruptedException {
	 driver.findElement(By.cssSelector("button.style-scope.shop-detail")).click();
	 Thread.sleep(2000);
	    driver.findElement(By.id("viewCartAnchor")).click();
	    Thread.sleep(3000);
	    try {
	      assertTrue(isElementPresent(By.linkText("Inbox - Subtle Actions T-Shirt")));
	      System.out.println("Inbox - Subtle Actions T-Shirt is added to the cart");
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    Thread.sleep(3000);
}

protected void openTShirtForDetails() {
	 driver.findElement(By.xpath("//img[@alt='Inbox - Subtle Actions T-Shirt']")).click();
}

protected void openTShirtPage() throws InterruptedException {
	driver.findElement(By.linkText("SHOP")).click();
    driver.findElement(By.linkText("Men's T-Shirts")).click();
	Thread.sleep(2000);
}

protected void finishCheckOut() throws InterruptedException {
	driver.findElement(By.cssSelector("shop-checkout.style-scope.shop-app.iron-selected.x-scope.shop-checkout-0 div.main-frame.style-scope.shop-checkout iron-pages.style-scope.shop-checkout header.style-scope.shop-checkout.iron-selected shop-button.style-scope.shop-checkout a.style-scope.shop-checkout")).click();
	Thread.sleep(2000);
}

protected void submitTheForms() throws InterruptedException {
	driver.findElement(By.cssSelector("#submitBox > input.style-scope.shop-checkout")).click();
	Thread.sleep(2000);
}

protected void fillInForms() throws InterruptedException {
	driver.findElement(By.id("accountEmail")).clear();
	driver.findElement(By.id("accountEmail")).sendKeys("email@test.com");
	driver.findElement(By.id("accountPhone")).clear();
	driver.findElement(By.id("accountPhone")).sendKeys("9583433455");
	driver.findElement(By.id("shipAddress")).clear();
	driver.findElement(By.id("shipAddress")).sendKeys("Address Test");
	driver.findElement(By.id("shipCity")).clear();
	driver.findElement(By.id("shipCity")).sendKeys("City Test");
	driver.findElement(By.id("shipState")).clear();
	driver.findElement(By.id("shipState")).sendKeys("State Test");
	driver.findElement(By.id("shipZip")).clear();
	driver.findElement(By.id("shipZip")).sendKeys("23456");
	driver.findElement(By.id("ccName")).clear();
	driver.findElement(By.id("ccName")).sendKeys("Mr Jhones");
	driver.findElement(By.id("ccNumber")).clear();
	driver.findElement(By.id("ccNumber")).sendKeys("1234123412341234");
	new Select(driver.findElement(By.id("ccExpMonth"))).selectByVisibleText("Apr");
	new Select(driver.findElement(By.id("ccExpYear"))).selectByVisibleText("2020");
	driver.findElement(By.id("ccCVV")).click();
	driver.findElement(By.id("ccCVV")).clear();
	driver.findElement(By.id("ccCVV")).sendKeys("3356");
	//driver.findElement(By.cssSelector("#submitBox > input.style-scope.shop-checkout")).click();
	Thread.sleep(3000);
	 
}

protected void openCheckout() throws InterruptedException {
	driver.findElement(By.cssSelector("html body shop-app.x-scope.shop-app-0 iron-pages.style-scope.shop-app shop-cart.style-scope.shop-app.x-scope.shop-cart-0.iron-selected div.main-frame.style-scope.shop-cart div.subsection.style-scope.shop-cart div.checkout-box.style-scope.shop-cart shop-button.style-scope.shop-cart a.style-scope.shop-cart")).click();
	Thread.sleep(2000);
}

protected void openTheCart() throws InterruptedException {

	
	driver.findElement(By.xpath("/html/body/shop-app/app-header/div[2]/app-toolbar/div[3]/a/paper-icon-button")).click();
	Thread.sleep(2000);
}



	private void assertTrue(Object elementPresent) {
			// TODO Auto-generated method stub	
		}

	private Object isElementPresent(By xpath) {
			// TODO Auto-generated method stub
			return null;
		}

    private void assertEquals(String title, String string) {
			// TODO Auto-generated method stub
			
		}
	
    
    @AfterTest
	public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      Assert.fail(verificationErrorString);
	    }
	  }

	
}
