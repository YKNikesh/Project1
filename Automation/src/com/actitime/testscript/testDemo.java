package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testDemo {
	@Test
	public void testDemo1(){
	Reporter.log("welcome to testNG",true);
	}
	@Test
	public void testDemo2() {
		Reporter.log("abcds",false);
		}
	
	}
	
}