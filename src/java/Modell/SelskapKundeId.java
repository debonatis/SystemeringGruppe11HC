package Modell;
// Generated 03.apr.2013 14:31:55 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SelskapKundeId generated by hbm2java
 */
@Embeddable
public class SelskapKundeId  implements java.io.Serializable {


     private String brukernavn;
     private int selskapnr;

    public SelskapKundeId() {
    }

    public SelskapKundeId(String brukernavn, int selskapnr) {
       this.brukernavn = brukernavn;
       this.selskapnr = selskapnr;
    }
   

    @Column(name="brukernavn", nullable=false, length=10)
    public String getBrukernavn() {
        return this.brukernavn;
    }
    
    public void setBrukernavn(String brukernavn) {
        this.brukernavn = brukernavn;
    }

    @Column(name="selskapnr", nullable=false)
    public int getSelskapnr() {
        return this.selskapnr;
    }
    
    public void setSelskapnr(int selskapnr) {
        this.selskapnr = selskapnr;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SelskapKundeId) ) return false;
		 SelskapKundeId castOther = ( SelskapKundeId ) other; 
         
		 return ( (this.getBrukernavn()==castOther.getBrukernavn()) || ( this.getBrukernavn()!=null && castOther.getBrukernavn()!=null && this.getBrukernavn().equals(castOther.getBrukernavn()) ) )
 && (this.getSelskapnr()==castOther.getSelskapnr());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getBrukernavn() == null ? 0 : this.getBrukernavn().hashCode() );
         result = 37 * result + this.getSelskapnr();
         return result;
   }   


}


