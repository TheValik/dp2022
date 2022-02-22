package users;

import java.io.Serializable;

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	int id;
	String name;
	int price;
	float width;
	
	
	public User() {
		
	}
	
	
	public User(int id, String name, int price,float width ) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.width = width;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public float getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}


	@Override
	public String toString() {
		return "{\"id\":"+id+",\"name\":\""+name+"\", \"price\":"+price+",\"width\":"+width+"}";
	}
	
	
	
	

}

