package formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="practitioner_specialization")
public class PraticienSpecialite {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "practitioner_id")
	private Praticien praticien;
	
	@ManyToOne
	@JoinColumn(name = "specilization_id")
	private Specialite specialite;

	public PraticienSpecialite(Praticien praticien, Specialite specialite) {
		super();
		this.praticien = praticien;
		this.specialite = specialite;
	}

	public PraticienSpecialite() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

	public Specialite getSpecialite() {
		return specialite;
	}

	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}
	
	
}
