package org.materiel.models;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "client", schema = "materiel")
public class Client {

    @Id
    @Column(name = "idClient")
    private int idClient;
    private String codeClient;
    private String nomClient;
    private String adresseClient;
    private int typeClient;

    @ManyToOne
    @JoinColumn(name = "idficheLocation")
    private FicheLocation fichelocation;

    public int getIdClient() {return idClient;}
    public void setIdClient(int idClient) {this.idClient = idClient;}

    public String getCodeClient() {return codeClient;}
    public void setCodeClient(String codeClient) {this.codeClient = codeClient;}

    public String getNomClient() {return nomClient;}
    public void setNomClient(String nomClient) {this.nomClient = nomClient;}

    public String getAdresseClient() {return adresseClient;}
    public void setAdresseClient(String adresseClient) {this.adresseClient = adresseClient;}

    public int getTypeClient() {return typeClient;}
    public void setTypeClient(int typeClient) {this.typeClient = typeClient;}

    public FicheLocation getFicheLocation() {return fichelocation;}
    public void setFicheLocation(FicheLocation fichelocation) {this.fichelocation = fichelocation;}
}
