package org.antislashn.communes;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.antislashn.communes.Constantes;
import org.antislashn.communes.dao.CommuneDAO;
import org.antislashn.communes.entities.Commune;
import org.antislashn.communes.entities.Departement;

public class MainCommunes {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(Constantes.UNIT_NAME);
		CommuneDAO dao = new CommuneDAO(emf);
//		List<Commune> communes = dao.getCommunesByCodePostal("972");
//		communes.forEach(System.out::println);
		List<String> departements = dao.getAllDepartements();
		departements.forEach(System.out::println);
		emf.close();
	}

}
