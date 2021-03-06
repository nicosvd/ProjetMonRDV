package formation.test;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import formation.Application;
import formation.model.TypeUtilisateur;
import formation.model.*;


public class TestFormation {

	public static void main(String[] args) {

		EntityManagerFactory emf = Application.getInstance().getEmf();

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = emf.createEntityManager();
			tx = em.getTransaction();

			tx.begin();
			Utilisateur nicosvd = new Utilisateur("nico.svd@orange.fr","sudoku",TypeUtilisateur.Praticien);
			Praticien sekouly = new Praticien(15687,"COULIBALY","SEKOULY");
			sekouly.setCb(true);
			sekouly.setCheque(true);
			sekouly.setUtilisateur(nicosvd);
			em.persist(nicosvd);
			Adresse ajc=new Adresse(8,"rue Rougemont",94800,"Paris","France");
			em.persist(ajc);
			em.persist(sekouly);
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
