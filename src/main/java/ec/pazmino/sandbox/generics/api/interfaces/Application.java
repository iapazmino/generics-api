/*
 * Application.java
 *


 */
package ec.pazmino.sandbox.generics.api.interfaces;


/**
 * TODO Descripcion Clase / Interfaz
 *
 * @author iapazmino
 *
 */
public interface Application<T extends Applicant> {

	T getApplicant();
	
	void setApplicant(T applicant);
}
