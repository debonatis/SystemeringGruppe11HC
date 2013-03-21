/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Modell.Bosted;
import Modell.Bruker;
import Modell.Rolle;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.FlowEvent;
import view.util.JsfUtil;

/**
 *
 * @author deb
 */
@Named(value = "registrering")
@Dependent
public class Registrering {

    private BrukerController bruker = new BrukerController();
    private RolleController rolle = new RolleController();
    private BostedController bosted = new BostedController();
    private boolean skip;
    private static final Logger logger = Logger.getLogger(Registrering.class.getName());
    
     public Bruker getUser() {  
        return bruker.getSelected();  
    }  
  
    public void setUser(Bruker bruker) {  
        this.bruker.setCurrent(bruker);  
    }
     public Rolle getRolle() {  
        return rolle.getSelected();  
    }  
  
    public void setRolle(Rolle rolle) {  
        this.rolle.setCurrent(rolle);  
    }
    
    public Bosted getBosted(){
        return bosted.getSelected();
    }
    
    public void setBosted(Bosted bosted){
        this.bosted.setCurrent(bosted);
    }

    public void save(ActionEvent actionEvent) {
        bruker.create();
        rolle.create();
        bosted.create();
        FacesMessage msg = new FacesMessage("Successful", "Welcome :" + bruker.getSelected().getFornavn());
        JsfUtil.addMessage("Welcome :" + bruker.getSelected().getFornavn());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public String onFlowProcess(FlowEvent event) {
        logger.log(Level.INFO, "Current wizard step:{0}", event.getOldStep());
        logger.log(Level.INFO, "Next step:{0}", event.getNewStep());

        if (skip) {
            skip = false;   //reset in case user goes back  
            return "confirm";
        } else {
            return event.getNewStep();
        }
    }
}
