public class Solution {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        double Pi = 3.14;
        double L = 2 * Pi * radius;
        System.out.println(L);
    }
}

//OUTPUT:
//31.400000000000002
