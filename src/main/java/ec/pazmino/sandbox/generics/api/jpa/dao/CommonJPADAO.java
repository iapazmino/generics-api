/*
 * SolicitudJPADAO.java
 *


 */

package ec.pazmino.sandbox.generics.api.jpa.dao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * TODO Descripcion Clase / Interfaz
 * 
 * @author iapazmino
 * 
 */
@Stateless
@LocalBean
public class CommonJPADAO {

	@PersistenceContext(name = "testPU")
	private EntityManager entityManager;

	public void save(Object object) {
		entityManager.persist(object);
	}
}
