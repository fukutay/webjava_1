package jp.co.systena.tigerscave.ShoppingSite;

public class Order {

	private String item;
    private int num;
    
    public Order() {
    	this.item = "";
    	this.num = 0;
    }
    
    public Order (String item, int num) {
    	this.item = item;
    	this.num = num;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return this.item;
    }	

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }	
}
