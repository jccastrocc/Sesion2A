package es.uhu.sesion2a.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.uhu.sesion2a.Calculadora;

class CalculadoraTest {
	
	int a , b;
	int valorNulo;

	@BeforeAll  //Se ejecuta el primero
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all");
	}

	@AfterAll //Se ejecuta el ultimo
	static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}

	@BeforeEach //Se ejecuta el segundo, y se ejecuta por cada metodo test
	void setUp() throws Exception {
		System.out.println("Before each");
		a = 10; b=5;
		valorNulo=0;
	}

	@AfterEach //Se ejecuta el tercero, y se ejecuta por cada metodo test una vez
	void tearDown() throws Exception {
		System.out.println("After each");
	}

	@Test
	void testSuma() {
		
		 // Prueba para el método suma
		int valorEsperado = 15;
        int resultado = Calculadora.suma(a, b);
        assertEquals(valorEsperado, resultado, "La suma de 10 + 5 debe ser 15");
	}

	@Test
    void testMultiplica() {
        // Prueba para el método multiplica
		int valorEsperado = 50;
        int resultado = Calculadora.multiplica(10, 5);
        assertEquals(valorEsperado, resultado, "La multiplicación de 10 * 5 debe ser 50");
    }

    @Test
    void testDivide() {
        // Prueba para el método divide
    	double valorEsperado = 2.0;
        double resultado = Calculadora.divide(a, b);
        assertEquals(valorEsperado, resultado, "La división de 10 / 5 debe ser 2.0");
    }

    @Test
    void testDividePorCero() {
        // Prueba para división por cero
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculadora.divide(a, valorNulo);
        });
        assertEquals("No se puede dividir entre 0", exception.getMessage());
    }

}
