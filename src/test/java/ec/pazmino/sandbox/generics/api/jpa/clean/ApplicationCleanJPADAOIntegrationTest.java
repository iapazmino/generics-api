/*
 * ApplicationJPADAOIntegrationTest.java
 *


 */

package ec.pazmino.sandbox.generics.api.jpa.clean;

import javax.ejb.EJB;

import org.jboss.arquillian.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import ec.pazmino.sandbox.generics.api.interfaces.Applicant;
import ec.pazmino.sandbox.generics.api.interfaces.Application;
import ec.pazmino.sandbox.generics.api.interfaces.clean.ApplicantClean;
import ec.pazmino.sandbox.generics.api.interfaces.clean.ApplicationClean;
import ec.pazmino.sandbox.generics.api.interfaces.inline.ApplicantInline;
import ec.pazmino.sandbox.generics.api.interfaces.inline.ApplicationInline;
import ec.pazmino.sandbox.generics.api.jpa.ApplicantJPA;
import ec.pazmino.sandbox.generics.api.jpa.ApplicationJPA;
import ec.pazmino.sandbox.generics.api.jpa.clean.ApplicantCleanJPA;
import ec.pazmino.sandbox.generics.api.jpa.clean.ApplicationCleanJPA;
import ec.pazmino.sandbox.generics.api.jpa.dao.CommonJPADAO;
import ec.pazmino.sandbox.generics.api.jpa.inline.ApplicantInlineJPA;
import ec.pazmino.sandbox.generics.api.jpa.inline.ApplicationInlineJPA;

/**
 * TODO Descripcion Clase / Interfaz
 * 
 * @author iapazmino
 * 
 */
@RunWith(Arquillian.class)
public class ApplicationCleanJPADAOIntegrationTest {

	@EJB
	private CommonJPADAO jpadao;

	@Deployment
	public static JavaArchive getJar() {
		JavaArchive test = ShrinkWrap.create(JavaArchive.class, "test.jar");

		test.addClasses(Application.class, Applicant.class);
		test.addClasses(ApplicationInline.class, ApplicantInline.class);
		test.addClasses(ApplicationClean.class, ApplicantClean.class);
		test.addClasses(ApplicationJPA.class, ApplicantJPA.class);
		test.addClasses(ApplicationInlineJPA.class, ApplicantInlineJPA.class);
		test.addClasses(ApplicationCleanJPA.class, ApplicantCleanJPA.class);
		test.addClasses(CommonJPADAO.class);

		test.addAsManifestResource("META-INF/persistence.xml", "persistence.xml");

		return test;
	}

	@Test
	public void testSave() {
		ApplicantCleanJPA applicant = new ApplicantCleanJPA();
		applicant.setSsi("0987654321001");
		
		jpadao.save(applicant);
		
		ApplicationCleanJPA application = new ApplicationCleanJPA();
		application.setApplicant(applicant);

		jpadao.save(application);
	}
}
