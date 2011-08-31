/*
 * ApplicationJPADAOIntegrationTest.java
 *


 */

package ec.pazmino.sandbox.generics.api.jpa;

import javax.ejb.EJB;

import org.jboss.arquillian.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import ec.pazmino.sandbox.generics.api.interfaces.Applicant;
import ec.pazmino.sandbox.generics.api.interfaces.Application;
import ec.pazmino.sandbox.generics.api.interfaces.SellingApplication;
import ec.pazmino.sandbox.generics.api.interfaces.inline.ApplicantInline;
import ec.pazmino.sandbox.generics.api.interfaces.inline.ApplicationInline;
import ec.pazmino.sandbox.generics.api.interfaces.inline.SellingApplicationInline;
import ec.pazmino.sandbox.generics.api.jpa.ApplicantJPA;
import ec.pazmino.sandbox.generics.api.jpa.ApplicationJPA;
import ec.pazmino.sandbox.generics.api.jpa.SellingApplicationJPA;
import ec.pazmino.sandbox.generics.api.jpa.dao.CommonJPADAO;
import ec.pazmino.sandbox.generics.api.jpa.inline.ApplicantInlineJPA;
import ec.pazmino.sandbox.generics.api.jpa.inline.ApplicationInlineJPA;
import ec.pazmino.sandbox.generics.api.jpa.inline.SellingApplicationInlineJPA;

/**
 * TODO Descripcion Clase / Interfaz
 * 
 * @author iapazmino
 * 
 */
@RunWith(Arquillian.class)
public class SellingApplicationJPADAOIntegrationTest {

	@EJB
	private CommonJPADAO jpadao;

	@Deployment
	public static JavaArchive getJar() {
		JavaArchive test = ShrinkWrap.create(JavaArchive.class, "test.jar");

		test.addClasses(Application.class, Applicant.class, SellingApplication.class);
		test.addClasses(ApplicationInline.class, ApplicantInline.class, SellingApplicationInline.class);
		test.addClasses(ApplicationJPA.class, ApplicantJPA.class, SellingApplicationJPA.class);
		test.addClasses(ApplicationInlineJPA.class, ApplicantInlineJPA.class, SellingApplicationInlineJPA.class);
		test.addClasses(CommonJPADAO.class);

		test.addAsManifestResource("META-INF/persistence.xml", "persistence.xml");

		return test;
	}

	@Test
	public void testSave() {
		ApplicantJPA applicant = new ApplicantJPA();
		applicant.setSsi("0987654321001");
		
		jpadao.save(applicant);
		
		SellingApplicationJPA application = new SellingApplicationJPA();
		application.setApplicant(applicant);
		application.setGoal(1000L);

		jpadao.save(application);
	}
}
