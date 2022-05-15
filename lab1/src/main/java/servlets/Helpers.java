package servlets;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import gpuS.GPU;
import jakarta.servlet.http.HttpServletRequest;

public class Helpers {
	
	public static JsonElement bodyParse(HttpServletRequest request) {
		JsonElement jsonElement=null;	
		
		try {
			jsonElement = JsonParser.parseReader(request.getReader());
		} catch (JsonIOException | JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonElement;
	}
	
	public static GPU userParse(HttpServletRequest request) {
		GPU user = new GPU();
		JsonElement jsonElement = bodyParse(request);
		user.setId(jsonElement.getAsJsonObject().get("id").getAsInt());
		user.setName(jsonElement.getAsJsonObject().get("name").getAsString());
		user.setPrice(jsonElement.getAsJsonObject().get("price").getAsInt());
		user.setWidth(jsonElement.getAsJsonObject().get("width").getAsInt());
		return user;
	}
	
	public static int getNextId(List<GPU> list) {
		int maxId = 0;
		//////////////////////////////////
		if (list == null) return 0;
		
		Iterator<GPU> iterator = list.iterator();
		while(iterator.hasNext()) {
			int currentId = iterator.next().getId();
			if(currentId>maxId) maxId=currentId;
		}
		return maxId+1;
	}
	
	public static int getIndexByUserId(int id,List<GPU> list) {
		int listId = id;
		
		Iterator<GPU> iterator = list.iterator();
		while(iterator.hasNext()) {
			GPU temp =iterator.next();
			if(temp.getId()==listId) { 
				listId=list.indexOf(temp);
				break;
			}
		}
		return listId;
	}
	
	

}
