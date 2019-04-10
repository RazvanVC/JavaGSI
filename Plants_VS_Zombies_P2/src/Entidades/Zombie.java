package Entidades;
import java.util.*;

/**
 * @author razvanvc
 */
public abstract class Zombie {

	/**
	 * Default constructor
	 */
	public Zombie() {
	}

	/**
	 * 
	 */
	public int Daño;

	/**
	 * 
	 */
	public int Resistencia;

	/**
	 * 
	 */
	public int Velocidad;

	/**
	 * 
	 */
	public abstract void Avanzar();

}