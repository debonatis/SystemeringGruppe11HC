package Modell;
// Generated 03.apr.2013 13:49:43 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Annet generated by hbm2java
 */
@Entity
@Table(name="annet"
    ,catalog="waplj"
)
public class Annet  implements java.io.Serializable {


     private String brukernavn;
     private String fastlonn;

    public Annet() {
    }

	
    public Annet(String brukernavn) {
        this.brukernavn = brukernavn;
    }
    public Annet(String brukernavn, String fastlonn) {
       this.brukernavn = brukernavn;
       this.fastlonn = fastlonn;
    }
   
     @Id 
    
    @Column(name="brukernavn", unique=true, nullable=false, length=10)
    public String getBrukernavn() {
        return this.brukernavn;
    }
    
    public void setBrukernavn(String brukernavn) {
        this.brukernavn = brukernavn;
    }
    
    @Column(name="fastlonn", length=10)
    public String getFastlonn() {
        return this.fastlonn;
    }
    
    public void setFastlonn(String fastlonn) {
        this.fastlonn = fastlonn;
    }




}


