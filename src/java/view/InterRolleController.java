/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Modell.Rolle;
import java.io.Serializable;
import javax.faces.model.DataModel;
import javax.faces.model.SelectItem;
import view.util.PaginationHelper;

/**
 *
 * @author deb
 */
public interface InterRolleController extends Serializable {

    String create();

    String destroy();

    String destroyAndView();

    DataModel getItems();

    SelectItem[] getItemsAvailableSelectMany();

    SelectItem[] getItemsAvailableSelectOne();

    PaginationHelper getPagination();

    Rolle getSelected();

    String next();

    String prepareCreate();

    String prepareEdit();

    String prepareList();

    String prepareView();

    String previous();

    String update();
    
}
