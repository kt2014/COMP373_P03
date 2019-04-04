// Concrete implementation 2 for bridge pattern
class Harvest implements Farm {
    @Override
    public void work()
    {
        System.out.print(" and");
        System.out.println(" harvested.");
    }
}