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

//Crear los métodos isSame utilizando métodos diferentes.
//Empleando while.
/*public boolean isSameYear(Date another){
	while(this.year == another.getYear()){System.out.println("Es el mismo año.\n");}
	return this.year == another.getYear();
}

//Empleando do while.
public boolean isSameMonth(Date another){
	do{System.out.println("Es el mismo mes.\n");}while(this.month == another.getMonth());
	return this.month == another.getMonth();
}
//Empleando equals.
public boolean isSameDay(Date another){
int day1 = this.day;
int day2 = another.getDay();
day1.equals(day2);
return this.day == another.getDay();
}
public boolean isSame(Date another){
return this.day == another.getDay() && this.month == another.getMonth() && this.year == another.getYear();}*/

//Método que imprima el nombre del mes.
private String nameM;
public String nameMonth(){
	int j = this.month;
	switch(j){
		case 1: System.out.println("Enero\n");
			break;
		case 2: System.out.println("Febrero\n");
			break;
		case 3: System.out.println("Marzo\n");
			break;
		case 4: System.out.println("Abril\n");
			break;
		case 5: System.out.println("Mayo\n");
			break;
		case 6: System.out.println("Junio\n");
			break;
		case 7: System.out.println("Julio\n");
			break;
		case 8: System.out.println("Agosto\n");
			break;
		case 9: System.out.println("Septiembre\n");
			break;
		case 10: System.out.println("Octubre\n");
			break;
		case 11: System.out.println("Noviembre\n");
			break;
		case 12: System.out.println("Diciembre\n");
			break;
	}
return nameM;
}

//Método que indique si el día pertenece al mes.
private String dayOfTheM;
public String dayOfTheMonth(){
	int j = this.month;
	switch(j){
		case 1: if(this.day > 0 && this.day <= 31){System.out.println("El día pertenece al mes de Enero.\n");}
			else{System.out.println("El día no pertenece al mes de Enero, debe encontrarse entre 1 y 31.\n");}
			break;
		case 2: if(this.year % 4 == 0 && (this.year % 100 != 0 || this.year % 400 == 0)){
				if(this.day > 0 && this.day <= 29){System.out.println("El día pertenece al mes de Febrero.\n");}
				else{System.out.println("El día no pertenece al mes de Febrero, debe encontrarse entre 1 y 29.\n");}
			}else{
				if(this.day > 0 && this.day <= 28){System.out.println("El día pertenece al mes de Febrero.\n");}
				else{System.out.println("El día no pertenece al mes de Febrero, debe encontrarse entre 1 y 28.\n");}
			}
			break;
		case 3: if(this.day > 0 && this.day <= 31){System.out.println("El día pertenece al mes de Marzo.\n");}
			else{System.out.println("El día no pertenece al mes de Marzo, debe encontrarse entre 1 y 31.\n");}
			break;
		case 4: if(this.day > 0 && this.day <= 30){System.out.println("El día pertenece al mes de Abril.\n");}
			else{System.out.println("El día no pertenece al mes de Abril, debe encontrarse entre 1 y 30.\n");}
			break;
		case 5: if(this.day > 0 && this.day <= 31){System.out.println("El día pertenece al mes de Mayo.\n");}
			else{System.out.println("El día no pertenece al mes de Mayo, debe encontrarse entre 1 y 31.\n");}
			break;
		case 6: if(this.day > 0 && this.day <= 30){System.out.println("El día pertenece al mes de Junio.\n");}
			else{System.out.println("El día no pertenece al mes de Junio, debe encontrarse entre 1 y 30.\n");}
			break;
		case 7: if(this.day > 0 && this.day <= 31){System.out.println("El día pertenece al mes de Julio.\n");}
			else{System.out.println("El día no pertenece al mes de Julio, debe encontrarse entre 1 y 31.\n");}
			break;
		case 8: if(this.day > 0 && this.day <= 31){System.out.println("El día pertenece al mes de Agosto.\n");}
			else{System.out.println("El día no pertenece al mes de Agosto, debe encontrarse entre 1 y 31.\n");}
			break;
		case 9: if(this.day > 0 && this.day <= 30){System.out.println("El día pertenece al mes de Septiembre.\n");}
			else{System.out.println("El día no pertenece al mes de Septiembre, debe encontrarse entre 1 y 30.\n");}
			break;
		case 10: if(this.day > 0 && this.day <= 31){System.out.println("El día pertenece al mes de Octubre.\n");}
			else{System.out.println("El día no pertenece al mes de Octubre, debe encontrarse entre 1 y 31.\n");}
			break;
		case 11: if(this.day > 0 && this.day <= 30){System.out.println("El día pertenece al mes de Noviembre.\n");}
			else{System.out.println("El día no pertenece al mes de Noviembre, debe encontrarse entre 1 y 30.\n");}
			break;
		case 12: if(this.day > 0 && this.day <= 31){System.out.println("El día pertenece al mes de Diciembre.\n");}
			else{System.out.println("El día no pertenece al mes de Diciembre, debe encontrarse entre 1 y 31.\n");}
			break;
	}
return dayOfTheM;
}

