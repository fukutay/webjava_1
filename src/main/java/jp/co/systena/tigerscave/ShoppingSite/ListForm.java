package jp.co.systena.tigerscave.ShoppingSite;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/Cart")
public class ListForm {
	
	@RequestMapping(method = RequestMethod.POST)
	public String update(Model model) {
		
		List<Order> itemList = new ArrayList<Order>();
		
		model.addAttribute("addCart", itemList);
		
	    return "CartView";
    }
}