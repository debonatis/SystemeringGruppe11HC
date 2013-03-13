package Modell;
// Generated 13.mar.2013 20:07:38 by Hibernate Tools 3.2.1.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Utkjoring generated by hbm2java
 */
@Entity
@Table(name="UTKJORING"
    ,schema="WAPLJ"
)
public class Utkjoring  implements java.io.Serializable {


     private UtkjoringId id;
     private String utkorinkogstatus;

    public Utkjoring() {
    }

	
    public Utkjoring(UtkjoringId id) {
        this.id = id;
    }
    public Utkjoring(UtkjoringId id, String utkorinkogstatus) {
       this.id = id;
       this.utkorinkogstatus = utkorinkogstatus;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="brukernavn", column=@Column(name="BRUKERNAVN", nullable=false, length=10) ), 
        @AttributeOverride(name="salgsnummer", column=@Column(name="SALGSNUMMER", nullable=false, length=10) ), 
        @AttributeOverride(name="bilnr", column=@Column(name="BILNR", nullable=false) ), 
        @AttributeOverride(name="sjoforbrukernavn", column=@Column(name="SJOFORBRUKERNAVN", nullable=false, length=10) ) } )
    public UtkjoringId getId() {
        return this.id;
    }
    
    public void setId(UtkjoringId id) {
        this.id = id;
    }
    
    @Column(name="UTKORINKOGSTATUS", length=10)
    public String getUtkorinkogstatus() {
        return this.utkorinkogstatus;
    }
    
    public void setUtkorinkogstatus(String utkorinkogstatus) {
        this.utkorinkogstatus = utkorinkogstatus;
    }




}