//Método que indique a que estación pertenece cada mes.
private String season;
public String yearSeason(){
int j = this.month;
	switch(j){
		case 1: System.out.println("Invierno\n");
			break;
		case 2: System.out.println("Invierno\n");
			break;
		case 3: System.out.println("Primavera\n");
			break;
		case 4: System.out.println("Primavera\n");
			break;
		case 5: System.out.println("Primavera\n");
			break;
		case 6: System.out.println("Verano\n");
			break;
		case 7: System.out.println("Verano\n");
			break;
		case 8: System.out.println("Verano\n");
			break;
		case 9: System.out.println("Otoño\n");
			break;
		case 10: System.out.println("Otoño\n");
			break;
		case 11: System.out.println("Otoño\n");
			break;
		case 12: System.out.println("Invierno\n");
			break;
	}
return season;
}

//Método que indique cuantos meses faltan para el fin del año desde un mes dado. 
private int monthsUntilEnd;
public int monthsUntilEndOfYear(){
int mes = 0;
for(int i = this.month; i <= 12; i++){
mes = mes + 1;
}
System.out.println("Quedan " + mes + "meses.\n");
return monthsUntilEnd;
}

//Método que imprima una fecha.
public String printDate (){
return this.day + "/" + this.month + "/" + this.year;
}

//Método que desde una fecha imprima todas las fechas hasta el fin del mes.
public String printDatesUntilEndMonth(){
int j = this.month;
int i;
int dias = 0;
	switch(j){
		case 1: if(this.day > 0 && this.day <= 31){for(i = this.day; i <= 31; i++){dias = dias + 1;
			System.out.println(dias + "/" + this.month + "/" + this.year);}}
			else{System.out.println("El día no pertenece al mes de Enero, debe encontrarse entre 1 y 31.\n");}
			break;
		case 2: if(this.year % 4 == 0 && (this.year % 100 != 0 || this.year % 400 == 0)){
				if(this.day > 0 && this.day <= 29){for(i = this.day; i <= 29; i++){dias = dias + 1;
				System.out.println(dias + "/" + this.month + "/" + this.year);}}
				else{System.out.println("El día no pertenece al mes de Febrero, debe encontrarse entre 1 y 29.\n");}
			}else{
				if(this.day > 0 && this.day <= 28){for(i = this.day; i <= 28; i++){dias = dias + 1;
				System.out.println(dias + "/" + this.month + "/" + this.year);}}
				else{System.out.println("El día no pertenece al mes de Febrero, debe encontrarse entre 1 y 28.\n");}
			}
			break;
		case 3: if(this.day > 0 && this.day <= 31){for(i = this.day; i <= 31; i++){dias = dias + 1;
			System.out.println(dias + "/" + this.month + "/" + this.year);}}
			else{System.out.println("El día no pertenece al mes de Marzo, debe encontrarse entre 1 y 31.\n");}
			break;
		case 4: if(this.day > 0 && this.day <= 30){for(i = this.day; i <= 30; i++){dias = dias + 1;
			System.out.println(dias + "/" + this.month + "/" + this.year);}}
			else{System.out.println("El día no pertenece al mes de Abril, debe encontrarse entre 1 y 30.\n");}
			break;
		case 5: if(this.day > 0 && this.day <= 31){for(i = this.day; i <= 31; i++){dias = dias + 1;
			System.out.println(dias + "/" + this.month + "/" + this.year);}}
			else{System.out.println("El día no pertenece al mes de Mayo, debe encontrarse entre 1 y 31.\n");}
			break;
		case 6: if(this.day > 0 && this.day <= 30){for(i = this.day; i <= 30; i++){dias = dias + 1;
			System.out.println(dias + "/" + this.month + "/" + this.year);}}
			else{System.out.println("El día no pertenece al mes de Junio, debe encontrarse entre 1 y 30.\n");}
			break;
		case 7: if(this.day > 0 && this.day <= 31){for(i = this.day; i <= 31; i++){dias = dias + 1;
			System.out.println(dias + "/" + this.month + "/" + this.year);}}
			else{System.out.println("El día no pertenece al mes de Julio, debe encontrarse entre 1 y 31.\n");}
			break;
		case 8: if(this.day > 0 && this.day <= 31){for(i = this.day; i <= 31; i++){dias = dias + 1;
			System.out.println(dias + "/" + this.month + "/" + this.year);}}
			else{System.out.println("El día no pertenece al mes de Agosto, debe encontrarse entre 1 y 31.\n");}
			break;
		case 9: if(this.day > 0 && this.day <= 30){for(i = this.day; i <= 30; i++){dias = dias + 1;
			System.out.println(dias + "/" + this.month + "/" + this.year);}}
			else{System.out.println("El día no pertenece al mes de Septiembre, debe encontrarse entre 1 y 30.\n");}
			break;
		case 10: if(this.day > 0 && this.day <= 31){for(i = this.day; i <= 31; i++){dias = dias + 1;
			System.out.println(dias + "/" + this.month + "/" + this.year);}}
			else{System.out.println("El día no pertenece al mes de Octubre, debe encontrarse entre 1 y 31.\n");}
			break;
		case 11: if(this.day > 0 && this.day <= 30){for(i = this.day; i <= 30; i++){dias = dias + 1;
			System.out.println(dias + "/" + this.month + "/" + this.year);}}
			else{System.out.println("El día no pertenece al mes de Noviembre, debe encontrarse entre 1 y 30.\n");}
			break;
		case 12: if(this.day > 0 && this.day <= 31){for(i = this.day; i <= 31; i++){dias = dias + 1;
			System.out.println(dias + "/" + this.month + "/" + this.year);}}
			else{System.out.println("El día no pertenece al mes de Diciembre, debe encontrarse entre 1 y 31.\n");}
			break;
	}
return this.day + "/" + this.month + "/" + this.year;
}

