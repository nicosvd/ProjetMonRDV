package formation.dao;

import java.util.List;

import formation.model.Praticien;
import formation.model.Utilisateur;

public interface IDaoUtilisateur extends IDao<Utilisateur,Long> {
	public List<Praticien> findAllPraticien();
}
