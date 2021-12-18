
/**
	 * Class untuk melakukan penomeran seri (id)
	 *
	 * @author (Muhammad Raihan Azhari)
	 * @version (25 Sept 2021)
	 */


package com.MuhammadRaihanAzhariJmartFH;

import java.util.HashMap;


public class Serializable implements Comparable<Serializable>
{
	
    private static HashMap<Class<?>, Integer> mapCounter = new HashMap<>();
    public int id = -1;
    /**
     * Constructor untuk class Serializable
     */
    protected Serializable()
    {
        Integer counter = mapCounter.get(getClass());
        counter = counter == null ? 0 : counter + 1;
        mapCounter.put(getClass(), counter);
        this.id = counter;
    }
    
    /**
     * 
     * @param <T>
     * @param id nomor seri dari kelas tersebut
     * @return melakukan peletakan class ke dalam hash map
     */
    public static <T extends Serializable> Integer setClosingId(Class<T> clazz, int id)
    {
        return mapCounter.put(clazz, id);
    }
    /**
     * 
     * @return Mengembalikan nilai Id dari kelas
     */
    public static <T extends Serializable> Integer getClosingId(Class<T> clazz)
    {
        return mapCounter.get(clazz);
    }
    public boolean equals(Object other)
    {
        return other instanceof Serializable && ((Serializable) other).id == id;
    }
    public boolean equals(Serializable other)
    {
        return other.id == id;
    }

    @Override
    public int compareTo(Serializable other)
    {
        return Integer.compare(this.id, other.id);
    }
}
