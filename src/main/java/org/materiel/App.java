package org.materiel;

import org.materiel.models.Categorie;
import org.materiel.models.Client;
import org.materiel.models.FicheLocation;
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

//        Categorie categorie1 = new Categorie();
//        categorie1.setCodeCategorie("MI");
//        categorie1.setLibelleCategorie("Materiel Medical");
//        categorie.save(categorie1);

        Categorie categorie2 = new Categorie();
        categorie2.setCodeCategorie("OI");
        categorie2.setLibelleCategorie("Outil de Maintenance");
        categorie.save(categorie2);

        FicheLocation ficheLocation1 = new FicheLocation();
        ficheLocation1.setNumLocation(325);
        ficheLocation1.setDureeLocation(20);
        fichelocation.save(ficheLocation1);

        Client client1 = new Client();
        client1.setCodeClient("ABC1");
        client1.setNomClient("Dupont Alex");
        client1.setAdresseClient("25 rue des Lillas");
        client1.setTypeClient(1);
        client.save(client1);
    }
}
