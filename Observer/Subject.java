interface Subject{
    public void registerVegetable(Observer obj);
    public void unregisterVegetable(Observer obj);
    public void notifyAllObservers(String str);
}