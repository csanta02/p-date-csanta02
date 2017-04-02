public class Date{

//Definir las variables.
private int day;
private int month;
private int year;

//Constructor.
public Date(int _day, int _month, int _year) throws DateException{

this.day=_day;
if(month > 0 && month <= 12) {this.month=_month;}
else{throw new DateException ("Mes" + month + "no valido." + "\nValores posibles entre 1 y 2");}
this.year=_year;

}

public String toString (){
return this.day + "/" + this.month + "/" + this.year;
}

//Métodos get.
public int getDay(){
		return this.day;
	}

public int getMonth(){
		return this.month;
	}

public int getYear(){
		return this.year;
	}


//Crear los métodos isSame utilizando if. 
public boolean isSameYear(Date another){ 
	if(this.year == another.getYear()){System.out.println("Es el mismo año.\n");
	return this.year == another.getYear();}
	else{System.out.println("No es el mismo año.\n");
	return this.year != another.getYear();}
}

public boolean isSameMonth(Date another){ 
	if(this.month == another.getMonth()){System.out.println("Es el mismo mes.\n");
	return this.month == another.getMonth();}
	else{System.out.println("No es el mismo mes.\n");
	return this.month != another.getMonth();}
}

public boolean isSameDay(Date another){ 
	if(this.day == another.getDay()){System.out.println("Es el mismo día.\n");
	return this.day == another.getDay();}
	else{System.out.println("No es el mismo día.\n");
	return this.day != another.getDay();}
}

public boolean isSame(Date another){ 
	if(this.day == another.getDay() && this.month == another.getMonth() && this.year == another.getYear()){System.out.println("Es la misma fecha.\n");
	return this.day == another.getDay() && this.month == another.getMonth() && this.year == another.getYear();}
	else{System.out.println("No es la misma fecha.\n");
	return this.day != another.getDay() || this.month != another.getMonth() || this.year != another.getYear();}
}

}
