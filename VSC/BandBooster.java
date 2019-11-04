public class BandBooster{
    private int boxesSold;
    private String nameOfBooster;
    
    public BandBooster(String nameOfBooster){
        boxesSold = 0;
        this.nameOfBooster = nameOfBooster;
        
    }
    public getName(){
        return nameOfBooster;
    }
    public getNumBoxes(){
        return boxesSold;
    }
    public updateSales(int additionalBoxesSold){
        boxesSold += additionalBoxesSold;
    }
    public String toString(){
        return nameOfBooster + ": " + boxesSold + " boxes";
    }

    
}