/*
 * SellingApplicationJPA.java
 *


 */

package ec.pazmino.sandbox.generics.api.jpa;

import javax.persistence.Entity;

import ec.pazmino.sandbox.generics.api.interfaces.SellingApplication;

/**
 * TODO Descripcion Clase / Interfaz
 * 
 * @author iapazmino
 * 
 */
@Entity
public class SellingApplicationJPA extends ApplicationJPA implements SellingApplication<ApplicantJPA> {

	private Long goal;

	public Long getGoal() {
		return goal;
	}

	/**
	 * @param goal the goal to set
	 */
	public void setGoal(Long goal) {
		this.goal = goal;
	}

}
