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
import java.util.Iterator;
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
    private OrdretabellFacade ordretabellFacade;
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

        ordre = new Ordretabell();
        ordreId = new OrdretabellId();

    }

    public void nullstill() {
        retter = retterFacade.findAll();
        ordre = new Ordretabell();
        ordreId = new OrdretabellId();
        droppedRetters.clear();
    }

    public List<Retter> getRetter() {
        retter = retterFacade.findAll();
        return retter;
    }

    public void refresh() {
        retter = retterFacade.findAll();
    }

    public void save() {
        if (!droppedRetters.isEmpty()) {
            ordreId = new OrdretabellId(String.valueOf(getUUID()), "simonD", BrukerBehandling.getUserData());
            //BrukerBehandling.getUser() skal stå istrendenfor marti
            for (Iterator c = droppedRetters.iterator(); c.hasNext();) {
                Retter e = (Retter) c.next();
                ordretabellFacade.create(new Ordretabell(ordreId, e.getRettnummer()));
            }
            JsfUtil.addMessage("You have a succsefull pick :");
            nullstill();

        } else if (droppedRetters.isEmpty()) {
            JsfUtil.addMessage("You have a to pick something to have a succsefull pick :");
        }

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
