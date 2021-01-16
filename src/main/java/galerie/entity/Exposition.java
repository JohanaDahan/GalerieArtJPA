/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import javax.persistence.*;
import lombok.*;


/**
 *
 * @author johan
 */
@Setter @NoArgsConstructor @RequiredArgsConstructor @ToString@Entity
public class Exposition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        
	@NonNull
	@Column(unique=false)
        private Date debut;
        
        @NonNull
	@Column(unique=false)
        private String intitule;
        
        @NonNull
	@Column(unique=false)
        private int duree;
        
                
                
        @ManyToOne(optional = false)
        @NonNull
        private Galerie oraganisateur;   


  @ManyToMany
    @JoinTable(name="accrochage",joinColumns = @JoinColumn(name="exposition_id"),inverseJoinColumns = @JoinColumn(name="tableau_id"))
    private List<Tableau> oeuvres= new LinkedList<>();
    
    
        @OneToMany(mappedBy = "lieuDeVente", cascade= CascadeType.PERSIST)
        private List<Transaction> ventes;

  public float CA(){
        float ca=0;
        for (Transaction v:ventes){
            ca = ca + v.getPrixVente();
        }
        return ca;
    }
    
   
}
