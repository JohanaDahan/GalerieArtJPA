/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;
/**
 *
 * @author johan
 */
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Personne {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private String nom;
    
    @Column(unique=true, nullable=true)
    @NonNull
    private String adresse;
    
    @OneToMany(mappedBy = "client", cascade= CascadeType.PERSIST)
    private List<Transaction> achat;
    
     public float budgetArt(int annee) {
        float budgetAnnuel = 0;
        for (Transaction transaction : achat){
            if (transaction.getVenduLe().getYear() == annee)
                budgetAnnuel += transaction.getPrixVente();
        }
        return budgetAnnuel;
    }
}

    
    
