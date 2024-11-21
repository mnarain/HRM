/*
package sr.unasat.hrm.entities;


*/
/*@Entity
@Table(name = "werknemer")*//*

public class Werknemer {
*/
/*    @Id
    @Column(name = "id", nullable = false)*//*

    private Integer id;
//    @Column(name = "voornaam", length = 45)
    private String voornaam;
//    @Column(name = "achternaam", length = 45)
    private String achternaam;
//    @Column(name = "extensie", length = 45)
    private String extensie;
//    @Column(name = "telefoon")
    private Integer telefoon;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "afdeling")
    private Afdeling afdeling;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "functie")
    private Functie functie;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getExtensie() {
        return extensie;
    }

    public void setExtensie(String extensie) {
        this.extensie = extensie;
    }

    public Integer getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(Integer telefoon) {
        this.telefoon = telefoon;
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }

    public void setAfdeling(Afdeling afdeling) {
        this.afdeling = afdeling;
    }

    public Functie getFunctie() {
        return functie;
    }

    public void setFunctie(Functie functie) {
        this.functie = functie;
    }
}*/
