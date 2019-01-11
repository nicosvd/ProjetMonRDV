package formation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "meeting")
public class RendezVous {
	@Id
	@GeneratedValue
	Long id;
	private Patient patient;
	@ManyToOne
	@JoinColumn(name = "user_account_id")
	private Utilisateur utilisateur;
	@OneToOne
	@JoinColumn(name = "motive")
	private Motif motif;
	@OneToOne(mappedBy = "rendezVous")
	private Creneau creneau;

	public RendezVous() {
	}

	
	
	
	public RendezVous(Patient patient, Motif motif, Creneau creneau) {
		super();
		this.patient = patient;
		this.motif = motif;
		this.creneau = creneau;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Motif getMotif() {
		return motif;
	}

	public Creneau getCreneau() {
		return creneau;
	}

	public void setMotif(Motif motif) {
		this.motif = motif;
	}

}
