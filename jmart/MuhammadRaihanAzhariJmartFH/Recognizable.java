package MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class Recognizable here.
 *
 * @author (Muhammad Raihan Azhari)
 * @version (25 Sept 2021)
 */
public abstract class Recognizable
{
   
    public int id;

    protected Recognizable(int id)
    {
        this.id = id;
    }
    
   public boolean equals(Recognizable recognizable){
       return recognizable.id == id;
   }
    
   public boolean equals(Object object){
        if(object instanceof Recognizable){
            Recognizable obj = (Recognizable)object;
            if(obj.id == id){
               return true; 
            }
       }
       return false;
   }
}
