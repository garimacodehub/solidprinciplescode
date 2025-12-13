package ISP;

import java.util.Arrays;
import java.util.List;

public class VegetarianMenu implements IVegetarianMenu {

	@Override
	public List<String> getVegetarianitems() {
		// TODO Auto-generated method stub
		return Arrays.asList("PaneerTikka","Burger","Moltencheese");
	}

}
