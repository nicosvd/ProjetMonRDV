package formation.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "slot")
public class Creneau {
	@Id
	@GeneratedValue
	Long id;
	Date dateRendezVous;
	int uniteTempsCreneau;
	// Adresse adresse;
	@OneToOne
	@JoinColumn(name = "meeting")
	private RendezVous rendezVous;

	public Creneau() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateRendezVous() {
		return dateRendezVous;
	}

	public void setDateRendezVous(Date dateRendezVous) {
		this.dateRendezVous = dateRendezVous;
	}

	public int getUniteTempsCreneau() {
		return uniteTempsCreneau;
	}

	public void setUniteTempsCreneau(int uniteTempsCreneau) {
		this.uniteTempsCreneau = uniteTempsCreneau;
	}

//	public Adresse getAdresse() {
//		return adresse;
//	}

//	public void setAdresse(Adresse adresse) {
//		this.adresse = adresse;
//	}

}
