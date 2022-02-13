package GPU;
import java.io.Serializable;;
public class GPU implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String title;
	int price;
	float width;
	public GPU(String title, int price, float width) {
		super();
		this.title = title;
		this.price = price;
		this.width = width;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public void setWidth(float width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "{\"title\":\""+title+"\", \"price\":"+price+", \"width\":"+width+"}";
	}
	
	
	
}
