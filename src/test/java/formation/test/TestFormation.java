package formation.test;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import formation.Application;
import formation.model.Adresse;


public class TestFormation {

	public static void main(String[] args) {

		EntityManagerFactory emf = Application.getInstance().getEmf();

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = emf.createEntityManager();
			tx = em.getTransaction();

			tx.begin();
			Adresse adresse = new Adresse(20, "Rue Brezin", 75014," Paris", "France");
			em.persist(adresse);
			tx.commit(); // em.flush()
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}

		emf.close();
	}

}
