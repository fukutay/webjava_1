package jp.co.systena.tigerscave.ShoppingSite;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;

public class ListService {
	
	public String List(Model model){
	
	List<String> item_name = new ArrayList<>();
	List<Integer> price = new ArrayList<>();
	
	item_name.add("商品A");
	item_name.add("商品B");
	item_name.add("商品C");
	item_name.add("商品D");
	item_name.add("商品E");
	model.addAttribute("item_name", item_name);
	
	price.add(10000);
	price.add(20000);
	price.add(30000);
	price.add(40000);
	price.add(50000);
	
	return "List";
	
	}	
}