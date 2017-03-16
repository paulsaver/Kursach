import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Home on 11.03.2017.
 */
@Entity
@Table(name = "game")
public class Game {
    @Id
    @Column(name = "Id", length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "franch_id", foreignKey = @ForeignKey(name = "franch_id"))
    private Franchise franch;

    @Column(name = "title", length = 100)
    private String title;

    @Column(name = "price", length = 10)
    private Integer price;

    @Column(name = "solded", length = 10)
    private Long solded;

    @Column(name = "tax", length = 10)
    private Integer tax;

    @ManyToMany(mappedBy = "games")
    private Set<Developer> developers = new HashSet();

    public Game(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Franchise getFranch() {
        return franch;
    }

    public void setFranch(Franchise franch) {
        this.franch = franch;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getSolded() {
        return solded;
    }

    public void setSolded(long solded) {
        this.solded = solded;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public Set getDevelopers() {
        return developers;
    }

    public void setDevelopers(Set developers) {
        this.developers = developers;
    }
}
