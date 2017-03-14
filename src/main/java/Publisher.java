import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * Created by Home on 11.03.2017.
 */
@Entity
@Table(name = "publisher")
public class Publisher {
    @Id
    @Column(name = "Id", length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "date", length = 100)
    @Temporal(value=TemporalType.DATE)
    private Date date;

    @Column(name = "headquarters", length = 250)
    private String headquarters;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Franchise> franchises = new HashSet();

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Developer> developers = new HashSet();

    public Publisher(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public Set getFranchises() {
        return franchises;
    }

    public void setFranchises(Set franchises) {
        this.franchises = franchises;
    }

    public Set getDevelopers() {
        return developers;
    }

    public void setDevelopers(Set developers) {
        this.developers = developers;
    }
}
