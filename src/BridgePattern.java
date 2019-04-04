// Demonstration of bridge design pattern
class BridgePattern {
    public static void main(String[] args)
    {
        Vegetable vegetable1 = new Carrot(new Plant(), new Harvest());
        vegetable1.produce();
        Vegetable vegetable2 = new Potato(new Plant(), new Harvest());
        vegetable2.produce();
    }
}
