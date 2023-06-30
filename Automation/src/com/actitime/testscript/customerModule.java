package com.actitime.testscript;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class customerModule {
	public class TaskModule {
		@Test(priority =1,invocationCount=3)
		public void createTask() {
		Reporter.log("createTask",true);
		}
		@Test(dependsOnMethods ="createTask")
		public void modifyTask() {
		Reporter.log("modifyTask",true);
		}
		@Test(dependsOnMethods= {"createTask","modifyTask"})
		public void deleteTask() {
		assert.fail();
		
		
		}
		}
	}
	
	
	
	
	
	


