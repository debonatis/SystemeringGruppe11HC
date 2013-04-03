/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.OrdretabellFacade;
import Controller.RetterFacade;
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
import view.util.JsfUtil;

/**
 *
 * @author deb
 */
@Named
@SessionScoped
public class Bestilling implements Serializable{   
  
    private List<Retter> retter;  
  
    private List<Retter> droppedRetters;  
    @EJB
    private RetterFacade retterFacade;
    @EJB
    private OrdretabellFacade ordreTabellFacade;
    private Ordretabell ordre;    
    private OrdretabellId ordreId;
    
  
    public Bestilling() {          
        droppedRetters = new ArrayList<Retter>(); 
        retter = new ArrayList(retterFacade.findAll());
        ordre = new Ordretabell();
        ordreId = new OrdretabellId();
      
    }  
  
   public void nullstill(){
        retter = new ArrayList<Retter>();  
        droppedRetters = new ArrayList<Retter>(); 
        ordre = new Ordretabell();
        ordreId = new OrdretabellId();
   }
  
    public List<Retter> getRetter() {  
        return retter;  
    }  
  public void save() {
        
        ordreId = new OrdretabellId(String.valueOf(getUUID()), null, null);
        


       
        JsfUtil.addMessage("You have a succsefull pick :");
       
        nullstill();
    }
      
  public UUID getUUID(){
      UUID idOne = UUID.randomUUID();
      return  idOne;
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

