package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
		//TODO falta comprobar el dia


		if ((day > 0) && (day <= daysOfMonth(month))) {
			this.day = day;
			
		}else{
			throw new DateException("Dia " + day + " no valido" +
					" Valores posibles entre 1 y 31.");
		}
	}

	
	public int getYear(){
		return this.year;
		}

		public  int getMonth(){			
		return this.month;
		}
		public int getDay(){
		return this.day;
		}


		public void set_day(int _day) {
			this.day = day;
		}

		public void set_month(int _month) {
			this.month = month;
		}

		public void set_year(int _year) {
			this.year = year;
		}
	
	
	
	
public boolean isSameYear(int year){

 return this.year==year;

}

public boolean isSameMonth(int month){

 return this.month==month;

}

public boolean isSameDay(int day){

 return this.day==day;

}



public boolean isSameYearIf(int year){

boolean igual= false;

	if (this.year==year){

	return true;

	}else{

	return false;
	}
}

public boolean isSameMontIf(int month){


boolean igual=false;


	if (this.month==month){

	return true;

	}else{

	return false;
	}
}

 public boolean isSameDayIf(int day){

boolean igual=false;

	if (this.day==day){

	return true;

	}else{

	return false;
	}

}


 public boolean isSame(Date date){

boolean igual=false;

if((this.year==date.getYear())&& (this.month==date.getMonth()) &&(this.day==date.getDay())){

 igual=true;

}else{
igual=false;
}

return igual;
}




public int getMonthsLeft(int month){


int resta= 12-month;

return resta;
}

/*public String toString(Date date) {
		return date.getDay() + "/" + date.getMonth() + "/" + date.getYear();
	}

*/


public String monthsSameDays(){

StringBuilder salida = new StringBuilder();

int diasMes=daysOfMonth(this.month);

for(int i=1; i<=12;i++){

	if(daysOfMonth(i)==diasMes){

	salida.append("\n "+getMonthName(i));
	}
}
return salida.toString();
}


public String datesOfMonth(){


/*int diasRestantes=daysOfMonth(this._month);

for(int i=this.month;i<=diasRestantes;i++){

	

}

*/
 return null;
}



public int daysOfMonth(int month){

int dias=0;
	switch (month){

	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
	dias=31;
	break;

	case 2:
	dias=28;
	break;

	case 4:
	case 6:
	case 9:
	case 11:
	dias=30;
	break;

	default:
	System.out.println("mes no valido");
	break;
	}




return dias;
}


public String getSeasonName(int month){ 

String retorno="ERROR";

switch (month){

	case 1:
	case 2:
	case 3:
	retorno="Winter";
	break;

	case 4:
	case 5:
	case 6:
	retorno="Spring";
	break;
	
	case 7:
	case 8:
	case 9:
	retorno="Summer";
	break;


	case 10:
	case 11:
	case 12:
	retorno="Autumn";
	break;

	default:
	System.out.println("mes no valido");
	break;

}

return retorno;
}

public String getMonthName(int month){

String retorno="ERROR";

	switch (month){

	case 1:
	retorno="January";
	break;

	case 2:
	retorno="February";
	break;

	case 3:
	retorno="March";
	break;

	case 4:
	retorno="April";
	break;

	case 5:
	retorno="May";
	break; 

	case 6:
	retorno="Juny";
	break;

	case 7:
	retorno="July";
	break;

	case 8:
	retorno="August";
	break;

	case 9:
	retorno="September";
	break;

	case 10:
	retorno="October";
	break;

	case 11:
	retorno="November";
	break;

	case 12:
	retorno="December";
	break;


	default:
	System.out.println("mes no valido");
	break;


	}
return retorno;

}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

}

