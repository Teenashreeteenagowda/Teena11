package test_java;
import org.testng.Assert;

import teena.App;

public class Apptest {
	
	public void test1()
	{
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("Teena", "Shree56"));
	}
		
		public void test2()
		{
			App myapp=new App();
			Assert.assertEquals(1,myapp.userLogin("Teena", "Shree56"));
			
		}
	}
