package edu.osu.cs362;


import org.junit.Test;


import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.LinkedList;



/**
 * Random Test Generator  for CalDay class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 100 *1;
	private static final int NUM_TESTS=100;
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void randomtest()  throws Throwable  {
			long startTime = Calendar.getInstance().getTimeInMillis();
 		  long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


 		  System.out.println("Start testing timeTable...");
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =10;//System.currentTimeMillis();
				//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);

				LinkedList<Appt> listAppts = new LinkedList<Appt>();
				LinkedList<Appt> nullAppts = new LinkedList<Appt>();
				nullAppts = null;
				Calendar rightnow = Calendar.getInstance();
				int thisMonth = rightnow.get(Calendar.MONTH);
				int thisYear = rightnow.get(Calendar.YEAR);
				int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
				int thisMin = rightnow.get(Calendar.MINUTE);
				int thisHour = rightnow.get(Calendar.HOUR_OF_DAY);
				String testTitle = (String) ValuesGenerator.getString(random);
				String testDesc = (String) ValuesGenerator.getString(random);
				Appt appt1 = new Appt(thisHour,thisMin,thisDay,thisMonth,thisYear,testTitle,testDesc);
				Appt appt2 = new Appt(thisHour,thisMin,thisDay,thisMonth,thisYear,testTitle,testDesc);
				listAppts.add(appt1);
				TimeTable timeTable = new TimeTable();

				for (int i = 0; i < NUM_TESTS; i++) {
					int min = (int) ValuesGenerator.getRandomIntBetween(random,-5,59);
					int hour = (int) ValuesGenerator.getRandomIntBetween(random,-5,23);
					int day = (int) ValuesGenerator.getRandomIntBetween(random,thisDay,31);
					int month = (int) ValuesGenerator.getRandomIntBetween(random,thisMonth,12);
					String title=(String) ValuesGenerator.getString(random);
					String desc = (String) ValuesGenerator.getString(random);

					appt2 = new Appt(hour,min,day,month,thisYear,title,desc);
					listAppts.add(appt2);
				}

				listAppts = timeTable.deleteAppt(listAppts,appt1);
				nullAppts = timeTable.deleteAppt(nullAppts,appt1);
				appt2 = null;
				nullAppts = timeTable.deleteAppt(nullAppts,appt2);
				listAppts = timeTable.deleteAppt(listAppts,appt2);

				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				if((iteration%10000)==0 && iteration!=0 )
					System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			}
			System.out.println("Done testing...");
	 }



}
