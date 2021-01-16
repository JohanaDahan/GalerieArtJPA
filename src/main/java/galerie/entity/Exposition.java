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
class Exposition {
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



    @ManyToMany(mappedBy="exposition")
    private List<Tableau> accrochage = new LinkedList<>();
    
    
        @OneToMany(mappedBy = "lieuDeVente", cascade= CascadeType.PERSIST)
        private List<Transaction> ventes;

  
    
   
}
