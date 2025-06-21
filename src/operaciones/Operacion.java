package operaciones;

import java.util.Random;

public class Operacion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// OPERACIONES ARITMETICAS
		//Suma, resta, multiplicacion, division, raiz, cuadrado, logaritmo, modulo, 
		
		int a = 10;
		int b = 5;
		System.out.println("a + b = "+(a+b));
		System.out.println("a - b = "+(a-b));
		System.out.println("a * b = "+(a*b));
		System.out.println("a / b = "+(a/b)); // aproxima al entero mas cercano
		System.out.println("a % 2 = "+(a%2)); // trae el residuo (con 2 es para encontrar pares)

		// trigonometria, estadistica, comparaciones, conversiones, etc
		
		//OPERACIONES LOGICAS
		// and, or, not
		//Revisar tablas logicas de verdad
		
		System.out.println("true And true :"+(true&&true));
		System.out.println("true Or true :"+(true||true));
		System.out.println("Not (true): "+!(true));
		
		System.out.println("OTROS EJERCICIOS");
		
		double x = 3.14;
		double y = -10;
		
		System.out.println("El mayor entre "+x+" y "+y+" es: "+Math.max(x, y));
		System.out.println("El menor entre "+x+" y "+y+" es: "+Math.max(x, y));
		
		System.out.println("El valor absoluto de "+y+" es: "+Math.abs(y));
		System.out.println("Raiz Cuadrada de 16 = "+Math.sqrt(16));
		System.out.println("4 elevado al cuadrado = "+Math.pow(4, 2)); // 4 es la base y 2 la potencia
		System.out.println("MHay nuchas opciones más en la libreria Math"); 
		
		System.out.println("al redondear "+y+" con round es:"+Math.round(y)); // al entero mas cercano
		System.out.println("al redondear "+y+" con ceil es:"+Math.ceil(y)); // al entero superior
		System.out.println("al redondear "+y+" con floor es:"+Math.floor(y)); // al entero inferior
	
		System.out.println("Numero random: "+new Random());
		System.out.println("Numero random entre 0 y 5: "+new Random(6));
		System.out.println("Numero random entre 1 y 6: "+new Random(6)+1);
		
	}

};

