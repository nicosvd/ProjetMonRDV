package formation.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "slot")
public class Creneau {
	@Id
	@GeneratedValue
	Long id;
	@Temporal(TemporalType.DATE)
	Date dateRendezVous;
	@Column(name="slot_time")
	int uniteTempsCreneau;
	@OneToOne
	@JoinColumn(name = "adress")
	private Adresse adresse;
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

	public RendezVous getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(RendezVous rendezVous) {
		this.rendezVous = rendezVous;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
