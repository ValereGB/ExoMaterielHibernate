package org.materiel.models;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Client", schema = "materiel")
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
    private FicheLocation ficheLocation;
}
