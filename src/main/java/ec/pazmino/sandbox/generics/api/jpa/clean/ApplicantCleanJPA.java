/*
 * ApplicantJPA.java
 *


 */

package ec.pazmino.sandbox.generics.api.jpa.clean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import ec.pazmino.sandbox.generics.api.interfaces.clean.ApplicantClean;
import ec.pazmino.sandbox.generics.api.interfaces.clean.ApplicationClean;

/**
 * TODO Descripcion Clase / Interfaz
 * 
 * @author iapazmino
 * 
 */
@Entity
public class ApplicantCleanJPA implements ApplicantClean {

	private Long id;
	private String ssi;
	private List<ApplicationClean> applications = new ArrayList<ApplicationClean>();

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

	/* (non-Javadoc)
	 * @see ec.pazmino.sandbox.generics.api.interfaces.Applicant#getSsi()
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
	@OneToMany(mappedBy = "applicant", targetEntity = ApplicationCleanJPA.class)
	public List<ApplicationClean> getApplications() {
		return applications;
	}

	/**
	 * @param applications the applications to set
	 */
	public void setApplications(List<ApplicationClean> applications) {
		this.applications = applications;
	}

}
