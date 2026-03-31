public class TemperatureAnalyzer {
    public static void findHottestColdest(float[][] temperature){
        int hottestDay = 0;
        int coldestDay = 0;

        float maxAvg = Float.MIN_VALUE;
        float minAvg = Float.MAX_VALUE;

        for(int i=0; i<7; i++){
            float avg = 0;
            float sum = 0;
            for(int j=0; j<24; j++){
                sum += temperature[i][j];
            }
            avg = sum/24;
            if(avg > maxAvg){
                maxAvg = avg;
                hottestDay = i+1;
            }
            if(avg < minAvg){
                minAvg = avg;
                coldestDay = i+1;
            }
        }
        System.out.println("Hottest day: " + hottestDay);
        System.out.println("Coldest dat: "+ coldestDay);
        System.out.println();
    }
    public static void findAvgTemp(float temperature[][]){
        for(int i=0; i<7; i++){
            float avgPerDay = 0;
            float sumPerDay = 0;
            for(int j=0; j<24; j++){
                sumPerDay += temperature[i][j];
            }
            avgPerDay = sumPerDay/24;
            System.out.println("Average temperature of day "+(i+1)+ " is: " + avgPerDay);
        }
    }
    public static void main(String[] args) {
        float temperature[][] = new float[7][24];
        for(int i=0; i<7; i++){
            for(int j=0; j<24; j++){
                temperature[i][j] = (float) (Math.random()*31)+21;
            }
        }
        findHottestColdest(temperature);
        findAvgTemp(temperature);
    }
}
