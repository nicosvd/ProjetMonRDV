package formation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import formation.dao.IDaoAdresse;
import formation.dao.IDaoCreneau;
import formation.dao.IDaoMotif;
import formation.dao.IDaoRendezVous;
import formation.dao.IDaoUtilisateur;
import formation.dao.jpa.DaoAdresseJpa;
import formation.dao.jpa.DaoCreneauJpa;
import formation.dao.jpa.DaoMotifJpa;
import formation.dao.jpa.DaoRendezVousJpa;
import formation.dao.jpa.DaoUtilisateur;

public class Application {

	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("formation");

	private final IDaoRendezVous daoRendezVous = new DaoRendezVousJpa();
	private final IDaoMotif daoMotif = new DaoMotifJpa();
	private final IDaoCreneau daoCreneau = new DaoCreneauJpa();
	private final IDaoAdresse daoAdresse = new DaoAdresseJpa();
	private final IDaoUtilisateur daoUtilisateur = new DaoUtilisateur();
	
	
	
	public IDaoUtilisateur getDaoUtilisateur() {
		return daoUtilisateur;
	}

	private Application() {
	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public IDaoRendezVous getDaoRendezVous() {
		return daoRendezVous;
	}

	public IDaoMotif getDaoMotif() {
		return daoMotif;
	}

	public IDaoCreneau getDaoCreneau() {
		return daoCreneau;
	}
	
	public IDaoAdresse getDaoAdresse() {
		return daoAdresse;
	}
}
