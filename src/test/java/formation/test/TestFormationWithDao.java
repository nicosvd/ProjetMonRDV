package formation.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import formation.Application;
import formation.dao.IDaoAdresse;
import formation.dao.IDaoCreneau;
import formation.dao.IDaoMotif;
import formation.dao.IDaoPatient;
import formation.dao.IDaoPraticien;
import formation.dao.IDaoRendezVous;
import formation.dao.IDaoSpecialite;
import formation.model.Adresse;
import formation.model.AdressePraticien;
import formation.model.Creneau;
import formation.model.Motif;
import formation.model.Patient;
import formation.model.Praticien;
import formation.model.RendezVous;
import formation.model.Specialite;

public class TestFormationWithDao {

	public static void main(String[] args) throws ParseException {


		test1();
	}

	static void test1() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		// test adresse
		IDaoAdresse daoAdresse = Application.getInstance().getDaoAdresse();
		Adresse adr1 = new Adresse(12, "Rougemont", 75001, "Paris", "France");
		adr1 = daoAdresse.save(adr1);

		// test patient
		IDaoPatient daoPatient = Application.getInstance().getDaoPatient();
		Patient patient1 = new Patient(010000000000, sdf.parse("10-12-1994"), true, "LINART", "Elodie");
		patient1.setAdresse(adr1);
		patient1 = daoPatient.save(patient1);

		// test praticien
		IDaoPraticien daoPraticien = Application.getInstance().getDaoPraticien();
		Praticien praticien1 = new Praticien(123456, "Docteur", "Maboul");
		praticien1.setDtNaissance(sdf.parse("09-10-1885"));
		praticien1.setHoraireOuverture(sdf.parse("19-10-2005"));
		praticien1.setCb(true);
		praticien1.setCb(false);
		praticien1.setCb(true);
		praticien1 = daoPraticien.save(praticien1);

		// test specialite
		IDaoSpecialite daoSpecialite = Application.getInstance().getDaoSpecialite();
		Specialite spe1 = new Specialite();
		Specialite spe2 = new Specialite();

		// test motif
		IDaoMotif daoMotif = Application.getInstance().getDaoMotif();
		Motif motif1 = new Motif("rhume", 50, 5);
		Motif motif2 = new Motif("rhume", 70, 1);
		Motif motif3 = new Motif("rhume", 30, 2);
		motif1 = daoMotif.save(motif1);
		motif2 = daoMotif.save(motif2);
		motif3 = daoMotif.save(motif3);
		

		// test creneau
		IDaoCreneau daoCreneau = Application.getInstance().getDaoCreneau();
		Creneau creneau1 = new Creneau (sdf.parse("10-12-1994"));
		creneau1 = daoCreneau.save(creneau1);
		
		

		// test Adresse et Praticien
		IDaoAdressePraticien daoAdressePraticien = Application.getInstance().getDaoAdressePraticien();
		AdressePraticien adr1praticien1 = new AdressePraticien(adr1, praticien1);
		adr1praticien1 = daoAdressePraticien.save(adr1praticien1);

		// test Praticien et Specialite
		IDaoSpecialitePraticien daoSpecialitePraticien = Application.getInstance().getDaoSpecialitePraticienn();
		SpecialitePraticien spe1praticien1 = new SpecialitePraticien();
		adr1praticien1 = daoAdressePraticien.save(adr1praticien1);
		
		// 

		
		
		
		
		
		IDaoMotif daoMotif = Application.getInstance().getDaoMotif();
		Motif motif = new Motif();
		motif.setMotifRendezVous("Consultation");
		motif.setPrixConsultation(20);
		motif.setDureeConsultation(30);
		motif = daoMotif.save(motif);
		System.out.println(
				motif.getMotifRendezVous() + "\t" + motif.getPrixConsultation() + "\t" + motif.getDureeConsultation());

		IDaoPatient daoPatient = Application.getInstance().getDaoPatient();
		Patient patient = new Patient(612345678, sdf.parse("10-12-1994"), true, "LINART", "Elodie");
		patient = daoPatient.save(patient);
		System.out.println(patient.getTelephone() + " \t" + patient.getDtNaissance() + " \t" + patient.isPrincipal()
				+ " \t" + patient.getNom() + " \t" + patient.getPrenom());

		// IDaoPatient daoPatient = Application.getInstance().getDaoPatient();
		// Patient patient = new Patient(010000000000, sdf.parse("10-12-1994"), true,
		// "LINART", "Elodie");
		// rendezVous.getPatient()
		// rendezVous = daoRendezVous.save(rendezVous);
		// System.out.println(rendezVous);

		IDaoRendezVous daoRendezVous = Application.getInstance().getDaoRendezVous();
		RendezVous rendezVous = new RendezVous();
		rendezVous.setMotif(motif);
		// rendezVous.setPatient(patient);
		rendezVous = daoRendezVous.save(rendezVous);
		System.out.println(rendezVous.getMotif().getDureeConsultation());

		IDaoCreneau daoCreneau = Application.getInstance().getDaoCreneau();
		Creneau creneau = new Creneau();
		creneau.setDateRendezVous(sdf.parse("10-11-1994"));
		creneau.setUniteTempsCreneau(15);
		creneau.setRendezVous(rendezVous);
		creneau = daoCreneau.save(creneau);
		System.out.println(
				creneau.getDateRendezVous() + "\t" + creneau.getUniteTempsCreneau() + "\t" + creneau.getRendezVous());

	}
}
