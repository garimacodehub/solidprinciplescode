package ISP;

import java.util.Arrays;
import java.util.List;

public class DrinkMenu implements IDrinkMenu {

	@Override
	public List<String> getDrinkMenu() {
		// TODO Auto-generated method stub
		return Arrays.asList("Soda","ColdCoffee","Mojito","ChocolateShake");
	}

}
