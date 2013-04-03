package DBconf;
// Generated 03.apr.2013 13:53:58 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UtkjoringsBil generated by hbm2java
 */
@Entity
@Table(name="utkjoringsBil"
    ,catalog="waplj"
)
public class UtkjoringsBil  implements java.io.Serializable {


     private Integer bilnr;
     private String regnummer;
     private String status;

    public UtkjoringsBil() {
    }

    public UtkjoringsBil(String regnummer, String status) {
       this.regnummer = regnummer;
       this.status = status;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="bilnr", unique=true, nullable=false)
    public Integer getBilnr() {
        return this.bilnr;
    }
    
    public void setBilnr(Integer bilnr) {
        this.bilnr = bilnr;
    }
    
    @Column(name="regnummer", nullable=false, length=10)
    public String getRegnummer() {
        return this.regnummer;
    }
    
    public void setRegnummer(String regnummer) {
        this.regnummer = regnummer;
    }
    
    @Column(name="status", nullable=false, length=10)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}

