package formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "meeting")
public class RendezVous {
	@Id
	@GeneratedValue
	Long id;
//	private Patient patient;
	@OneToOne(mappedBy = "rendezVous")
	private Motif motif;
	@OneToOne(mappedBy = "rendezVous")
	private Creneau creneau;

	public RendezVous() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public Patient getPatient() {
//		return patient;
//	}
//
//	public void setPatient(Patient patient) {
//		this.patient = patient;
//	}

}
