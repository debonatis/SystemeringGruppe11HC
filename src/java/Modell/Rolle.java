package Modell;
// Generated 03.apr.2013 14:31:55 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Rolle generated by hbm2java
 */
@Entity
@Table(name="rolle"
    ,catalog="waplj"
)
public class Rolle  implements java.io.Serializable {


     private String brukernavn;
     private String rollen;

    public Rolle() {
    }

    public Rolle(String brukernavn, String rollen) {
       this.brukernavn = brukernavn;
       this.rollen = rollen;
    }
   
     @Id 
    
    @Column(name="brukernavn", unique=true, nullable=false, length=10)
    public String getBrukernavn() {
        return this.brukernavn;
    }
    
    public void setBrukernavn(String brukernavn) {
        this.brukernavn = brukernavn;
    }
    
    @Column(name="rollen", nullable=false, length=10)
    public String getRollen() {
        return this.rollen;
    }
    
    public void setRollen(String rollen) {
        this.rollen = rollen;
    }




}


