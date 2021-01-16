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
public class Tableau {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @NonNull
    private String titre;
    
    @NonNull
    private String support;
    
    @NonNull
    private int largeur;
    
    @NonNull
    private int hauteur;
    
    @ManyToMany(mappedBy = "accrochage")
    @NonNull
    private List<Exposition> organisateur = new LinkedList<>();
    
    @OneToOne
    private Transaction vente;
    
    @ManyToOne(optional = false)
    @NonNull
    private Artiste auteur;
}