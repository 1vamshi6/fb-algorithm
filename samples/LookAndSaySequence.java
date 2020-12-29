public class LookAndSaySequence{

     public static void main(String []args){
        int total = 20;
        int counter = 10;
        String value = "1";
        
        while(counter > 0) {
            //System.out.println("Value is " + value);
            StringBuffer newValue = new StringBuffer("");
            int repeated = 1;
            int prevValue = 0;
            int currentValue =  0;
            for(int index = 0; index<value.length(); index++) {
                if(index != 0) {
                    currentValue = Integer.valueOf(value.substring(index, index+1));
                    if(currentValue == prevValue) {
                        repeated++;
                        if(index == value.length() - 1) {
                            newValue.append(String.valueOf(repeated));
                            newValue.append(String.valueOf(prevValue));
                        }
                        //System.out.println("repeated Value is " + repeated +":" +index+newValue);
                    } else {
                        newValue.append(String.valueOf(repeated));
                        newValue.append(String.valueOf(prevValue));
                        repeated = 1;
                        if(index == value.length() - 1) {
                            newValue.append(String.valueOf(repeated));
                            newValue.append(String.valueOf(currentValue));
                        }
                        //System.out.println("repeated Value is " +  ";" +newValue);
                    }
                }
                prevValue = Integer.valueOf(value.substring(index, index+1));
                //System.out.println("prevValue Value is " + prevValue);
                if(value.length() == 1) {
                    newValue.append(String.valueOf(repeated));
                    newValue.append(String.valueOf(prevValue));
                    //System.out.println("0 Value is " + prevValue);
                }
            }
            System.out.println("NewValue is " + newValue.toString());
            value = newValue.toString();
            //System.out.println("Updt Value is " + value);
            counter--;
        }
     }
}