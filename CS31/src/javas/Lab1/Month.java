//package Lab4;
//import java.util.*;
//
//
//public class Month4 {
//	
//	private int monthNumber;
//	String[] monthName = { "January", "Februry", "March",
//            "April", "May", "June", "July", "August", "September",
//            "October", "November", "December" };
//	
//	public Month()
//	{
//		monthNumber = 1;
//	}
//	
//	public Month(int inputMonth)
//	{
//		if (inputMonth >= 1 && inputMonth <= 12)
//		{
//			monthNumber = inputMonth;
//		}
//		else
//		{
//			monthNumber = 1;
//		}
//	}
//	
//	public Month(String monthName)
//	{
//		if (monthName== "January") {monthNumber = 1;}
//		else if (monthName == "February") {monthNumber = 2;}
//		else if (monthName == "March") {monthNumber = 3;}
//		else if (monthName == "April") {monthNumber = 4;}
//		else if (monthName == "May") {monthNumber = 5;}
//		else if (monthName == "June") {monthNumber = 6;}
//		else if (monthName == "July") {monthNumber = 7;}
//		else if (monthName == "August") {monthNumber = 8;}
//		else if (monthName == "September") {monthNumber = 9;}
//		else if (monthName == "October") {monthNumber = 10;}
//		else if (monthName == "November") {monthNumber = 11;}
//		else if (monthName == "December") {monthNumber = 12;}
//		else {monthNumber = 1;}
//	}
//	
//	public void setMonthNumber(int inputMonth)
//	{
//		if (inputMonth >= 1 && inputMonth <= 12)
//		{
//			monthNumber = inputMonth;
//		}
//		else
//		{
//			monthNumber = 1;
//		}
//	}
//	
//	public int getMonthNumber()
//	{
//		return (monthNumber);
//	}
//	
//	public String getMonthName(int monthNumber)
//	{
//		if (monthNumber == 1) {return ("January");}
//		else if (monthNumber == 2) {return ("February");}
//		else if (monthNumber == 2) {return ("March");}
//		else if (monthNumber == 2) {return ("April");}
//		else if (monthNumber == 2) {return ("May");}
//		else if (monthNumber == 2) {return ("June");}
//		else if (monthNumber == 2) {return ("July");}
//		else if (monthNumber == 2) {return ("August");}
//		else if (monthNumber == 2) {return ("September");}
//		else if (monthNumber == 2) {return ("October");}
//		else if (monthNumber == 2) {return ("November");}
//		else if (monthNumber == 2) {return ("December");}
//		else {return ("No clue");}
//	}
//	
//	public String toString()
//	{
//		return getMonthName(monthNumber);
//	}
//	
//	public void equals(Month number)
//	{
//		if (number.getMonthNumber() == monthNumber)
//	}
//	
//
//}
