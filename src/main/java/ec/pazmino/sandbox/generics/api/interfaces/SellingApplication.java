/*
 * SellingApplication.java
 *


 */
package ec.pazmino.sandbox.generics.api.interfaces;


/**
 * TODO Descripcion Clase / Interfaz
 *
 * @author iapazmino
 *
 */
public interface SellingApplication<T extends Applicant> extends Application<T> {

	Long getGoal();
}
