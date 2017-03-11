import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Home on 11.03.2017.
 */
public class Franchise {
    private long id;
    private String name;
    private Date date;
    private long pub_id;
    private Set games = new HashSet();

    public Franchise(){
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

    public long getPub_id() {
        return pub_id;
    }

    public void setPub_id(long pub_id) {
        this.pub_id = pub_id;
    }

    public Set getGames() {
        return games;
    }

    public void setGames(Set games) {
        this.games = games;
    }
}
