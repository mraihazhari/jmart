package MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class Recognizable here.
 *
 * @author (Muhammad Raihan Azhari)
 * @version (25 Sept 2021)
 */
public class Recognizable
{
   
    public int id;

    protected Recognizable(int id)
    {
        this.id = id;
    }
    
    
   public boolean equals(Recognizable recognizable){
        return true;
   }
    
   public boolean equals(Object object){
        if(object instanceof Recognizable){
            return true;
       }
       return false;
   }
   

    
}
