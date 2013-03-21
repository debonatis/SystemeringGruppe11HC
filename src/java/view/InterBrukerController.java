/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Modell.Bruker;
import java.io.Serializable;
import javax.faces.model.DataModel;
import javax.faces.model.SelectItem;
import view.util.PaginationHelper;

/**
 *
 * @author deb
 */
public interface InterBrukerController extends Serializable {

    String create();

    String destroy();

    String destroyAndView();

    DataModel getItems();

    SelectItem[] getItemsAvailableSelectMany();

    SelectItem[] getItemsAvailableSelectOne();

    PaginationHelper getPagination();

    Bruker getSelected();

    String next();

    String prepareCreate();

    String prepareEdit();

    String prepareList();

    String prepareView();

    String previous();

    String update();
    
}
