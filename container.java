import java.util.*;
import java.lang.Math;

// first basic method
/*
Iterate through the entire list of numbers, for each number, calculate the area
with every other number in the sequence, and then take the max of all the numbers
*/
// smarter method
/*
1) you don't need a list, just a number that keeps track of current max
2) you can use a way to prune away the options you know for sure won't be the max value
*/

class Container {
    public int findmax(int[] height) {
        int max = 0;
        int iterations = height.length;
        for (int i = 0; i < iterations; i++) {
            for (int j = 0; j < iterations; j++) {
                if (j != i) {
                    int area = Math.abs(i - j) * Math.min(height[i], height[j]);
                    if (area > max) {
                        max = area;
                    }
                    
                }
            }
        }

        return max;
    
    }




    public static void main(String[] args) {
        Container test = new Container();
        System.out.println(test.findmax(new int[]{4,3,2,1,4}));
    }
}