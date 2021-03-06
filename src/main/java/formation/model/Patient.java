package formation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="patient")
public class Patient {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "phone")
	private Integer telephone;
	@Temporal(TemporalType.DATE)
	private Date dtNaissance;
	@Column(name="principal")
	private boolean principal;
	@Column(name = "lastname")
	private String nom;
	@Column(name = "firstname")
	private String prenom;
	@OneToOne
	@JoinColumn(name="adress")
	private Adresse adresse;
	@ManyToOne
	@JoinColumn(name="user_id")
	private Utilisateur utilisateur;
	@OneToMany(mappedBy="patient")
	private List<RendezVous> rendezVouss=new ArrayList<>();

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Patient() {
		super();
	}

	public Patient(Integer telephone, Date dtNaissance, boolean principal, String nom, String prenom) {
		super();
		this.telephone = telephone;
		this.dtNaissance = dtNaissance;
		this.principal = principal;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Integer getTelephone() {
		return telephone;
	}

	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}

	public Date getDtNaissance() {
		return dtNaissance;
	}

	public void setDtNaissance(Date dtNaissance) {
		this.dtNaissance = dtNaissance;
	}

	public boolean isPrincipal() {
		return principal;
	}

	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}