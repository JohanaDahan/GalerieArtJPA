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
@Getter @Setter @RequiredArgsConstructor @ToString
@Entity
public class Artiste extends Personne{
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    
    @Column(unique=true)
    private String bibliographie;
    
    
    @OneToMany(mappedBy = "auteur", cascade= CascadeType.PERSIST)
    private List<Tableau> oeuvres;
}
