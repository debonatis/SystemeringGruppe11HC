package Modell;
// Generated 03.apr.2013 14:31:55 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Salg generated by hbm2java
 */
@Entity
@Table(name="salg"
    ,catalog="waplj"
)
public class Salg  implements java.io.Serializable {


     private String salgsnummer;
     private String sumSalg;

    public Salg() {
    }

	
    public Salg(String salgsnummer) {
        this.salgsnummer = salgsnummer;
    }
    public Salg(String salgsnummer, String sumSalg) {
       this.salgsnummer = salgsnummer;
       this.sumSalg = sumSalg;
    }
   
     @Id 
    
    @Column(name="salgsnummer", unique=true, nullable=false, length=10)
    public String getSalgsnummer() {
        return this.salgsnummer;
    }
    
    public void setSalgsnummer(String salgsnummer) {
        this.salgsnummer = salgsnummer;
    }
    
    @Column(name="sumSalg", length=10)
    public String getSumSalg() {
        return this.sumSalg;
    }
    
    public void setSumSalg(String sumSalg) {
        this.sumSalg = sumSalg;
    }




}


