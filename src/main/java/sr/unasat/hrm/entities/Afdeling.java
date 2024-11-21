/*
package sr.unasat.hrm.entities;

import java.util.LinkedHashSet;
import java.util.Set;

*/
/*@Entity
@Table(name = "afdeling")*//*

public class Afdeling {
*/
/*    @Id
    @Column(name = "id", nullable = false)*//*

    private Integer id;
//    @Column(name = "naam", length = 20)
    private String naam;
//    @OneToMany(mappedBy = "afdeling")
    private Set<Werknemer> werknemers = new LinkedHashSet<>();


}*/
