package com.MuhammadRaihanAzhariJmartFH;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Algorithm {
	
	private Algorithm() {
		
	}
	
	public static <T> List<T> collect(T[] a, T object) {
		final Iterator<T>iterator = Arrays.stream(a).iterator();
        return collect(iterator, object);
	}
	
	public static <T> List<T> collect (Iterable<T> iterable, T object) {
		final Iterable<T>element = (Iterable<T>) iterable.iterator();
        return collect(element, object);
	}
	
	public static <T> List<T> collect(Iterator<T> t, T object) {
		
		final Predicate<T> predicate = object::equals;
        return collect(t, object);
	}
	
	public static <T> List<T> collect (T[] a, Predicate<T> t){
		 final Iterator<T> iterate = Arrays.stream(a).iterator();
	      return collect(iterate, t);
	
	}
	
	public static <T> List<T> collect(Iterable<T> t, Predicate<T> a) {
		List<T> list = new ArrayList<>();
		return list;
	}
	
	public static <T> List<T> collect(Iterator<T> t, Predicate<T> a) {
		int x = 0;
        while(t.hasNext()){
            x++;
        }
        final Predicate<T> predicate = a::equals;
        return collect(t, a);
	}
	
	
	public static <T> int count(T[] a, T obejct) {
		return a.length;
	}
	
	public static <T> int count(Iterable<T> iterable, T object) {
		int x = 0;
		for(Object i : iterable) {
			x++;
		}
		return x;
	}
	
	public static <T> int count(Iterator<T> t, T object) {
		int x = 0;
		while(t.hasNext()) {
			x++;
		}
		return x;
	}
	
	public static <T> int count (T[] a, Predicate<T> t){
		int x = 0;
		
		if(a.equals(false)) {
			return 0;
		}
		else {
			for(T i : a) {
				x++;
			}
			return x;
		}
		
	}
	
	public static <T> int count(Iterable<T> t, Predicate<T> a) {
		int x = 0;
		if(a.equals(false)) {
			return 0;
		}
		else {
			for(T i : t) {
				x++;
			}
		}
		return x;
	}
	
	public static <T> int count(Iterator<T> t, Predicate<T> a) {
		int x = 0;
		if(a.equals(false)) {
			return 0;
		}
		else {
			while(t.hasNext()) {
				x++;
			}
			return x;
		}
	}
	
	public static <T> T find (T[] a, T object) {
		for(T elemen : a) {
			if(elemen.equals(object)) {
				return elemen;
			}
		}
		return null;
	}
	
	public static <T> T find(Iterable<T> t, T object){
		for(T elemen : t) {
			if(elemen.equals(object)) {
				return elemen;
			}
		}
		return null;
	}
	
	public static <T> T find(Iterator<T> t, T object){
		while(t.hasNext()) {
			if(t.next().equals(object)) {
				return t.next();
			}
		}
		return null;
	}
	
	public static <T> T find(T[] a, Predicate<T> t) {
		for(T elemen : a) {
			if(elemen.equals(t)) {
				return elemen;
			}
		}
		return null;
	}
	
	public static <T> T find (Iterable<T> a, Predicate<T> t) {
		for (T elemen : a) {
			if(elemen.equals(t)) {
				return elemen;
			}
		}
		return null;
	}
	
	public static <T> T find (Iterator<T> a, Predicate<T> t) {
		while(a.hasNext()) {
			if(a.next().equals(t)) {
				return a.next();
			}
		}
		return null;
	}
	
	public static <T> boolean exists(T[] a, T object) {
		for(T elemen : a) {
			if(a.equals(object)) {
				return true;
			}
		}
		return false;
	}
	
	public static <T> boolean exists(Iterable<T> a, T object) {
		for(T elemen : a) {
			if(a.equals(object)) {
				return true;
			}
		}
		return false;
	}
	
	public static <T> boolean exists(Iterator<T> a, T object) {
		while(a.hasNext()) {
			if(a.next().equals(object)) {
				return true;
			}
		}
		return false;
	}
	
	public static <T> boolean exists(T[] a, Predicate<T> b) {
		for(T elemen : a) {
			if(a.equals(b)) {
				return true;
			}
		}
		return false;
	}
	
	public static <T> boolean exists(Iterable<T> a, Predicate<T> b) {
		for(T elemen : a) {
			if(a.equals(b)) {
				return true;
			}
		}
		return false;
	
	}
	public static <T> boolean exists(Iterator<T> a, Predicate<T> b) {
		while(a.hasNext()) {
			if(a.next().equals(b)) {
				return true;
			}
		}
		return false;
	}
	
	public static <T> T max(T[] a){
        int max = 0;
        T maxT = null;
        for (T t : a) {
            if (t.hashCode() > max) {
                max = t.hashCode();
                maxT = t;
            }
        }
        return maxT;
    }

    public static <T> T max(Iterable<T> a){
        int max = 0;
        T maxT = null;
        for (T elemen : a) {
            if (elemen.hashCode() > max) {
                max = elemen.hashCode();
                maxT = elemen;
            }
        }
        return maxT;
    }

    public static <T> T max(Iterator<T> a){
        int max = 0;
        T maxT = null;
        while (a.hasNext()) {
            if (a.next().hashCode() > max) {
                max = a.next().hashCode();
                maxT = a.next();
            }
        }
        return maxT;
    }

    public static <T> T max(T first, T second, Comparator<?super T> comparator){
        int result = ((Comparable<T>) first).compareTo(second);
        return result < -1? second : first;
    }

    public static <T> T max(T[] a, Comparator<?super T> comparator){
        return null;
    }

    public static <T> T max(Iterable<T> iterable, Comparator<?super T> comparator){
        T maxT = null;
        for(T t : iterable) {
            if (((Comparable<T>) maxT).compareTo(t) < 0) {
                maxT = t;
            }
        }
        return maxT;
    }

    public static <T> T min(T first, T second) {
        if(first.hashCode()>second.hashCode()){
            return second;
        }else {
            return first;
        }
    }

    public static <T> T min(T[] a){
        int min = a[0].hashCode();
        T minT = null;
        for (T t : a) {
            if (t.hashCode() > min) {
                min = t.hashCode();
                minT = t;
            }
        }
        return minT;
    }

    public static <T> T min(Iterable<T> a){
        int min = a.hashCode();
        T minT = null;
        for (T t : a) {
            if (t.hashCode() > min) {
                min = t.hashCode();
                minT = t;
            }
        }
        return minT;
    }

    public static <T> T min(Iterator<T> a){
        int min = a.next().hashCode();
        T minT = null;
        while (a.hasNext()) {
            if (a.next().hashCode() > min) {
                min = a.next().hashCode();
                minT = a.next();
            }
        }
        return minT;
    }

    public static <T extends Comparable<?super T>> T min(T first, T second, Comparator<?super T> comparator){
        return null;
    }
    
    public static <T> List<T> paginate (List<Product> list, int page, int pageSize, Predicate<Product> pred){
    	int iteration = 0;
		int find_product = 0;
		int demand = page * pageSize;
		List<T> listHasil = new ArrayList<>(pageSize);
	    while(iteration < list.size() && find_product < demand) {
	    	if(pred.predicate(list.get(iteration))) {
	    		demand++;
	    	}
	    	iteration++;
	    }
	    for(int i = iteration; i < list.size() && listHasil.size() < pageSize; i++) {
	    	if(pred.predicate(list.get(i))) {
	    		listHasil.add((T) list.get(i));
	    	}
	    }
	    
	    return listHasil;
    }
	
	

}
