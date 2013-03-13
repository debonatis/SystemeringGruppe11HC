/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modell.Kunde;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import org.netbeans.saas.google.GoogleMapService;
import org.netbeans.saas.RestResponse;

/**
 *
 * @author deb
 */
@Stateless
public class KundeFacade extends AbstractFacade<Kunde> {

    @PersistenceContext(unitName = "HealthyCateringPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KundeFacade() {
        super(Kunde.class);
    }
}
