import java.util.Observer;

// Refine abstraction 1 in bridge pattern
 class Carrot extends Vegetable {

    //state of carrot
    private boolean harvested = true;

    //getter for harvested
    public boolean isHarvested(){
        return harvested;
    }

    //setter for harvested
    public void setIsHarvested(boolean harvested){
        this.harvested = harvested;

    }



    public Carrot(Farm farm1, Farm farm2)
    {
        super(farm1, farm2);
    }

    @Override
    public void produce()
    {
        System.out.print("Carrot");
        farm1.work();
        farm2.work();
    }
}