//Meses con el mismo número de días que el mes dado. 
private String monthsSameDay;
public String monthsSameDays(){
int j = this.month;
	switch(j){
		case 1: System.out.println("Enero tiene el mismo número de días que marzo, mayo, julio, agosto, octubre y diciembre.\n");
			break;
		case 2: System.out.println("No hay ningún mes con el mismo número de días que febrero.\n");
			break;
		case 3: System.out.println("Marzo tiene el mismo número de días que enero, mayo, julio, agosto, octubre y diciembre.\n");
			break;
		case 4: System.out.println("Abril tiene el mismo número de días que junio, septiembre y noviembre.\n");
			break;
		case 5: System.out.println("Mayo tiene el mismo número de días que enero, marzo, julio, agosto, octubre y diciembre.\n");
			break;
		case 6: System.out.println("Junio tiene el mismo número de días que abril, septiembre y noviembre.\n");
			break;
		case 7: System.out.println("Julio tiene el mismo número de días que enero, marzo, mayo, agosto, octubre y diciembre.\n");
			break;
		case 8: System.out.println("Agosto tiene el mismo número de días que enero, marzo, mayo, julio, octubre y diciembre.\n");
			break;
		case 9: System.out.println("Septiembre tiene el mismo número de días que abril, junio y noviembre.\n");
			break;
		case 10: System.out.println("Octubre tiene el mismo número de días que enero, marzo, mayo, julio, agosto y diciembre.\n");
			break;
		case 11: System.out.println("Noviembre tiene el mismo número de días que abril, junio y septiembre.\n");
			break;
		case 12: System.out.println("Diciembre tiene el mismo número de días que enero, marzo, mayo, julio, agosto y octubre.\n");
			break;
	}
return monthsSameDay;
}

//Método que cuente los días desde el inicio del año hasta una fecha.

public int daysSinceBeginOfYear(){
int dias = 0; 
int meses = 0;
int total; 
for(int i = 0; i <= this.day; i++){dias = dias + 1;}
for(int j = 0; j <= this.month; j++){meses = meses + 1;}
total = meses + dias; 

return total;
}

//Generar una fecha aleatoria igual a otra dentro del mismo año utilizando while.
public int randomDate(){
int dia = (int) Math.random() * 31;
int mes = (int) Math.random() * 12;
int contador = 0;
while(dia != this.day && mes != this.month){
contador = contador + 1;
}
return contador;
}

//Generar una fecha aleatoria igual a otra dentro del mismo año utilizando do while. 
public int randomDateDoWhile(){
int dia = (int) Math.random() * 31;
int mes = (int) Math.random() * 12;
int contador = 0;
do{contador = contador + 1;
}while(dia != this.day && mes != this.month);
return contador;
}

