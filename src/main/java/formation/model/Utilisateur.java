package formation.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Person")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type", discriminatorType=DiscriminatorType.STRING)

public class Utilisateur {

	@Id
	@GeneratedValue
	private Long id;
	@Column (name="courriel")
	private String mail;
	@Column (name="password")
	private String motdepasse;
	@Enumerated(EnumType.STRING)
	private TypeUtilisateur typeUtilisateur;
//	@OneToMany (mappebBy="utilisateur")
//	private Patient patient;
	
	
	public Utilisateur() {
		super();
	}


	public Utilisateur(String mail, String motdepasse, TypeUtilisateur typeUtilisateur) {
		super();
		this.mail = mail;
		this.motdepasse = motdepasse;
		this.typeUtilisateur = typeUtilisateur;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getMotdepasse() {
		return motdepasse;
	}


	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}


	public TypeUtilisateur getTypeUtilisateur() {
		return typeUtilisateur;
	}


	public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur) {
		this.typeUtilisateur = typeUtilisateur;
	}
	
	
	
	
	
}
