import java.util.*;
public class Main {
    public static void main(String[] args){
        List<WaterTank> tanks = new ArrayList<>();
        try{
            tanks.add(new WaterTank("T1", 1000, 900));
            tanks.add(new WaterTank("T2", 8000, 100));
            tanks.add(new WaterTank("T3", 500, 5000));
        } catch(InvalidWaterLevelException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Alert check: ");
        for(WaterTank tank: tanks){
            tank.checkAlert();
        }
        //sort
        tanks.sort(Comparator.comparingInt(WaterTank::getCurrentLvl));

        System.out.println("Sorted by Lowest Level");
        for (WaterTank tank : tanks) {
            System.out.println(tank);
        }   
    }
}
