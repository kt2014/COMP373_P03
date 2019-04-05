public class Main {
    public static void main(String[] args) {

        //new veg types
        VegetableType root = new VegetableType("Root");
        VegetableType leafyGreen = new VegetableType("Leafy Green");

        //new veg
        Veg carrot = new Veg("Carrot");
        Veg potato = new Veg("Potato");
        Veg kale = new Veg("Kale");
        Veg spinach = new Veg("Spinach");

        //reg
        root.registerVegetable(carrot);
        root.registerVegetable(potato);
        leafyGreen.registerVegetable(kale);
        leafyGreen.registerVegetable(spinach);

        //veg status change
        root.vegetableState("Planted");
        leafyGreen.vegetableState("Harvested");

        //unreg
        leafyGreen.unregisterVegetable(kale);
        leafyGreen.unregisterVegetable(spinach);

    }

}
