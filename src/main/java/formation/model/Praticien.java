package formation.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "practitioner")
public class Praticien {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "order_number")
	private int numeroOrdre;
	@Column(name = "phone_number")
	private int numeroDeTel;
	@Temporal(TemporalType.DATE)
	private Date dtNaissance;
	@Temporal(TemporalType.DATE)
	private Date horaireOuverture;
	@Column(name = "lastname")
	private String nom;
	@Column(name = "firstname")
	private String prenom;
	@Column(name="cheque_payment")
	private boolean cheque;
	@Column(name="credit_card_payment")
	private boolean cb;
	@Column(name="cash_payment")
	private boolean espece;
	@OneToOne
	@JoinColumn(name = "user_id")
	private Utilisateur utilisateur;
	@OneToMany(mappedBy="praticien")
	private List<AdressePraticien> praticiens=new ArrayList<>();
	@OneToMany (mappedBy="praticien")
	private List<PraticienSpecialite> praticiens2=new ArrayList<>();
	
	public Praticien() {
		super();
	}



	public Praticien(int numeroOrdre, String nom, String prenom) {
		super();
		this.numeroOrdre = numeroOrdre;
		this.nom = nom;
		this.prenom = prenom;
	}

	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public List<PraticienSpecialite> getPraticiens2() {
		return praticiens2;
	}



	public void setPraticiens2(List<PraticienSpecialite> praticiens2) {
		this.praticiens2 = praticiens2;
	}



	public List<AdressePraticien> getPraticiens() {
		return praticiens;
	}



	public void setPraticiens(List<AdressePraticien> praticiens) {
		this.praticiens = praticiens;
	}



	


	public int getNumeroOrdre() {
		return numeroOrdre;
	}



	public void setNumeroOrdre(int numeroOrdre) {
		this.numeroOrdre = numeroOrdre;
	}



	public int getNumeroDeTel() {
		return numeroDeTel;
	}



	public void setNumeroDeTel(int numeroDeTel) {
		this.numeroDeTel = numeroDeTel;
	}



	public Date getDtNaissance() {
		return dtNaissance;
	}



	public void setDtNaissance(Date dtNaissance) {
		this.dtNaissance = dtNaissance;
	}



	public Date getHoraireOuverture() {
		return horaireOuverture;
	}



	public void setHoraireOuverture(Date horaireOuverture) {
		this.horaireOuverture = horaireOuverture;
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



	public boolean isCheque() {
		return cheque;
	}



	public void setCheque(boolean cheque) {
		this.cheque = cheque;
	}



	public boolean isCb() {
		return cb;
	}



	public void setCb(boolean cb) {
		this.cb = cb;
	}



	public boolean isEspece() {
		return espece;
	}



	public void setEspece(boolean espece) {
		this.espece = espece;
	}



	public Utilisateur getUtilisateur() {
		return utilisateur;
	}



	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
	

}
