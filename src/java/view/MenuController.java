/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.component.menuitem.MenuItem;
import org.primefaces.component.submenu.Submenu;
import org.primefaces.model.DefaultMenuModel;
import org.primefaces.model.MenuModel;

/**
 *
 * @author deb
 */
@ManagedBean(name = "MenuController")
@SessionScoped
public class MenuController {
     private MenuModel model;  
  
    public MenuController() {  
        model = new DefaultMenuModel();  
          
        //First submenu  
        Submenu submenu = new Submenu();  
        submenu.setLabel("Bestillinger Admin");  
          
        MenuItem item = new MenuItem();  
        item.setValue("Bestillinger");  
        item.setUrl("/ordre/List");          
        submenu.getChildren().add(item);  
          
        model.addSubmenu(submenu);  
          
        //Second submenu  
        submenu = new Submenu();  
        submenu.setLabel("Sjåfør");  
          
        item = new MenuItem();  
        item.setValue("Dynamic Menuitem 2.1");  
        item.setUrl("#");  
        submenu.getChildren().add(item);  
          
        item = new MenuItem();  
        item.setValue("Dynamic Menuitem 2.2");  
        item.setUrl("#");  
        submenu.getChildren().add(item);  
          
        model.addSubmenu(submenu);  
    }  
  
    public MenuModel getModel() {  
        return model;  
    }     
}
