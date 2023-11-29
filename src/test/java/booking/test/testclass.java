package booking.test;

import org.testng.annotations.Test;

import booking.baseclass.Baseclass;
import booking.page.pageclass;

public class testclass extends Baseclass {
	
	
	@Test
	public void test() {
		pageclass b = new pageclass(driver);
		b.destination();
		b.checkinoutDetails();
		b.personalData();
		b.search();
	}
	

} 
		
		
	
