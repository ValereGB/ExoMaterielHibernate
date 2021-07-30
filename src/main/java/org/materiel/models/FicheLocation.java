package org.materiel.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.List;

public class FicheLocation {

    @Id
    @Column(name = "idficheLocation")
    private int idficheLocation;
    private int numLocation;
    private int dureeLocation;
    private Date dateLocation;

    @ManyToMany(mappedBy = "ficheLocation")
    private List<Materiel> materiels;

    public int getId() {return idficheLocation;}
    public void setId(int idficheLocation) {this.idficheLocation = idficheLocation;}

    public int getNumLocation() {return numLocation;}
    public void setNumLocation(int numLocation) {this.numLocation = numLocation;}

    public int getDureeLocation() {return dureeLocation;}
    public void setDureeLocation(int dureeLocation) {this.dureeLocation = dureeLocation;}

    public Date getDateLocation() {return dateLocation;}
    public void setDateLocation(Date dateLocation) {this.dateLocation = dateLocation;}

    public List<Materiel> getMateriels() {return materiels;}
    public void setMateriels(List<Materiel> materiels) {this.materiels = materiels;}
}
