package org.materiel.models;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Materiel", schema = "materiel")
public class Materiel {

    @Id
    @Column(name = "idMateriel")
    private int idMateriel;
    private String designation;
    private int prixLocation;
    private Date dateAchat;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<FicheLocation> ficheLocation;

    @ManyToOne
    @JoinColumn(name = "idCategorie")
    private Categorie categories;

    public int getId() {return idMateriel;}
    public void setId(int idMateriel) {this.idMateriel = idMateriel;}

    public String getDesignation() {return designation;}
    public void setDesignation(String designation) {this.designation = designation;}

    public int getPrixLocation() {return prixLocation;}
    public void setPrixLocation(int prixLocation) {this.prixLocation = prixLocation;}

    public Date getDateAchat() {return dateAchat;}
    public void setDateAchat(Date dateAchat) {this.dateAchat = dateAchat;}

    public List<FicheLocation> getFicheLocation() {return ficheLocation;}
    public void setFicheLocation(List<FicheLocation> ficheLocation) {this.ficheLocation = ficheLocation;}

    public Categorie getCategorie() { return categories;}
    public void setCategorie(Categorie categories) {this.categories = categories;}
}
