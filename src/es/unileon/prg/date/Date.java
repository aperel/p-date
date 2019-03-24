package es.unileon.prg.date;

public class Date {

	private int _day;
	private int _month;
	private int _year;

	public Date(int day, int month, int year) throws DateException{
		this._year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this._month = month;
		}
		//TODO falta comprobar el dia


		if ((day > 0) && (day <= daysOfMonth(month))) {
			this._day = day;
			
		}else{
			throw new DateException("Dia " + day + " no valido" +
					" Valores posibles entre 1 y 31.");
		}
	}

public boolean isSameYear(int year){

 return this._year==year;

}

public boolean isSameMonth(int month){

 return this._month==month;

}

public boolean isSameDay(int day){

 return this._day==day;

}



public boolean isSameYearIf(int year){

boolean igual= false;

	if (year==_year){

	return true;

	}else{

	return false;
	}
}

public boolean isSameMontIf(int month){


boolean igual=false;


	if (month==_month){

	return true;

	}else{

	return false;
	}
}

 public boolean isSameDayIf(int day){

boolean igual=false;

	if (day==_day){

	return true;

	}else{

	return false;
	}

}


 public boolean isSame(Date date){

boolean igual=false;

if((this._year==date.getYear())&& (this._month==date.getMonth()) &&(this._day==date.getDay())){

 igual=true;

}else{
igual=false;
}

return igual;
}


public int getYear(){
return this._year;
}

public  int getMonth(){			
return this._month;
}
public int getDay(){
return this._day;
}


public int monthsAGo(int month){


int resta= 12-month;

return resta;
}

public String toString(Date date) {
		return date.getDay() + "/" + date.getMonth() + "/" + date.getYear();
	}




public String monthsSameDays(){

StringBuilder salida = new StringBuilder();

int diasMes=daysOfMonth(this._month);

for(int i=1; i<=12;i++){

	if(daysOfMonth(i)==diasMes){

	salida.append("\n "+monthName(i));
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


public String getSeasonMonth(int month){

String retorno="ERROR";

switch (month){

	case 1:
	case 2:
	case 3:
	retorno="Invierno";
	break;

	case 4:
	case 5:
	case 6:
	retorno="Primavera";
	break;
	
	case 7:
	case 8:
	case 9:
	retorno="Verano";
	break;


	case 10:
	case 11:
	case 12:
	retorno="Otoño";
	break;

	default:
	System.out.println("mes no valido");
	break;

}

return retorno;
}

private String monthName(int month){

String retorno="ERROR";

	switch (month){

	case 1:
	retorno="Enero";
	break;

	case 2:
	retorno="Febrero";
	break;

	case 3:
	retorno="Marzo";
	break;

	case 4:
	retorno="Abril";
	break;

	case 5:
	retorno="Mayo";
	break; 

	case 6:
	retorno="Junio";
	break;

	case 7:
	retorno="Julio";
	break;

	case 8:
	retorno="Agosto";
	break;

	case 9:
	retorno="Septiembre";
	break;

	case 10:
	retorno="Octubre";
	break;

	case 11:
	retorno="Noviembre";
	break;

	case 12:
	retorno="Diciembre";
	break;


	default:
	System.out.println("mes no valido");
	break;


	}
return retorno;

}

	@Override
	public String toString() {
		return this._day + "/" + this._month + "/" + this._year;
	}

}

