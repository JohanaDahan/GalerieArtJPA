/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 *
 * @author johan
 */
public class GalerieTest {
    
    private LocalDate dateExposition;
    private Galerie g;
    private Personne p;
    private Transaction transaction;
    private Exposition e;
    private Tableau tableau;
    private Artiste a;
    
float prixVente = 10000;
    
    
    
    
    
    @BeforeEach
    public void Setup(){
        dateExposition = LocalDate.of(2021,05,03);
        g = new Galerie("Saatchi", "King's Road, Londres");
        p = new Personne("BASTIDE","25 rue de Castres");
        e = new Exposition(dateExposition,"l'art brut comptemporain",10,g);
        a = new Artiste();
        tableau = new Tableau("NomDuTableau","Toile",10,100,a);
        
    }
    
 @Test
    public void testCAannuel(){
        float CA = g.CAannuel(2021);
        assertEquals(30000, CA, "le chiffre d'affaires doit être de 30 000");
    }
}
