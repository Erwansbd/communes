package org.antislashn.communes.dao;

import javax.persistence.EntityManagerFactory;

import org.antislashn.communes.entities.Departement;

public class DepartementDAO extends AbstractDAO<Departement, Long> {

	protected DepartementDAO(EntityManagerFactory emf) {
		super(emf, Departement.class);
		// TODO Auto-generated constructor stub
	}

}
