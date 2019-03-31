package es.unileon.prg.date;

public class MainDate {

	public static void main(String[] args) {

		Date today;
		Date fecha;
		try {
			today = new Date(1, 1, 2017);
			fecha = new Date(15, 2, 2014);
			System.out.println(today.monthsSameDays());
			System.out.println(today.getDay()+today.getMonth()+today.getYear());

			System.out.println(today.isSameDay(1));
			System.out.println(today.isSameDay(2));

			System.out.println(today.isSameMonth(1));
			System.out.println(today.isSameMonth(2));
			
			System.out.println(today.isSameYear(2017));
			System.out.println(today.isSameYear(2012));
			
			
			System.out.println(today.isSame(fecha));
			
			
			
			
			
			
			
			System.out.println(today.getMonthName(1));
			System.out.println(today.getMonthName(2));
			System.out.println(today.getMonthName(3));
			System.out.println(today.getMonthName(4));
			System.out.println(today.getMonthName(5));
			System.out.println(today.getMonthName(6));
			System.out.println(today.getMonthName(7));
			System.out.println(today.getMonthName(8));
			System.out.println(today.getMonthName(9));
			System.out.println(today.getMonthName(10));
			System.out.println(today.getMonthName(11));
			System.out.println(today.getMonthName(12));

			System.out.println(today.getSeasonName(3));
			System.out.println(today.getSeasonName(5));
			System.out.println(today.getSeasonName(9));
			System.out.println(today.getSeasonName(11));

			System.out.println(today.getMonthsLeft(10));

			
			
			System.out.println(today.toString());

		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}

