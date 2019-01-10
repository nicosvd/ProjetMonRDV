package formation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "user")
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column
	private Long id;
	@Column(name = "mail")
	private String courriel;
	@Column(name = "password")
	private String motDePasse;
	@Column(name = "type")
	private TypeUtilisateur type;
//	@OneToOne(mappedBy="utilisateur")
//	private Praticien praticien;
	
	
	
	public Utilisateur() {
		super();
	}



	public Utilisateur(String courriel, String motDePasse, TypeUtilisateur type) {
		super();
		this.courriel = courriel;
		this.motDePasse = motDePasse;
		this.type = type;
	}



//	public Praticien getPraticien() {
//		return praticien;
//	}
//
//
//
//	public void setPraticien(Praticien praticien) {
//		this.praticien = praticien;
//	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCourriel() {
		return courriel;
	}



	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}



	public String getMotDePasse() {
		return motDePasse;
	}



	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}



	public TypeUtilisateur getType() {
		return type;
	}



	public void setType(TypeUtilisateur type) {
		this.type = type;
	}
	
	

}
