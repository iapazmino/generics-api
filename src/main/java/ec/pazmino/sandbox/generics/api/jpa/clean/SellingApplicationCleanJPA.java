/*
 * SellingApplicationJPA.java
 *


 */

package ec.pazmino.sandbox.generics.api.jpa.clean;

import javax.persistence.Entity;

import ec.pazmino.sandbox.generics.api.interfaces.clean.SellingApplicationClean;

/**
 * TODO Descripcion Clase / Interfaz
 * 
 * @author iapazmino
 * 
 */
@Entity
public class SellingApplicationCleanJPA extends ApplicationCleanJPA implements SellingApplicationClean {

	private Long goal;

	public Long goal() {
		return goal;
	}

	/**
	 * @param goal the goal to set
	 */
	public void setGoal(Long goal) {
		this.goal = goal;
	}

}
