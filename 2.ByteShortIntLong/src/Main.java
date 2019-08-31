public class Main {

    public static void main(String[] args) {
        int myValuve = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = "+myMinIntValue);
        System.out.println("Integer Maximum Value = "+myMaxIntValue);
        System.out.println("Busted MaxValue =  "+(myMaxIntValue +1));
        System.out.println("Busted MinValue = "+(myMinIntValue -1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = "+myMinByteValue);
        System.out.println("Byte Maximum Value = "+myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = "+myMinShortValue);
        System.out.println("Short Maximum Value = "+myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = "+myMinLongValue);
        System.out.println("Long Maximum Value = "+myMaxLongValue);
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMAXFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = "+ myMinFloatValue);
        System.out.println("Float maximum value = "+ myMAXFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMAXDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = "+ myMinDoubleValue);
        System.out.println("Double maximum value = "+ myMAXDoubleValue);
        

        byte myNewByteValue = (byte)(myMinByteValue/2);
        short myNewShortValue = (short)(myMinShortValue/2);

        int myIntValu = 5;
        float myfloat = 5.25f;
        double myf = 5.25;

        char myChar ='D';
        char myUnicode ='\u0044';
        System.out.println(myChar);
        System.out.println(myUnicode);

        String myString = "This is a String";
        System.out.println("myString is equal to ="+myString);
        myString = myString+ ", and this is more";
        System.out.println("myString now shows ="+myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString is yay ="+myString);
        String numberString = "250.55";
        numberString = numberString +"49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString +myInt;
        System.out.println("laast string is equal to "+lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is equal to "+ lastString);







    }
}
