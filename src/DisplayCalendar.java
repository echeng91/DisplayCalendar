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
		System.out.println("\n");
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
		int position = 1;
		int dayNumber = 0;
		while(dayNumber <= daysInMonth)
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
