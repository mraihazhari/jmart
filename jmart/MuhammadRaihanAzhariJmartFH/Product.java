package MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product
{
    private int idCounter;
    public int id;
    public String name;
    public int weight;
    public boolean conditionUsed;
    public PriceTag priceTag;
    public ProductRating rating;    
    public Product(String name, int weight, boolean conditionUsed, PriceTag priceTag){
        this.id = idCounter++;
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.priceTag = priceTag;
    }

}
