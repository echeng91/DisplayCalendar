import java.util.Scanner;
import java.util.Calendar;

public class DisplayCalendar {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int userMonth, userYear;
		System.out.print("Enter the month: ");
		userMonth = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the year: ");
		userYear = sc.nextInt();
		sc.nextLine();
		sc.close();
		Calendar userCalendar = Calendar.getInstance();
		userCalendar.set(userYear, userMonth - 1, 1);
		int dayOfWeek = userCalendar.get(Calendar.DAY_OF_WEEK);
		int daysInMonth = userCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.print("\n\t\t");
		switch(userMonth)
		{
		case 1: System.out.print("January");
			break;
		case 2: System.out.print("February");
			break;
		case 3: System.out.print("March");
			break;
		case 4: System.out.print("April");
			break;
		case 5: System.out.print("May");
			break;
		case 6: System.out.print("June");
			break;
		case 7: System.out.print("July");
			break;
		case 8: System.out.print("August");
			break;
		case 9: System.out.print("September");
			break;
		case 10: System.out.print("October");
			break;
		case 11: System.out.print("November");
			break;
		case 12: System.out.print("December");
			break;
		}
		System.out.println("\t" + userYear + "\n");
		
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
		int position = 1;
		int dayNumber = 0;
		while(dayNumber < daysInMonth)
		{
			if(position < dayOfWeek)
			{
				System.out.print("\t");
			}
			else
			{
				dayNumber++;
				System.out.print(dayNumber + "\t");
			}
			if(position % 7 == 0)
			{
				System.out.println("\n");
			}
			position++;
		}
	}
}
