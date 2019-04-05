import java.util.ArrayList;

class VegetableType implements Subject{
    private String vegetableTypeName;
    private ArrayList<Observer> vegetableList;
    public VegetableType(String vegetableTypeName) {
        this.vegetableTypeName = vegetableTypeName;
        vegetableList = new ArrayList<Observer>();
    }
    //add vegetable to the vegetable list
    @Override
    public void registerVegetable(Observer obj) {
        vegetableList.add(obj);
        System.out.println(obj + " has been added " + vegetableTypeName);
    }
    //remove vegetable from vegetable list
    @Override
    public void unregisterVegetable(Observer obj) {
        vegetableList.remove(obj);
        System.out.println(obj + " has been removed " + vegetableTypeName);
    }
    //Notify all the registered vegetables
    @Override
    public void notifyAllObservers(String vegetableState) {
        for(Observer vegetableList : vegetableList)
        {
            vegetableList.update(vegetableTypeName, vegetableState);
        }
        System.out.println();
    }
    //This method updates the vegetable state.
    public void vegetableState(String vegetableState)
    {
        System.out.println("\n" + vegetableTypeName + "'s state has changed :: " + vegetableState + "\n");
        notifyAllObservers(vegetableState);
    }
}