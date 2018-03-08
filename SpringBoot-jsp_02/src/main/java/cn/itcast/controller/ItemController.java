package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {

	@RequestMapping("/item")
	public String item(Model model) {
		model.addAttribute("itemArr", new String[]{
				"小米","华为0","苹果","Opp"
		});
		return "item";
	}
}
