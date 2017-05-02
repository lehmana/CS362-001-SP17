package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";

		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());

	 }

	@Test
	public void test02()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		startHour=40;
		appt.setStartHour(startHour);
		assertEquals(false, appt.getValid());
	}

	@Test
	public void test03()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		startMinute=65;
		appt.setStartMinute(startMinute);
		assertEquals(false, appt.getValid());
	}

	@Test
	public void test04()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=14;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		startDay=34;
		appt.setStartDay(startDay);
		assertEquals(false, appt.getValid());
	}

	@Test
	public void test05()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=8;
		int startYear=2017;
		String title="Birthday Party";
		String description="my descrip";

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		startMonth=13;
		startYear=2018;
		appt.setStartMonth(startMonth);
		appt.setStartYear(startYear);
		assertEquals(false, appt.getValid());
	}

	@Test
	public void test06()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=8;
		int startYear=2017;
		String title="Birthday Party";
		String description="my descrip";

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		title=null;
		description=null;
		appt.setTitle(title);
		assertEquals("", appt.getTitle());
		appt.setDescription(description);
		assertEquals("", appt.getDescription());
	}

	@Test
	public void test07()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=8;
		int startYear=2017;
		String title="Birthday Party";
		String description="my descrip";

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertEquals("\t8/10/2017 at 1:30pm ,Birthday Party, my descrip\n", appt.toString());
	}

	@Test
	public void test08()  throws Throwable  {
		int startHour=0;
		int startMinute=00;
		int startDay=10;
		int startMonth=8;
		int startYear=2017;
		String title="Birthday Party";
		String description="my descrip";

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertEquals("\t8/10/2017 at 12:0am ,Birthday Party, my descrip\n", appt.toString());
	}
	
}
