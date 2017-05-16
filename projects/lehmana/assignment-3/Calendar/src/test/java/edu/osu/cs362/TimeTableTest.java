package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		 LinkedList<Appt> listAppts = new LinkedList<Appt>();
		 //current month/year/date is today
		 Calendar rightnow = Calendar.getInstance();
		 int thisMonth = rightnow.get(Calendar.MONTH)+1;
		 int thisYear = rightnow.get(Calendar.YEAR);
		 int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		 int startHour=13;
		 int startMinute=30;
		 int startDay=thisDay+1;
		 int startMonth=thisMonth;
		 int startYear=thisYear;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 int otherDay = startDay - 1;
		 String othertitle="Birthday Party Planning";
		 String otherdescription="This is when I plan my birthday party.";

		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

		 Appt otherappt = new Appt(startHour+1,
				 startMinute+20 ,
				 otherDay ,
				 startMonth ,
				 startYear ,
				 othertitle,
				 otherdescription);

		 listAppts.add(appt);
		 listAppts.add(otherappt);
		 GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		 GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		 tomorrow.add(Calendar.DAY_OF_MONTH,5);
		 TimeTable timeTable=new TimeTable();
		 calDays=timeTable.getApptRange(listAppts,today,tomorrow);
		 //GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);

		 CalDay cal = new CalDay(today);
		 cal.addAppt(appt);
		 cal.addAppt(otherappt);
		 listAppts = timeTable.deleteAppt(listAppts,appt);
		 assertEquals(true, cal.isValid());
		 assertEquals(thisDay, cal.getDay());
		 assertEquals(thisMonth, cal.getMonth());
		 assertEquals(thisYear, cal.getYear());
	 }

	@Test
	public void test02()  throws Throwable  {
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		Calendar rightnow = Calendar.getInstance();
		int thisMonth = rightnow.get(Calendar.MONTH)+1;
		int thisYear = rightnow.get(Calendar.YEAR);
		int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		int startHour=13;
		int startMinute=30;
		int startDay=thisDay+1;
		int startMonth=thisMonth-1;
		int startYear=thisYear;
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

		GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(Calendar.DAY_OF_MONTH,-5);
		TimeTable timeTable=new TimeTable();

		//calDays=timeTable.getApptRange(listAppts,today,tomorrow);

		try {
			calDays=timeTable.getApptRange(listAppts,today,tomorrow);

		} catch (java.lang.IllegalArgumentException name) {

		}



		// assertions
		//assertTrue(appt.getValid());
		//assertEquals(13, appt.getStartHour());
	}

	@Test
	public void test03()  throws Throwable  {
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		Calendar rightnow = Calendar.getInstance();
		int thisMonth = rightnow.get(Calendar.MONTH)+1;
		int thisYear = rightnow.get(Calendar.YEAR);
		int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		int startHour=13;
		int startMinute=30;
		int startDay=thisDay+1;
		int startMonth=thisMonth-1;
		int startYear=thisYear;
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

		GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(Calendar.DAY_OF_MONTH,5);
		TimeTable timeTable=new TimeTable();

		//calDays=timeTable.getApptRange(listAppts,today,tomorrow);

		try {
			calDays=timeTable.getApptRange(listAppts,today,tomorrow);

		} catch (java.lang.IllegalArgumentException name) {

		}



		// assertions
		//assertTrue(appt.getValid());
		//assertEquals(13, appt.getStartHour());
	}

	@Test
	public void test04()  throws Throwable  {
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		//current month/year/date is today
		Calendar rightnow = Calendar.getInstance();
		int thisMonth = rightnow.get(Calendar.MONTH)+1;
		int thisYear = rightnow.get(Calendar.YEAR);
		int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		int startHour=13;
		int startMinute=30;
		int startDay=thisDay+1;
		int startMonth=thisMonth;
		int startYear=thisYear;
		String title="Birthday Party";
		String description="This is my birthday party.";
		int otherDay = startDay - 1;
		String othertitle="Birthday Party Planning";
		String otherdescription="This is when I plan my birthday party.";

		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		Appt otherappt = new Appt(startHour+1,
				startMinute+20 ,
				otherDay ,
				startMonth ,
				startYear ,
				othertitle,
				otherdescription);
		startMinute = 80;

		Appt badappt = new Appt(startHour+1,
				startMinute ,
				otherDay ,
				startMonth ,
				startYear ,
				othertitle,
				otherdescription);

		listAppts.add(appt);
		listAppts.add(otherappt);
		listAppts.add(badappt);
		GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(Calendar.DAY_OF_MONTH,5);
		TimeTable timeTable=new TimeTable();
		calDays=timeTable.getApptRange(listAppts,today,tomorrow);
		//GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);

		CalDay cal = new CalDay(today);
		appt = null;
		listAppts = timeTable.deleteAppt(listAppts,appt);
		timeTable.deleteAppt(listAppts,badappt);
		listAppts = null;
		timeTable.deleteAppt(listAppts,otherappt);


	}

}
