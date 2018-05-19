package jp.co.systena.tigerscave.ShoppingSite;

public class Item {
	
    private String item_name;
    private int price;
    
    public Item() {
    	
    	this.item_name = "";
        this.price = 0;
    }
    
    public Item(String item_name, int price) {
    	super();
    	this.item_name = item_name;
        this.price = price;
    }

	public void setItemName(String item_name) {
        this.item_name = item_name;
    }

    public String getItemName() {
        return item_name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}