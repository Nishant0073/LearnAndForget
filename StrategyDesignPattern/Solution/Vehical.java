public class Vehical {
   DriveStrategy strategy;
    Vehical(DriveStrategy driveStrategy){
        this.strategy = driveStrategy;
    }

    public void drive(){
        strategy.drive();
    }
}
