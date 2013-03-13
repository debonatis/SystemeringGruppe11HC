/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modell.Utkjoringsbil;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author deb
 */
@Stateless
public class UtkjoringsbilFacade extends AbstractFacade<Utkjoringsbil> {
    @PersistenceContext(unitName = "HealthyCateringPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UtkjoringsbilFacade() {
        super(Utkjoringsbil.class);
    }
    
}
