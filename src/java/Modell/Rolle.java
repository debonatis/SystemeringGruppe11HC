package Modell;
// Generated 13.mar.2013 20:07:38 by Hibernate Tools 3.2.1.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Rolle generated by hbm2java
 */
@Entity
@Table(name="ROLLE"
    ,schema="WAPLJ"
)
public class Rolle  implements java.io.Serializable {


     private RolleId id;

    public Rolle() {
    }

    public Rolle(RolleId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="brukernavn", column=@Column(name="BRUKERNAVN", nullable=false, length=10) ), 
        @AttributeOverride(name="rollen", column=@Column(name="ROLLEN", nullable=false, length=10) ) } )
    public RolleId getId() {
        return this.id;
    }
    
    public void setId(RolleId id) {
        this.id = id;
    }




}


