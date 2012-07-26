package com.mlip.example.ingredient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TODO mlip; javadoc
 *
 * @author mlipski
 */
@Controller
@RequestMapping("/ingredient")
public class IngredientController {

	@RequestMapping(value = "{ingredientName}", method = RequestMethod.GET)
	public String  show(@RequestParam String ingredientName, ModelMap model) {

		Ingredient ingredient = new Ingredient();
		ingredient.setName(ingredientName);
		ingredient.setId(1);
		model.addAttribute("ingredient", ingredient);
		
		return "/ingredient/show";

	}

	@RequestMapping(value="/list",method = RequestMethod.GET)
	public List<Ingredient> list() {
		return returnData();
	}

	private List<Ingredient> returnData() {

		ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

		Ingredient p1 = new Ingredient();
		Ingredient p2 = new Ingredient();

		p1.setName("E234");
		p2.setName("BE456");


		ingredients.add(p1);
		ingredients.add(p2);


		return ingredients;
	}
}


