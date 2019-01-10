package formation.test;

import formation.Application;
import formation.dao.IDaoAdresse;
import formation.dao.IDaoCreneau;
import formation.dao.IDaoMotif;
import formation.dao.IDaoRendezVous;
import formation.model.Adresse;
import formation.model.Creneau;
import formation.model.Motif;
import formation.model.RendezVous;

public class TestFormationWithDao {

	public static void main(String[] args) {
		IDaoRendezVous daoRendezVous = Application.getInstance().getDaoRendezVous();

		RendezVous rendezVous = new RendezVous();
		rendezVous = daoRendezVous.save(rendezVous);
		System.out.println(rendezVous);

		IDaoMotif daoMotif = Application.getInstance().getDaoMotif();

		Motif motif = new Motif();
		motif.setDureeConsultation(30);
		motif = daoMotif.save(motif);
		System.out.println(motif.getDureeConsultation());

		IDaoCreneau daoCreneau = Application.getInstance().getDaoCreneau();

		Creneau creneau = new Creneau();
		creneau = daoCreneau.save(creneau);
		System.out.println(creneau);

		IDaoAdresse daoAdresse = Application.getInstance().getDaoAdresse();
		Adresse adresse = new Adresse(20, "Rue Brezin", 75014, " Paris", "France");
		adresse = daoAdresse.save(adresse);
		System.out.println(adresse.getRue());
	}

}
