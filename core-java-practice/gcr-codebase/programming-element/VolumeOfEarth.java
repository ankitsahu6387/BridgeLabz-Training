public class VolumeOfEarth {
    public static void main(String[] args) {
        int radius = 6378;
        double radiusMile = radius * 0.621371;
        double volumeKm = 4/3.0*Math.PI*(radius*radius*radius);
        double volumeMile = 4/3.0*Math.PI*(radiusMile*radiusMile*radiusMile);
        System.out.println("The volume of the earth in cubic kilometer is "+volumeKm+" and cubic miles is "+ volumeMile);
    }
}