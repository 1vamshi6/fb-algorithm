public class OneEditApart{

    public static void main(String []args){
       String value1 = "OneEditApart";
       String value2 = "OneEdiApart";
       int editCount = 0;
       boolean eval;
       
       int minSize = value1.length()<value2.length()?value1.length():value2.length();
       if(value2.length() < value1.length()) {
           String tempString = value1;
           value1 = value2;
           value2 = tempString;
       }
       
       if(value1.length() == value2.length()) {
           for(int i=0; i< minSize; i++) {
               if(value1.charAt(i) != value2.charAt(i)) {
                   editCount++;
                   if(editCount > 1)
                       break;
               }
           }
       } else {
           if(value2.length() > value1.length()+1) {
               editCount = 2;
           } else {
               for(int i=0; i< minSize; i++) {
                   if(value1.charAt(i) != value2.charAt(i) && value1.charAt(i) != value2.charAt(i+1)) {
                       editCount++;
                   }
               }
           }
       }
       
       if(editCount > 1) {
           System.out.println("False");
       } else 
           System.out.println("True");
       
    }
}