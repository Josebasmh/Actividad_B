package model;

import java.util.Objects;

public class Persona {

	// Variables de clase
	private String sNombre,sAppelidos;
	private Integer nEdad;

	
	// Constructor
	public Persona(String nom,String ape,int edad) {
		sNombre = nom;
		sAppelidos = ape;
		nEdad = edad;
	}

	
	// Métodos getter y setter
	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsAppelidos() {
		return sAppelidos;
	}

	public void setsAppelidos(String sAppelidos) {
		this.sAppelidos = sAppelidos;
	}

	public Integer getnEdad() {
		return nEdad;
	}

	public void setnEdad(int nEdad) {
		this.nEdad = nEdad;
	}


	/*
	 * Metodo HashCode y equals para saber cuando una persona es igual a otra.
	 * Dos personas son iguales cuando el Nombre,Apellidos y edad es el mismo.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(nEdad, sAppelidos, sNombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return nEdad == other.nEdad && Objects.equals(sAppelidos, other.sAppelidos)
				&& Objects.equals(sNombre, other.sNombre);
	}
	
}
