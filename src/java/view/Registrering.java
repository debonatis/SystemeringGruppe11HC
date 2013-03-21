/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.BostedFacade;
import Controller.BrukerFacade;
import Controller.RolleFacade;
import Modell.Bosted;
import Modell.Bruker;
import Modell.Rolle;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.FlowEvent;
import view.util.JsfUtil;

/**
 *
 * @author deb
 */
@Named(value = "registrering")
@SessionScoped
public class Registrering implements Serializable{

    @EJB
    private BostedFacade bostedFacade;
    @EJB
    private RolleFacade rolleFacade;
    @EJB
    private BrukerFacade brukerFacade;
    private Bruker bruker = new Bruker();
    private Rolle rolle = new Rolle();
    private Bosted bosted = new Bosted();
    private boolean skip;
    private static final Logger logger = Logger.getLogger(Registrering.class.getName());

    private void prepareCreate() {

        bruker = new Bruker();
        rolle = new Rolle();
        bosted = new Bosted();
    }

    public Bruker getBruker() {
        return bruker;
    }

    public void setBruker(Bruker bruker) {
        this.bruker = bruker;
    }

    public Rolle getRolle() {
        return rolle;
    }

    public void setRolle(Rolle rolle) {
        this.rolle = rolle;
    }

    public Bosted getBosted() {
        return bosted;
    }

    public void setBosted(Bosted bosted) {
        this.bosted = bosted;
    }

    public void save(ActionEvent actionEvent) {

        bostedFacade.create(bosted);
        brukerFacade.create(bruker);
        rolleFacade.create(rolle);
        prepareCreate();


        FacesMessage msg = new FacesMessage("Successful", "Welcome :" + bruker.getFornavn());
        JsfUtil.addMessage("Welcome :" + bruker.getFornavn());
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
