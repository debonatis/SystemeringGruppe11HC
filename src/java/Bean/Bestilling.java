/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Bean.util.JsfUtil;
import Facade.OrdretabellFacade;
import Facade.RetterFacade;
import Modell.Ordretabell;
import Modell.OrdretabellId;
import Modell.Retter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.primefaces.event.DragDropEvent;

/**
 *
 * @author deb
 */
@Named
@SessionScoped
public class Bestilling implements Serializable {

    private List<Retter> retter;
    private List<Retter> droppedRetters;
    @EJB
    private RetterFacade retterFacade;
    @EJB
    private OrdretabellFacade ordreTabellFacade;
    private Ordretabell ordre;
    private OrdretabellId ordreId;
    private Retter selected;

    public Retter getSelected() {
        return selected;
    }

    public void setSelected(Retter selected) {
        this.selected = selected;
    }

    public Bestilling() {        
        retter = retterFacade.findAll();
        ordre = new Ordretabell();
        ordreId = new OrdretabellId();

    }

    public void nullstill() {
        retter.clear();
        droppedRetters.clear();
        ordre = new Ordretabell();
        ordreId = new OrdretabellId();
    }

    public List<Retter> getRetter() {
        return retter;
    }

    public void save() {

        ordreId = new OrdretabellId(String.valueOf(getUUID()), "simonD", "martinD");
        //BrukerBehandling.getUser() skal stå istrendenfor martinD
        for (int i = 0; i < droppedRetters.size(); i++) {
            ordreTabellFacade.create(new Ordretabell(ordreId, droppedRetters.get(i).getRettnummer()));
        }



        JsfUtil.addMessage("You have a succsefull pick :");

        nullstill();
    }

    public UUID getUUID() {
        UUID idOne = UUID.randomUUID();
        return idOne;
    }

    public void onRetterDrop(DragDropEvent ddEvent) {
        Retter rett = ((Retter) ddEvent.getData());

        droppedRetters.add(rett);
        retter.remove(rett);
    }

    public List<Retter> getDroppedRetters() {
        return droppedRetters;
    }
}
