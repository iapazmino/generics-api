/*
 * Application.java
 *


 */

package ec.pazmino.sandbox.generics.api.interfaces.inline;

/**
 * TODO Descripcion Clase / Interfaz
 * 
 * @author iapazmino
 * 
 */
public interface ApplicationInline {

	<T extends ApplicantInline> T getApplicant();

	<T extends ApplicantInline> void setApplicant(T applicant);
}
