// package edu.osu.cs362;
//
//
// import org.junit.Test;
//
//
// import static org.junit.Assert.*;
//
// import java.util.Calendar;
// import java.util.GregorianCalendar;
// import java.util.Random;
//
//
//
// /**
//  * Random Test Generator  for CalDay class.
//  */
//
// public class CalDayRandomTest {
// 	private static final long TestTimeout = 60 * 500 *1;
// 	private static final int NUM_TESTS=100;
//     /**
//      * Generate Random Tests that tests CalDay Class.
//      */
// 	 @Test
// 	  public void radnomtest()  throws Throwable  {
// 			long startTime = Calendar.getInstance().getTimeInMillis();
//  		  long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
//
//
//  		  System.out.println("Start testing calDay...");
// 			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
// 				long randomseed =10;//System.currentTimeMillis();
// 				//			System.out.println(" Seed:"+randomseed );
// 				Random random = new Random(randomseed);
//
// 				Calendar rightnow = Calendar.getInstance();
// 				int thisMonth = rightnow.get(Calendar.MONTH);
// 				int thisYear = rightnow.get(Calendar.YEAR);
// 				int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
// 				GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
// 				CalDay cal = new CalDay(today);
//
// 				for (int i = 0; i < NUM_TESTS; i++) {
// 					int min = (int) ValuesGenerator.getRandomIntBetween(random,-5,59);
// 					int hour = (int) ValuesGenerator.getRandomIntBetween(random,-5,23);
// 					int day = (int) ValuesGenerator.getRandomIntBetween(random,thisDay,31);
// 					int month = (int) ValuesGenerator.getRandomIntBetween(random,thisMonth,12);
//
// 					String title=(String) ValuesGenerator.getString(random);
// 					String desc = (String) ValuesGenerator.getString(random);
//
// 					Appt appt = new Appt(hour,min,day,month,thisYear,title,desc);
// 					cal.addAppt(appt);
// 				}
// 				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
// 				if((iteration%10000)==0 && iteration!=0 )
// 					System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
// 			}
// 			System.out.println("Done testing...");
// 	 }
//
//
//
// }
