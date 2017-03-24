package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Home on 11.03.2017.
 */
public class Game {
    private Long id;
    private Long franchId;
    private String title;
    private Integer price;
    private Long sold;
    private Integer tax;
    private Set<Developer> developers = new HashSet();

    public Game(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getFranchId() {
        return franchId;
    }

    public void setFranchId(Long franchId) {
        this.franchId = franchId;
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

    public long getSold() {
        return sold;
    }

    public void setSold(long sold) {
        this.sold = sold;
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
