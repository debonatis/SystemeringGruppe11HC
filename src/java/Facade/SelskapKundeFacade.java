/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Modell.SelskapKunde;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author deb
 */
@Stateless
public class SelskapKundeFacade extends AbstractFacade<SelskapKunde> {
    @PersistenceContext(unitName = "HealthyCateringPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SelskapKundeFacade() {
        super(SelskapKunde.class);
    }
    
}
