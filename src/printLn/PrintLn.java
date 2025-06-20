package printLn;

public class PrintLn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Comentario simple
		
		/*
		 * Comentario
		 * de varias 
		 * lineas
		 */
		
		System.out.println("Impresiones para PRINCIPIANTE");
		
		System.out.println("Impresión simple con salto de línea");
		
		System.out.print("Impresion simple sin salto de linea");
		
		System.out.print("\nImpresion con salto de línea antes y después\n");
		
		System.out.println("Impresion con e saltos de línea después\n\n\n");
		
		System.out.println("Impresion concatenada con valores numéricos: "+2);
		
		System.out.println("impresion con varias concatenaciones numericas: "+2+" y "+4);
		
		System.out.println("Impresion con comillas: \"PRAY\" ");
		
		System.out.println("Impresion BASICA con printf (print con formato) ");
		
		System.out.println("System.out.printf(formato, argumento1, argumento2, ...);");
		
		/*
		 * %d para dato int System.out.printf("El número es %d%n", parametroInt);
		 * %f para dato double o float System.out.printf("El valor de PI es %.2f%n", parametroDouble);
		 * %s para dato String System.out.printf("Hola, %s%n", parametroString);
		 * %d para dato boolean System.out.printf("El valor es %b%n", parametroBoolean);
		 */
		
		System.out.println("Dato entero");
		System.out.printf("El número es %d%n", 44);
		
		System.out.println("Dato Double/Float");
		System.out.printf("El valor de PI es %.2f%n", 3.1415926);
		
		System.out.println("Dato tipo String");
		System.out.printf("Hola, %s%n", "Asap");
		
		System.out.println("Dato tipo boolean");
		System.out.printf("El valor es %b%n", !(1>0));
		
		System.out.println("IMPRESION AVANZADA");
		
		System.out.println("Impresion de espacio minimo");
		System.out.printf("Número: %6d%n", 123);
		
		System.out.println("Impresion de datos alineados a la izquierda");
		System.out.printf("Número: %-6d fin%n", 444);
		
		System.out.println("Impresion de datos alineados a la derecha");
		System.out.printf("Número: %+6d fin%n", 444);
		
		System.out.println("Impresion de datos alineados a la izquierda");
		System.out.printf("Número: %-6d fin%n", 444);
		
		System.out.println("impresion multiparámetro con formato");
		
		System.out.printf("%s tiene %d años.%n", "Nombre", 30);
		
		System.out.println("Otras formas amigables de impresión en consola:");
		System.out.println("Talba ascii extendida o \"Tabla Ascii Extendida\" ");

		/*
		 * ║	Línea vertical doble	Alt + 186
		 * ═	Línea horizontal doble	Alt + 205
		 * ╔	Esquina superior izquierda doble	Alt + 201
		 * ╗	Esquina superior derecha doble	Alt + 187
		 * ╚	Esquina inferior izquierda doble	Alt + 200
		 * ╝	Esquina inferior derecha doble	Alt + 188
		 * ╠	Intersección T doble (izquierda)	Alt + 204
		 * ╣	Intersección T doble (derecha)	Alt + 185
		 * ╦	Intersección T doble (superior)	Alt + 203
		 * ╩	Intersección T doble (inferior)	Alt + 202
		 * ╬	Cruz doble	Alt + 206
		 */
		
		System.out.println("╔═╦═╗");
		System.out.println("║ ║ ║");
		System.out.println("╠═╬═╣");
		System.out.println("║ ║ ║");
		System.out.println("╚═╩═╝");
	}

}
