import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * Created by Home on 11.03.2017.
 */
public class Publisher {
    private Long id;
    private String name;
    private Date date;
    private String headquarters;
    private Set<Integer> franchises = new HashSet();
    private Set<Integer> developers = new HashSet();

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
