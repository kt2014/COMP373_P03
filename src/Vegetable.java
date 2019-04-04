// abstraction in bridge pattern
abstract class Vegetable {
    protected Farm farm1;
    protected Farm farm2;

    protected Vegetable(Farm farm1, Farm farm2)
    {
        this.farm1 = farm1;
        this.farm2 = farm2;
    }

    abstract public void produce();
}
