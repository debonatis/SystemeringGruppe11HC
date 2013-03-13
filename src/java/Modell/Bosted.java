package Modell;
// Generated 13.mar.2013 20:07:38 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Bosted generated by hbm2java
 */
@Entity
@Table(name="BOSTED"
    ,schema="WAPLJ"
)
public class Bosted  implements java.io.Serializable {


     private int postnummer;
     private String poststed;

    public Bosted() {
    }

    public Bosted(int postnummer, String poststed) {
       this.postnummer = postnummer;
       this.poststed = poststed;
    }
   
     @Id 
    
    @Column(name="POSTNUMMER", unique=true, nullable=false)
    public int getPostnummer() {
        return this.postnummer;
    }
    
    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }
    
    @Column(name="POSTSTED", nullable=false, length=10)
    public String getPoststed() {
        return this.poststed;
    }
    
    public void setPoststed(String poststed) {
        this.poststed = poststed;
    }




}


