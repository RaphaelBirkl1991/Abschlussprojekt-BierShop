package com.example.backend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Warenkorb {

    // Properties

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(mappedBy = "warenkorb")
    private List<Produkt> produkte;
   // private int menge;

    //@JoinColumn
    //private String produktbezeichnung;
//    private double preis;



    // TODO ER zu Versand
//    @Enumerated(EnumType.STRING)
//    private Versand versand;

    public Warenkorb() {
    }

    public Warenkorb(List<Produkt> produkte) {
        this.produkte = produkte;
    }
}
