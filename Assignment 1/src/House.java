
public class House {
	protected int id;
	protected float price;
	protected char[] location;
	protected char[] advertiser;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public char[] getLocation() {
		return location;
	}
	public void setLocation(char[] location) {
		this.location = location;
	}
	public char[] getAdvertiser() {
		return advertiser;
	}
	public void setAdvertiser(char[] advertiser) {
		this.advertiser = advertiser;
	}
}
