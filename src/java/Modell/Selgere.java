package Modell;
// Generated 03.apr.2013 13:17:58 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Selgere generated by hbm2java
 */
@Entity
@Table(name="selgere"
    ,catalog="waplj"
)
public class Selgere  implements java.io.Serializable {


     private String brukernavn;
     private String salgPerManed;
     private String opparbeidetProvisjon;
     private String antSalg;
     private String timer;

    public Selgere() {
    }

	
    public Selgere(String brukernavn) {
        this.brukernavn = brukernavn;
    }
    public Selgere(String brukernavn, String salgPerManed, String opparbeidetProvisjon, String antSalg, String timer) {
       this.brukernavn = brukernavn;
       this.salgPerManed = salgPerManed;
       this.opparbeidetProvisjon = opparbeidetProvisjon;
       this.antSalg = antSalg;
       this.timer = timer;
    }
   
     @Id 
    
    @Column(name="brukernavn", unique=true, nullable=false, length=10)
    public String getBrukernavn() {
        return this.brukernavn;
    }
    
    public void setBrukernavn(String brukernavn) {
        this.brukernavn = brukernavn;
    }
    
    @Column(name="salgPerManed", length=10)
    public String getSalgPerManed() {
        return this.salgPerManed;
    }
    
    public void setSalgPerManed(String salgPerManed) {
        this.salgPerManed = salgPerManed;
    }
    
    @Column(name="opparbeidetProvisjon", length=10)
    public String getOpparbeidetProvisjon() {
        return this.opparbeidetProvisjon;
    }
    
    public void setOpparbeidetProvisjon(String opparbeidetProvisjon) {
        this.opparbeidetProvisjon = opparbeidetProvisjon;
    }
    
    @Column(name="antSalg", length=10)
    public String getAntSalg() {
        return this.antSalg;
    }
    
    public void setAntSalg(String antSalg) {
        this.antSalg = antSalg;
    }
    
    @Column(name="timer", length=10)
    public String getTimer() {
        return this.timer;
    }
    
    public void setTimer(String timer) {
        this.timer = timer;
    }




}


