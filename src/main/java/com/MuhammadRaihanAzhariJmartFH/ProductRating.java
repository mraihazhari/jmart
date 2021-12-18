package com.MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class ProductRating here.
 *
 * @author Muhammad Raihan Azhari
 * @version 18 Desember 2021
 */
public class ProductRating
{
    private long total;
    public long count;
    
    /**
     * Constructor dari ProductRating
     */
    public ProductRating(){
        this.total = 0;
        this.count = 0;
    }
    /**
     * 
     * @param rating yang diberikan untuk suatu produk
     */
    public void insert(int rating){
        this.total = this.total + rating;
        this.count++;
    }
    
    /**
     * getter untuk rata-rata rating produk
     * @return harga bersih untuk nilai rata2 suatu produk
     */
    public double getAverage(){
        long temp;
        if(this.count == 0){
            return 0;
        }
        temp = (this.total)/(this.count);
        return temp;
    }
    
    /**
     * getter untuk jumlah banyaknya produk
     * @return banyaknya produk
     */
    public long getCount(){
        return this.count;
    }
    /**
     * getter untuk jumlah total dari rating yang diberikan dalam suatu produk
     * @return total rating dari suatu produk
     */
    public long getTotal(){
        return this.total;
    }
}
