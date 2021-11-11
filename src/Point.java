public class Point {

     public int x1;
     public int x2;
     public int y1;
     public int y2;
     public double eDistanceOutput;

     public double EuclideanDistance(double eDistanceOutput){

         eDistanceOutput = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

         return eDistanceOutput;
     }

}
