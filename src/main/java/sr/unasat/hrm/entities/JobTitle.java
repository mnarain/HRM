package sr.unasat.hrm.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "job_title")
public class JobTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", length = 254, nullable = false, unique = true)
    private String name;
//    @OneToMany(mappedBy = "functie")
//    private Set<Werknemer> werknemers = new LinkedHashSet<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JobTitle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}