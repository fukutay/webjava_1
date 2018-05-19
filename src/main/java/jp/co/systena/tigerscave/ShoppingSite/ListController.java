package jp.co.systena.tigerscave.ShoppingSite;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/ShoppingSite")
public class ListController {
	
	@RequestMapping(method = RequestMethod.GET)
	//public String index(Model model) {
	public ModelAndView index(ModelAndView mav) {
	
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(new Item("商品A", 10000));
		itemList.add(new Item("商品B", 20000));
		itemList.add(new Item("商品C", 30000));
		itemList.add(new Item("商品D", 40000));
		itemList.add(new Item("商品E", 50000));
		
		System.out.println(itemList.get(0).getItemName());
		
		//model.addAttribute("itemList", itemList);
		mav.addObject("itemList", itemList);
		
		List<Integer> num = new ArrayList<>();
		for(int i = 1; i <= 10; i++) {
			num.add(i);
		}
		//model.addAttribute("num", num);
		mav.addObject("num", num);
		
	    //return "ListView";
		mav.setViewName("/ListView.html");
		return mav;
    }
}