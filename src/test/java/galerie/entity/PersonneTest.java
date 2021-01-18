/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.time.LocalDate;
import static java.time.LocalDate.now;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author johan
 */
public class PersonneTest {
    
    private LocalDate dateExpo;
    private Personne p;
    private Transaction tran;
    private Exposition e;
    private Tableau tableau;
    private Galerie g;
    private Artiste a;
    
    @BeforeEach
    public void Setup(){
        dateExpo = LocalDate.of(2021,01,01);
        g = new Galerie("Saatchi", "King's Road, Londres");
        e = new Exposition(dateExpo,"Banksy",10,g);
        p = new Personne("Dahan","50ruedemetz");
        a = new Artiste();
        tableau = new Tableau("La Joconde","Toile",100,100,a);
        
    }
    @Test
    public void testBudgetArt(){
        
        assertEquals(0,p.budgetArt(2020),"Il ne devrait pas y avoir eu de ventes en 2020.");
        
    }
}
