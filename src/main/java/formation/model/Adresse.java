package formation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "adress")
public class Adresse {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="number")
	private int numero;
	@Column(name="street")
	private String rue;
	@Column(name="zipcode")
	private int codePostal;
	@Column(name="city")
	private String ville;
	@Column(name="country")
	private String pays;
	@OneToOne (mappedBy = "adresse")
	private Patient patient;
	@OneToOne(mappedBy="adresse")
	private Creneau creneau;
	@OneToMany (mappedBy="adresse")
	private List<AdressePraticien> adresses=new ArrayList<>();
	

	public List<AdressePraticien> getAdressePraticien() {
		return adresses;
	}

	public void setAdressePraticien(List<AdressePraticien> adresses) {
		this.adresses = adresses; }

	public Adresse() {
	}

	public Adresse(int numero, String rue, int codePostal, String ville, String pays) {
		this.numero = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

}
