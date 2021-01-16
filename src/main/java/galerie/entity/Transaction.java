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
public class Transaction {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;


    @Column(unique=true)
    @NonNull
    private Date venduLe;
    
     @Column(unique=true)
    @NonNull
    private float prixVente;
    
    @ManyToOne
    private Personne client;
    
    @OneToOne
    private Tableau oeuvre;
    
    @ManyToOne
    private Exposition lieuDeVente;

}
