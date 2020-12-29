public class SpiralArray{

    public static void main(String []args) {
       System.out.println("Hello World");
       int[][] sa = {
                     {1,  2,  3,  4,  5}, 
                     {14, 15, 16, 17, 6}, 
                     {13, 20, 19, 18, 7},
                     {12, 11, 10, 9,  8}
                   };
       int xPosition = 0;
       int yPosition = 0;
       int xLength = sa[0].length;
       int yLength = sa.length;
       int total = sa[0].length*sa.length;
       int counter = 0;
       
       while(counter <= total) {
           for(; xPosition < xLength; xPosition++) {
               if(counter >= total) {
                   break;
               }
               System.out.println("Value is " + sa[yPosition][xPosition]);
               counter++;
           }
           xPosition--;
           
           for(yPosition = yPosition + 1; yPosition < yLength; yPosition++) {
               if(counter >= total) {
                   break;
               }
               System.out.println("Value is " + sa[yPosition][xPosition]);
               counter++;
           }
           yPosition--;
           yLength--;
           
           for(xPosition = xPosition - 1; xPosition >= 0; xPosition--) {
               if(counter >= total) {
                   break;
               }
               System.out.println("Value is " + sa[yPosition][xPosition]);
               counter++;
           }
           xPosition++;
           
           for(yPosition = yPosition - 1; yPosition > 0; yPosition--) {
               if(counter >= total) {
                   break;
               }
               System.out.println("Value is " + sa[yPosition][xPosition]);
               counter++;
           }
           yPosition++;
           xPosition++;
           xLength--;
       }
    }
}