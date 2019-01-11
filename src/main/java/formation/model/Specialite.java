package formation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="specialization")
public class Specialite {
@Id
@GeneratedValue
private Long id;
@Column(name="name")
private String nom;
@OneToMany (mappedBy="specialite")
private List<PraticienSpecialite> specialites=new ArrayList<>();



public Specialite() {
	super();
}



public Specialite(String nom) {
	super();
	this.nom = nom;
}



public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public String getNom() {
	return nom;
}



public void setNom(String nom) {
	this.nom = nom;
}



public List<PraticienSpecialite> getSpecialites() {
	return specialites;
}



public void setSpecialites(List<PraticienSpecialite> specialites) {
	this.specialites = specialites;
}
	


}
