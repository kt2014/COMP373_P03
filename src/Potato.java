// Refine abstraction 2 in bridge pattern 
class Potato extends Vegetable {
    public Potato(Farm farm1, Farm farm2)
    {
        super(farm1, farm2);
    }

    @Override
    public void produce()
    {
        System.out.print("Potato");
        farm1.work();
        farm2.work();
    }
}