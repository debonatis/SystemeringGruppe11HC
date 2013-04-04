/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Bean.Bestilling;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author deb
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({})
public class NewTestSuite {

   public static void main(String[] args){
       Bestilling mick = new Bestilling();
       
       System.out.println(mick.getRetter());
   }
    
}
