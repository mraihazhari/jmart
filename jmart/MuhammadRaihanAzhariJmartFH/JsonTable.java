package MuhammadRaihanAzhariJmartFH;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Vector;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;



public class JsonTable<T> extends Vector{
	
	public final String filepath;
	public static final Gson gson = new Gson();
	
	public JsonTable (Class<T> clazz, String filepath) throws IOException{
		
		 this.filepath = filepath;
		//readJson(clazz, filepath);
		 
	}
	
	public static <T> T readJson (Class<T> clazz, String filepath) throws FileNotFoundException{
		 
		 Gson gson = new Gson();
		 Type reader = new TypeToken<Class<T>>() {}.getType();
		 BufferedReader br = new BufferedReader(new FileReader(filepath));
		 return gson.fromJson(br, reader);
		 
	}
	
	
	public void writeJson() throws IOException{
		writeJson(gson, this.filepath);
	}
	
	public static void writeJson(Object object, String filepath) throws IOException{
		 
	}
	
	
	
}
