package controller;

public class Juliana {
	public static int data_Juliana (int dia, int mes, int ano) {
	    int dataJuliana;
	    dataJuliana = ( 1461 * ( ano + 4800 + ( mes - 14)/12 )  ) / 4 +

                ( 367 * ( mes - 2- 12 * (  ( mes - 14)/12 )  ) ) /12 -

                ( 3 * ( ( ano + 4900 + ( mes - 14 ) / 12 ) / 100 )  ) / 4 + dia - 32075;
		return dataJuliana;
	}
	public static void main(String[] args) {
		int dataJuliana;
		int dia = 2;
		int mes = 3;
		int ano = 2021;
	    dataJuliana = data_Juliana (dia,mes,ano);  
	    System.out.println(dataJuliana);
	}

}
