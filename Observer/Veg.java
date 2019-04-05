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