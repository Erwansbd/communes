package org.antislashn.communes.entities;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.antislashn.communes.Constantes;
import org.antislashn.communes.dao.CommuneDAO;
import org.antislashn.communes.entities.Region;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDepartementDB {
	private static EntityManagerFactory emf = null;
	@Test
	public void test() {
		EntityManager em = emf.createEntityManager();
		Departement r = em.find(Departement.class, "01");
		assertNotNull(r);
		em.close();
	}
	
	@Test
	public void testAllDepartements() {
		CommuneDAO dao = new CommuneDAO(emf);
		List<String> departements = dao.getAllDepartements();
		assertNotNull(departements);
		assertEquals(109,departements.size());
	}
	
	@BeforeClass
	public static void before() {
		emf = Persistence.createEntityManagerFactory(Constantes.UNIT_NAME);
	}
	
	@AfterClass
	public static void after() {
		emf.close();
	}

}
