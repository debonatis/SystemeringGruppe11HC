/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Modell.Bosted;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author deb
 */
@Stateless
public class BostedFacade extends AbstractFacade<Bosted> {
    @PersistenceContext(unitName = "HealthyCateringPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BostedFacade() {
        super(Bosted.class);
    }
    
}
