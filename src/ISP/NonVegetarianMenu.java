package ISP;

import java.util.Arrays;
import java.util.List;

public class NonVegetarianMenu implements INonVegetarianMenu{

	@Override
	public List<String> getNonVegetarainItems() {
		// TODO Auto-generated method stub
		return Arrays.asList("Biryani","Chickensoup","BoiledEggs");
	}

}
