package org.materiel;

import org.materiel.models.Categorie;
import org.materiel.repositories.CategorieRepository;
import org.materiel.repositories.ClientRepository;
import org.materiel.repositories.FicheLocationRepository;
import org.materiel.repositories.MaterielRepository;

public class App {
    public static void main(String[] args) {

        CategorieRepository categorie = new CategorieRepository();
        ClientRepository client = new ClientRepository();
        FicheLocationRepository fichelocation = new FicheLocationRepository();
        MaterielRepository materiel = new MaterielRepository();

        Categorie categorie1 = new Categorie();
        categorie1.setCodeCategorie("MI");
        categorie1.setLibelleCategorie("Materiel Medical");
    }
}
