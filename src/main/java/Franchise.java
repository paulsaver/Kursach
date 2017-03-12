import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Home on 11.03.2017.
 */
@Entity
@Table( appliesTo = "franchise" )
public class Franchise {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "date")
    @Temporal(value=TemporalType.DATE)
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "pub_id")
    @JoinColumn(name = "pub_id", referencedColumnName = "id")
    private Publisher pub;

    @OneToMany(mappedBy = "franch_id", fetch = FetchType.LAZY)
    private Set<Game> games = new HashSet();

    public Franchise(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Publisher getPub() {
        return pub;
    }

    public void setPub_id(Publisher pub) {
        this.pub = pub;
    }

    public Set getGames() {
        return games;
    }

    public void setGames(Set games) {
        this.games = games;
    }
}
