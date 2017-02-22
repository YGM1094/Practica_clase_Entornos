/*
 * Copyright (c) 2017
 *
 */
 
package mipaquete;

/**
 * Definiremos las reglas para las variables numéricas como
 * las implementadas en la clase {@link Operaciones}
 *
 * @see Operaciones
 * @author  Yaiza
 * @version 11/02/2017
 * @since 1.0
 */

public class Operaciones {

	/* ----- Constantes ----- */

    // variables
    private int a, b;
	
	/**
	* Daremos a las variables a y b el valor 0
	* por defecto en el primer constructor
	* en el segundo podremos cambiarlo, mientras sea positivo
	*
	* @serial
	*/
	
	/**
	* @value la variable SMI tiene valor por defecto que no se puede cambiar
	*/
    private static final double SMI = 5322.234;

   /**
     * Un construsctor {@code Operaciones} donde inicializar
	 * la variables.
     * 
     */
	 
	 public Operaciones() {
        a = 0;
		b = 0;
    }
	 
	 /**
     * Un construsctor {@code Operaciones} donde inicializar
	 * la variables.
     * 
     * @param setA Tiene que ser {@code < 0} positivo.
     * @param setB Tiene que ser {@code < 0} positivo.
     * @exception IllegalArgumentException if the {@code setA} si es menor
     * que cero.
	 * 
     */
	 
	 public Operaciones(int setA, int setB) {
        if (setA < 0)
            throw new IllegalArgumentException("Digits < 0");
		if (setB < 0)
            throw new IllegalArgumentException("Digits < 0");

        a = setA;
		b = setB;
    }
	 
	 /**
	 * Todos los derechos reservados
     * Devuelve la configuración {@code variable}.
     * Este valor es siempre no negativo.
     *
     * @return un {@code int} que es el valor de la variable {@code a}
     * ajuste
     */
	 
	 /**
	 * @return the a
	 */
	 public int getA() {
        return a;
    }
	 
	 /**
	 * @return the b
	 */
	
	public int getB() {
        return b;
    }
	
	 /**
	 * @return the smi
	 */
	public static double getSMI() {
		return SMI;
	}
	
	/* ----- Cabiar el valor de las variables a y b ----- */	
	
	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}
	
	 /* ----- Metodos suma y resta ----- */	 
	
	/**
	 *
	 * @serialData en estos metodos realizaresmo las operaciones
	 * de suma, resta u multiplicacion
	 *
	 */
	 
	 public void suma(){
		System.out.println(this.getA() + this.getB());
	}
	
	public void resta(){
		System.out.println(this.getA() - this.getB());
	}
	 
	 /* ----- Metodo multiplicacion ----- */
	 
	 public int multiplicaNumero(int num){
		 int cuenta = (a*b*num);
		 return cuenta;
	 }
	 
	 
 

}
