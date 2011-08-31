/*
 * ApplicantJPA.java
 *


 */

package ec.pazmino.sandbox.generics.api.jpa.inline;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import ec.pazmino.sandbox.generics.api.interfaces.inline.ApplicantInline;

/**
 * TODO Descripcion Clase / Interfaz
 * 
 * @author iapazmino
 * 
 */
@Entity
public class ApplicantInlineJPA implements ApplicantInline {

	private Long id;
	private String ssi;
	private List<ApplicationInlineJPA> applications = new ArrayList<ApplicationInlineJPA>();

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * @see ec.pazmino.sandbox.generics.api.interfaces.inline.ApplicantInline#getRuc()
	 */
	public String getSsi() {
		return ssi;
	}

	/**
	 * @param ssi the ssi to set
	 */
	public void setSsi(String ssi) {
		this.ssi = ssi;
	}

	/**
	 * @return the applications
	 */
	@OneToMany(mappedBy = "applicant")
	public List<ApplicationInlineJPA> getApplications() {
		return applications;
	}

	/**
	 * @param applications the applications to set
	 */
	public void setApplications(List<ApplicationInlineJPA> applications) {
		this.applications = applications;
	}

}
