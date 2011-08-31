/*
 * ApplicationJPA.java
 *


 */

package ec.pazmino.sandbox.generics.api.jpa.clean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import ec.pazmino.sandbox.generics.api.interfaces.clean.ApplicantClean;
import ec.pazmino.sandbox.generics.api.interfaces.clean.ApplicationClean;

/**
 * TODO Descripcion Clase / Interfaz
 * 
 * @author iapazmino
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class ApplicationCleanJPA implements ApplicationClean {

	private Long codigo;
	private ApplicantClean applicant;

	/* (non-Javadoc)
	 * @see ec.pazmino.sandbox.generics.api.interfaces.Application#getApplicant()
	 */
	@ManyToOne(optional = false, targetEntity = ApplicantCleanJPA.class)
	@JoinColumn(name = "id")
	public ApplicantClean getApplicant() {
		return applicant;
	}

	/*
	 * (non-Javadoc)
	 * @see ec.pazmino.sandbox.generics.api.interfaces.Application#setContribuyente(ec.pazmino.sandbox.generics.api.interfaces.Applicant)
	 */
	public void setApplicant(ApplicantClean applicant) {
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
