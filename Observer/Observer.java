import java.util.*;

//The Observers update method is called when the Subject changes
interface Observer{
    public void update(String name, String str);
}
//This class extends Subject interface.
class VegetableType implements Subject{
    private String vegetableTypeName;  //name of the celebrity
    private ArrayList<Observer> vegetableList;  //list of followers
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
// This class extends Observer interface.
class Veg implements Observer{
    private String vegetableName;
    public Veg(String vegetableName) {
        this.vegetableName = vegetableName;
    }
    //This method will be called to update all vegetables regarding the newest state.
    @Override
    public void update(String vegetableTypeName , String vegetableState) {
        System.out.println(vegetableName + "'s state has changed :: "+  vegetableState);
    }
    @Override
    public String toString() {
        return vegetableName;
    }
}