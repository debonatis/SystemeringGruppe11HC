/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Modell.Sjoforer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author deb
 */
@Stateless
public class SjoforerFacade extends AbstractFacade<Sjoforer> {
    @PersistenceContext(unitName = "HealthyCateringPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SjoforerFacade() {
        super(Sjoforer.class);
    }
    
}
