package formation.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity

@Table
public class Patient {
	@Column (name="phone")
	private Integer telephone;
	@Column (name="birthDate")
	private Date dtNaissance;
	private boolean principal;
	@Column (name="lastname")
	private String nom;
	@Column (name="firstname")
	private String prenom;
	@OneToOne
	@JoinColumn
	private Adresse adresse;
	@ManyToOne
	private Utilisateur utilisateur;

	
	
	public Patient() {
		super();
	}


	public Patient(String mail, String motdepasse, TypeUtilisateur typeUtilisateur, Integer telephone, Date dtNaissance, boolean principal, String nom, String prenom) {
		super(mail, motdepasse, typeUtilisateur);
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