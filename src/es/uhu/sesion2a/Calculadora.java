package es.uhu.sesion2a;

public class Calculadora {

	    // Método estático para sumar dos números
	    public static int suma(int a, int b) {
	        return a + b;
	    }

	    // Método estático para multiplicar dos números
	    public static int multiplica(int a, int b) {
	        return a * b;
	    }

	    // Método estático para dividir dos números
	    public static double divide(int a, int b) {
	        if (b == 0) {
	            throw new ArithmeticException("No se puede dividir entre 0");
	        }
	        return (double) a / b;
	    }

	   
	

}
