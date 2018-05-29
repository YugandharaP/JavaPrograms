package com.bridgelabz.dataStructure;

import com.bridgelabz.utility.Utility;

public class Calendar {

	public static void main(String[] args) {
		int date=1;
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		String [] days= {"Sun","Mon","Tues","Wed","Thur","Fri","Sat"};
		Integer[] daysInMonth= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(Utility.isLeapYear(year)==true)
		{
			daysInMonth[2]=29;
		}
		String[][]calendar=new String [6][days.length];
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<6;j++)
			{
				calendar[i][j]=" ";
			}
		}
		if(Utility.isValidDate(month, date, year)==true)
		{
			int day=Utility.dayOfWeek(month, date, year);
			int endDate=daysInMonth[month];
			for(int i=0;i<days.length;i++)
			{
				System.out.println(days[i]);
			}
			System.out.println("\n\n");
			int spaces=0;
			int  count=0;
			for(int i=0;i<calendar.length;i++)
			{
				  if(i==0 )
	                {
	                    for(int k=0;k<day;k++)
	                    {
	                        calendar[i][spaces]="   ";
	                        spaces++;
	                    }
	                }
				  for(spaces=day;spaces<calendar[i].length;spaces++)
	                {   
	                    if(count<=endDate)
	                    {
	                        if(count<=9)
	                        {
	                            calendar[i][spaces]=count+"  ";
	                            count++;
	                        }
	                        else
	                        {
	                            calendar[i][spaces]=count+" ";
	                            count++;
	                        }
	                    }
	                   
	                }
				  day=0;
	            }
	            Utility.printTwoDArray(calendar);
	        }
	        else
	        {
	            System.out.println("Invalid month or year given");
	            return;
	        }
	}
}
