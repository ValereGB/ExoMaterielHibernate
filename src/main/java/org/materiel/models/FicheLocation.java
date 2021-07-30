package org.materiel.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "fichelocation", schema = "materiel")
public class FicheLocation {

    @Id
    @Column(name = "idficheLocation")
    private int idficheLocation;
    private int numLocation;
    private int dureeLocation;
    private Date dateLocation;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Materiel> materiels;

    @OneToMany(mappedBy = "fichelocation", fetch = FetchType.EAGER)
    private List<Client> clients;

    public int getIdficheLocation() {return idficheLocation;}
    public void setIdficheLocation(int idficheLocation) {this.idficheLocation = idficheLocation;}

    public int getNumLocation() {return numLocation;}
    public void setNumLocation(int numLocation) {this.numLocation = numLocation;}

    public int getDureeLocation() {return dureeLocation;}
    public void setDureeLocation(int dureeLocation) {this.dureeLocation = dureeLocation;}

    public Date getDateLocation() {return dateLocation;}
    public void setDateLocation(Date dateLocation) {this.dateLocation = dateLocation;}

    public List<Materiel> getMateriels() {return materiels;}
    public void setMateriels(List<Materiel> materiels) {this.materiels = materiels;}

    public List<Client> getClients() {return clients;}
    public void setClients(List<Client> clients) {this.clients = clients;}
}
