import java.util.HashSet;
import java.util.Set;

/**
 * Created by Home on 11.03.2017.
 */
public class Game {
    private Long id;
    private Long franch_id;
    private String title;
    private Integer price;
    private Long solded;
    private Integer tax;
    private Set<Integer> developers = new HashSet();

    public Game(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFranch_id() {
        return franch_id;
    }

    public void setFranch_id(long franch_id) {
        this.franch_id = franch_id;
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
