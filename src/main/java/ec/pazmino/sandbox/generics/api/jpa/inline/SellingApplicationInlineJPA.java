/*
 * SellingApplicationJPA.java
 *


 */

package ec.pazmino.sandbox.generics.api.jpa.inline;

import javax.persistence.Entity;

import ec.pazmino.sandbox.generics.api.interfaces.inline.SellingApplicationInline;

/**
 * TODO Descripcion Clase / Interfaz
 * 
 * @author iapazmino
 * 
 */
@Entity
public class SellingApplicationInlineJPA extends ApplicationInlineJPA implements SellingApplicationInline {

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
