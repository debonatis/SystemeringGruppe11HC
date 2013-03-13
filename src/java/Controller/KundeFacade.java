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

    @GET
    @Produces("text/html")
    public String getGoogleMap() {
// Drag and drop the getGoogleMap operation here

        try {
            String address = "16 Network Circle, Menlo Park";
            java.lang.Integer zoom = 15;
            String iframe = "false";

            RestResponse result = GoogleMapService.getGoogleMap(address, zoom, iframe);
            //TODO - Uncomment the print Statement below to print result.
           return result.getDataAsString();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return "";
    }
}
