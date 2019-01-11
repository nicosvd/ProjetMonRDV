package formation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "motive")
public class Motif {
	@Id
	@GeneratedValue
	Long id;
	@Column(name="motive")
	String motifRendezVous;
	@Column(name="cost")
	int prixConsultation;
	@Column(name="time_slot")
	int dureeConsultation;
	@OneToOne(mappedBy = "motif")
	private RendezVous rendezVous;

	public Motif() {
	}
	

	public Motif(String motifRendezVous, int prixConsultation, int dureeConsultation) {
		super();
		this.motifRendezVous = motifRendezVous;
		this.prixConsultation = prixConsultation;
		this.dureeConsultation = dureeConsultation;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMotifRendezVous() {
		return motifRendezVous;
	}

	public void setMotifRendezVous(String motifRendezVous) {
		this.motifRendezVous = motifRendezVous;
	}

	public int getPrixConsultation() {
		return prixConsultation;
	}

	public void setPrixConsultation(int prixConsultation) {
		this.prixConsultation = prixConsultation;
	}

	public int getDureeConsultation() {
		return dureeConsultation;
	}

	public void setDureeConsultation(int dureeConsultation) {
		this.dureeConsultation = dureeConsultation;
	}

	public RendezVous getRendezVous() {
		return rendezVous;
	}

}
