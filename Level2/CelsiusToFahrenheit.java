public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        //your code here
        
        double TF = celsius * 9/5.0 + 32;

        return TF;
    }
}

//OUTPUT:
//105.8
