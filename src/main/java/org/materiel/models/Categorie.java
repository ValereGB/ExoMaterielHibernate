package org.materiel.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Categorie", schema = "materiel")
public class Categorie {

    @Id
    @Column(name = "idCategorie")
    private int idCategorie;
    private String codeCategorie;
    private String libelleCategorie;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<Materiel> materiels;

    public int getId() {return idCategorie;}
    public void setId(int idCategorie) {this.idCategorie = idCategorie;}

    public String getCodeCategorie() {return codeCategorie;}
    public void setCodeCategorie(String codeCategorie) {this.codeCategorie = codeCategorie;}

    public String getLibelleCategorie() {return libelleCategorie;}
    public void setLibelleCategorie(String libelleCategorie) {this.libelleCategorie = libelleCategorie;}

    public List<Materiel> getMateriels() {return materiels;}
    public void setMateriels(List<Materiel> materiels) {this.materiels = materiels;}
}
