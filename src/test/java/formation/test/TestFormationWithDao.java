package formation.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import formation.Application;
import formation.dao.IDaoAdresse;
import formation.dao.IDaoCreneau;
import formation.dao.IDaoMotif;
import formation.dao.IDaoPatient;
import formation.dao.IDaoRendezVous;
import formation.model.Adresse;
import formation.model.Creneau;
import formation.model.Motif;
import formation.model.Patient;
import formation.model.RendezVous;

public class TestFormationWithDao {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		IDaoMotif daoMotif = Application.getInstance().getDaoMotif();
		Motif motif = new Motif();
		motif.setMotifRendezVous("Consultation");
		motif.setPrixConsultation(20);
		motif.setDureeConsultation(30);
		motif = daoMotif.save(motif);
		System.out.println(
				motif.getMotifRendezVous() + "\t" + motif.getPrixConsultation() + "\t" + motif.getDureeConsultation());

//		IDaoPatient daoPatient = Application.getInstance().getDaoPatient();
//		Patient patient = new Patient(010000000000, sdf.parse("10-12-1994"), true, "LINART", "Elodie");
//		rendezVous.getPatient()
//		rendezVous = daoRendezVous.save(rendezVous);
//		System.out.println(rendezVous);
		
		IDaoRendezVous daoRendezVous = Application.getInstance().getDaoRendezVous();
		RendezVous rendezVous = new RendezVous();
//		rendezVous.setPatient(patient);
		rendezVous = daoRendezVous.save(rendezVous);
		System.out.println(rendezVous);

		IDaoCreneau daoCreneau = Application.getInstance().getDaoCreneau();
		Creneau creneau = new Creneau();
		creneau.setDateRendezVous(sdf.parse("10-12-1994"));
		creneau.setUniteTempsCreneau(15);
		creneau.setRendezVous(rendezVous);
		creneau = daoCreneau.save(creneau);
		System.out.println(
				creneau.getDateRendezVous() + "\t" + creneau.getUniteTempsCreneau() + "\t" + creneau.getRendezVous());

	}

}
