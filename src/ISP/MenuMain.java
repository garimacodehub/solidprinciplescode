package ISP;

public class MenuMain {
	
	public static void main(String[] args) {
	VegetarianMenu vegmenu = new VegetarianMenu();
	NonVegetarianMenu nonveg = new NonVegetarianMenu();
	DrinkMenu drinkmenu = new DrinkMenu();
	
	MenuDisplay.displayVegetarianMenuItems(vegmenu);
	MenuDisplay.displayNonVegetarianMenuItems(nonveg);

}
}
