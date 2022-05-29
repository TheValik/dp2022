package lab5.gpu;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gpu1")

public class GPU implements Serializable {
	
	@Id
	@GeneratedValue
	int id;
	String name;
	int price;
	float width;
	
	
	public GPU() {
		
	}
	
	
	public GPU(int id, String name, int price,float width ) {
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

