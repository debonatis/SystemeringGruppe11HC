package Modell;
// Generated 13.mar.2013 20:07:38 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrdretabellId generated by hbm2java
 */
@Embeddable
public class OrdretabellId  implements java.io.Serializable {


     private String salgsnummer;
     private String selgerbrukernavn;
     private String kundebrukernavn;

    public OrdretabellId() {
    }

    public OrdretabellId(String salgsnummer, String selgerbrukernavn, String kundebrukernavn) {
       this.salgsnummer = salgsnummer;
       this.selgerbrukernavn = selgerbrukernavn;
       this.kundebrukernavn = kundebrukernavn;
    }
   

    @Column(name="SALGSNUMMER", nullable=false, length=10)
    public String getSalgsnummer() {
        return this.salgsnummer;
    }
    
    public void setSalgsnummer(String salgsnummer) {
        this.salgsnummer = salgsnummer;
    }

    @Column(name="SELGERBRUKERNAVN", nullable=false, length=10)
    public String getSelgerbrukernavn() {
        return this.selgerbrukernavn;
    }
    
    public void setSelgerbrukernavn(String selgerbrukernavn) {
        this.selgerbrukernavn = selgerbrukernavn;
    }

    @Column(name="KUNDEBRUKERNAVN", nullable=false, length=10)
    public String getKundebrukernavn() {
        return this.kundebrukernavn;
    }
    
    public void setKundebrukernavn(String kundebrukernavn) {
        this.kundebrukernavn = kundebrukernavn;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OrdretabellId) ) return false;
		 OrdretabellId castOther = ( OrdretabellId ) other; 
         
		 return ( (this.getSalgsnummer()==castOther.getSalgsnummer()) || ( this.getSalgsnummer()!=null && castOther.getSalgsnummer()!=null && this.getSalgsnummer().equals(castOther.getSalgsnummer()) ) )
 && ( (this.getSelgerbrukernavn()==castOther.getSelgerbrukernavn()) || ( this.getSelgerbrukernavn()!=null && castOther.getSelgerbrukernavn()!=null && this.getSelgerbrukernavn().equals(castOther.getSelgerbrukernavn()) ) )
 && ( (this.getKundebrukernavn()==castOther.getKundebrukernavn()) || ( this.getKundebrukernavn()!=null && castOther.getKundebrukernavn()!=null && this.getKundebrukernavn().equals(castOther.getKundebrukernavn()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSalgsnummer() == null ? 0 : this.getSalgsnummer().hashCode() );
         result = 37 * result + ( getSelgerbrukernavn() == null ? 0 : this.getSelgerbrukernavn().hashCode() );
         result = 37 * result + ( getKundebrukernavn() == null ? 0 : this.getKundebrukernavn().hashCode() );
         return result;
   }   


}


