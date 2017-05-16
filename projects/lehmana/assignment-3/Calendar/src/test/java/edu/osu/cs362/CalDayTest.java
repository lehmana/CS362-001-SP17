package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		 LinkedList<Appt> listAppts = new LinkedList<Appt>();
		 //current month/year/date is today
		 Calendar rightnow = Calendar.getInstance();
		 int thisMonth = rightnow.get(Calendar.MONTH)+1;
		 int thisYear = rightnow.get(Calendar.YEAR);
		 int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);


		 GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);

		 CalDay cal = new CalDay(today);
		 assertEquals(true, cal.isValid());
		 assertEquals(thisDay, cal.getDay());
		 assertEquals(thisMonth, cal.getMonth());
		 assertEquals(thisYear, cal.getYear());
	 }

	@Test
	public void test02()  throws Throwable  {
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		//current month/year/date is today
		Calendar rightnow = Calendar.getInstance();
		int thisMonth = rightnow.get(Calendar.MONTH)+1;
		int thisYear = rightnow.get(Calendar.YEAR);
		int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";

		GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);

		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		CalDay cal = new CalDay(today);
		int size1 = cal.getAppts().size();
		cal.addAppt(appt);
		int size2 = cal.getAppts().size();
		assertTrue(size2 > size1);
		
		assertTrue(appt.getValid());
		Iterator itr = cal.iterator();
		assertEquals(true, cal.isValid());
		assertEquals(1, cal.getSizeAppts());
	}

	@Test
	public void test03()  throws Throwable  {
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		//current month/year/date is today
		Calendar rightnow = Calendar.getInstance();
		int thisMonth = rightnow.get(Calendar.MONTH)+1;
		int thisYear = rightnow.get(Calendar.YEAR);
		int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";

		int otherDay = startDay - 1;
		String othertitle="Birthday Party Planning";
		String otherdescription="This is when I plan my birthday party.";

		GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);

		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		Appt otherappt = new Appt(startHour,
				startMinute ,
				otherDay ,
				startMonth ,
				startYear ,
				othertitle,
				otherdescription);

		CalDay cal = new CalDay(today);
		cal.addAppt(appt);
		cal.addAppt(otherappt);
		//rightnow.CalDay();
		assertEquals(true, cal.isValid());
	}

	@Test
	public void test04()  throws Throwable  {
		Calendar rightnow = Calendar.getInstance();
		int thisMonth = rightnow.get(Calendar.MONTH)+1;
		int thisYear = rightnow.get(Calendar.YEAR);
		int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		int startHour=10;
		int startMinute=00;
		int startDay=10;
		int startMonth=8;
		int startYear=2017;
		String title="Birthday Party";
		String description="my descrip";
		StringBuilder sb = new StringBuilder();

		GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		CalDay cal = new CalDay(today);
		String todayDate = (cal.getMonth()) + "/" + cal.getDay() + "/" + cal.getYear();
		sb.append("\t --- " + todayDate + " --- \n");
		sb.append(" --- -------- Appointments ------------ --- \n");
		sb.append("\n");
		// assertions
		assertEquals(sb.toString(), cal.toString());
	}

	@Test
	public void test05()  throws Throwable  {
		CalDay cal = new CalDay();
		Iterator itr = cal.iterator();
		String test = cal.toString();
		assertEquals(false,cal.valid);

	}

	@Test
	public void test06()  throws Throwable  {
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		//current month/year/date is today
		Calendar rightnow = Calendar.getInstance();
		int thisMonth = rightnow.get(Calendar.MONTH)+1;
		int thisYear = rightnow.get(Calendar.YEAR);
		int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		int startHour=13;
		int startMinute=30;
		int startDay=-5;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";

		GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);

		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		CalDay cal = new CalDay(today);
		cal.addAppt(appt);
		//assertEquals(true, cal.isValid());
	}

	@Test
	public void test07()  throws Throwable  {
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		//current month/year/date is today
		Calendar rightnow = Calendar.getInstance();
		int thisMonth = rightnow.get(Calendar.MONTH)+1;
		int thisYear = rightnow.get(Calendar.YEAR);
		int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		int startHour=13;
		int startMinute=30;
		int startDay=5;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";

		GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);

		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		Appt appt2 = new Appt(startHour-2,
				startMinute+10 ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		CalDay cal = new CalDay(today);
		cal.addAppt(appt);
		cal.addAppt(appt2);
		assertTrue(cal.isValid());
		String test = cal.toString();
		//assertEquals(true, cal.isValid());
	}
}
