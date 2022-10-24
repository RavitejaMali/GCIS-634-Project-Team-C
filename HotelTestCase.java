import static org.junit.Assert.*;

import org.junit.Test;

public class HotelTestCase {
	Hotel ht=new Hotel();
	Hotel ht2=new Hotel();
	Hotel ht3=new Hotel();
	Hotel ht4=new Hotel();

	@Test
	public void testObject() {
		//Customer Details Test Cases
	//	ht.CustDetails(1, 1);
		
		ht.CustDetails(2, 5);
		
		ht.CustDetails(3, 9);
		
		ht.CustDetails(4, 11);
		
		//Booking rooms Test Cases
		ht.bookroom(1);
		
		ht.bookroom(2);
		ht.bookroom(3);
		ht.bookroom(4);
		
		
	
		//Features Test Cases
		ht.features(3);
		
		ht.features(1);
	
		ht.features(2);
		
		ht.features(4);
		
		ht.features(5);
		
	
		
		//ht.bookroom(3);
		
		//Availability Test Cases
		ht.availability(2);
		
		ht.availability(1);
		
		ht.availability(3);
		
		ht.availability(4);
		ht.availability(5);
		
		
		
		//Deallocate test cases
		
		ht.deallocate(0, 1);
		ht.deallocate(0, 2);
		ht.deallocate(0, 3);
		ht.deallocate(0, 4);
		
		
		
	//bIll
		
		ht2.order(1, 1);
		ht2.order(7, 2);
		ht2.order(3, 3);
		
		
		ht2.order(2, 10);
		
	
	//Bill test cases
		
		
		ht.bill(1,6);
		//ht.bill(2, 2);
	
	}	
	
	
	
	
	
	
}
