/*
 * ApplicationJPA.java
 *


 */

package ec.pazmino.sandbox.generics.api.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import ec.pazmino.sandbox.generics.api.interfaces.Application;

/**
 * TODO Descripcion Clase / Interfaz
 * 
 * @author iapazmino
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class ApplicationJPA implements Application<ApplicantJPA> {

	private Long codigo;
	private ApplicantJPA applicant;

	/* (non-Javadoc)
	 * @see ec.pazmino.sandbox.generics.api.interfaces.Application#getApplicant()
	 */
	@ManyToOne(optional = false)
	@JoinColumn(name = "id")
	public ApplicantJPA getApplicant() {
		return applicant;
	}

	/*
	 * (non-Javadoc)
	 * @see ec.pazmino.sandbox.generics.api.interfaces.Application#setContribuyente(ec.pazmino.sandbox.generics.api.interfaces.Applicant)
	 */
	public void setApplicant(ApplicantJPA applicant) {
		this.applicant = applicant;
	}

	/**
	 * @return the codigo
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

}
