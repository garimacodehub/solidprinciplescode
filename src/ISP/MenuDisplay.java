package ISP;

public class MenuDisplay {
	
	public static void displayVegetarianMenuItems(IVegetarianMenu menu) {
		System.out.println("Vegetarian Menu::");
		for(String item: menu.getVegetarianitems()) {
			System.out.println("-" + item);
		}
	}
	
	public static void displayNonVegetarianMenuItems(INonVegetarianMenu menu) {
		System.out.println("NonVegetarianItems::");
		for(String item: menu.getNonVegetarainItems()) {
			System.out.println("-" + item);
		}
		
		
	}

}