//Día de la semana para una fecha dada.
private String dayWeekYear;
public String dayWeek(){
int j = this.day % 7;
int i = this.month;
switch(i){case 1: switch(j){
			case 1: System.out.println("Domingo");
				break;
			case 2: System.out.println("Lunes");
				break;
			case 3: System.out.println("Martes");
				break;
			case 4: System.out.println("Miercoles");
				break;
			case 5: System.out.println("Jueves");
				break;
			case 6: System.out.println("Viernes");
				break;
			case 7: System.out.println("Sabado");
				break;
			}
		break;
		case 2: switch(j){
			case 1: System.out.println("Miercoles");
				break;
			case 2: System.out.println("Jueves");
				break;
			case 3: System.out.println("Viernes");
				break;
			case 4: System.out.println("Sabado");
				break;
			case 5: System.out.println("Domingo");
				break;
			case 6: System.out.println("Lunes");
				break;
			case 7: System.out.println("Martes");
				break;
			}
			break;
		case 3: switch(j){
			case 1: System.out.println("Miercoles");
				break;
			case 2: System.out.println("Jueves");
				break;
			case 3: System.out.println("Viernes");
				break;
			case 4: System.out.println("Sabado");
				break;
			case 5: System.out.println("Domingo");
				break;
			case 6: System.out.println("Lunes");
				break;
			case 7: System.out.println("Martes");
				break;
			}
			break;
		case 4:  switch(j){
			case 1: System.out.println("Sabado");
				break;
			case 2: System.out.println("Domingo");
				break;
			case 3: System.out.println("Lunes");
				break;
			case 4: System.out.println("Martes");
				break;
			case 5: System.out.println("Miercoles");
				break;
			case 6: System.out.println("Jueves");
				break;
			case 7: System.out.println("Viernes");
				break;
			}
			break;
		case 5:  switch(j){
			case 1: System.out.println("Lunes");
				break;
			case 2: System.out.println("Martes");
				break;
			case 3: System.out.println("Miercoles");
				break;
			case 4: System.out.println("Jueves");
				break;
			case 5: System.out.println("Viernes");
				break;
			case 6: System.out.println("Sabado");
				break;
			case 7: System.out.println("Domingo");
				break;
			}
			break;
		case 6:  switch(j){
			case 1: System.out.println("Jueves");
				break;
			case 2: System.out.println("Viernes");
				break;
			case 3: System.out.println("Sabado");
				break;
			case 4: System.out.println("Domingo");
				break;
			case 5: System.out.println("Lunes");
				break;
			case 6: System.out.println("Martes");
				break;
			case 7: System.out.println("Miercoles");
				break;
			}
			break;
		case 7: switch(j){
			case 1: System.out.println("Sabado");
				break;
			case 2: System.out.println("Domingo");
				break;
			case 3: System.out.println("Lunes");
				break;
			case 4: System.out.println("Martes");
				break;
			case 5: System.out.println("Miercoles");
				break;
			case 6: System.out.println("Jueves");
				break;
			case 7: System.out.println("Viernes");
				break;
			}
			break;
		case 8: switch(j){
			case 1: System.out.println("Martes");
				break;
			case 2: System.out.println("Miercoles");
				break;
			case 3: System.out.println("Jueves");
				break;
			case 4: System.out.println("Viernes");
				break;
			case 5: System.out.println("Sabado");
				break;
			case 6: System.out.println("Domingo");
				break;
			case 7: System.out.println("Lunes");
				break;
			}
			break;
		case 9: switch(j){
			case 1: System.out.println("Viernes");
				break;
			case 2: System.out.println("Sabado");
				break;
			case 3: System.out.println("Domingo");
				break;
			case 4: System.out.println("Lunes");
				break;
			case 5: System.out.println("Martes");
				break;
			case 6: System.out.println("Miercoles");
				break;
			case 7: System.out.println("Jueves");
				break;
			}
			break;
		case 10: case 1: System.out.println("Domingo");
				break;
			case 2: System.out.println("Lunes");
				break;
			case 3: System.out.println("Martes");
				break;
			case 4: System.out.println("Miercoles");
				break;
			case 5: System.out.println("Jueves");
				break;
			case 6: System.out.println("Viernes");
				break;
			case 7: System.out.println("Sabado");
				break;
			}
			break;
		case 11: switch(j){
			case 1: System.out.println("Miercoles");
				break;
			case 2: System.out.println("Jueves");
				break;
			case 3: System.out.println("Viernes");
				break;
			case 4: System.out.println("Sabado");
				break;
			case 5: System.out.println("Domingo");
				break;
			case 6: System.out.println("Lunes");
				break;
			case 7: System.out.println("Martes");
				break;
			}
			break;

		case 12: switch(j){
			case 1: System.out.println("Viernes");
				break;
			case 2: System.out.println("Sabado");
				break;
			case 3: System.out.println("Domingo");
				break;
			case 4: System.out.println("Lunes");
				break;
			case 5: System.out.println("Martes");
				break;
			case 6: System.out.println("Miercoles");
				break;
			case 7: System.out.println("Jueves");
				break;
			}
			break;
	}
return dayWeekYear;


}
