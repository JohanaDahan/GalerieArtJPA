/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  
package galerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import galerie.entity.Exposition;
import org.springframework.data.jpa.repository.Query;

// This will be AUTO IMPLEMENTED by Spring 

public interface ExpositionRepository extends JpaRepository<Exposition, Integer> {

    /**
     * Calculer le chiffre d'affaires pour une exposition
     * @param id la clé primaire de l'exposition
     * @return le chiffre d'affaires de cette exposition
     */
    //float chiffreAffairePour(Integer id);
     @Query(
    "Select SUM(PRIX_VENTE) as CA FROM exposition"+
    "INNER JOIN transaction ON Lieu_De_Vente_ID = Exposition.ID"+
    "WHERE Lieu_De_Vente_ID = :id"
    )
    float chiffreAffairePour(Integer id);
    

}
