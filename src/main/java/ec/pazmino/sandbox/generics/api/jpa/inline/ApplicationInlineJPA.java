/*
 * ApplicationJPA.java
 *


 */

package ec.pazmino.sandbox.generics.api.jpa.inline;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import ec.pazmino.sandbox.generics.api.interfaces.inline.ApplicantInline;
import ec.pazmino.sandbox.generics.api.interfaces.inline.ApplicationInline;

/**
 * TODO Descripcion Clase / Interfaz
 * 
 * @author iapazmino
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class ApplicationInlineJPA implements ApplicationInline {

	private Long codigo;
	private ApplicantInlineJPA applicant;

	/* (non-Javadoc)
	 * @see ec.pazmino.sandbox.generics.api.interfaces.Application#getApplicant()
	 */
	@ManyToOne(optional = false)
	@JoinColumn(name = "id")
	public ApplicantInlineJPA getApplicant() {
		return applicant;
	}

	/*
	 * (non-Javadoc)
	 * @see ec.pazmino.sandbox.generics.api.interfaces.Application#setContribuyente(ec.pazmino.sandbox.generics.api.interfaces.Applicant)
	 */
	public <T extends ApplicantInline> void setApplicant(T applicant) {
		this.applicant = (ApplicantInlineJPA) applicant;
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
