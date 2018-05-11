package javaNotes;

public class recursion {
    //demonstrate recursion
    // first, need to find out the base case
    // second, need to find out the recursive case

    public static int countEars(int rabbits){
        //base case
        if (rabbits == 0) return 0;

        //recursive case
        //usually need to -1 on parameters to avoid infinite loop
        //add the conditions at the end
        //and return results
        int results = countEars(rabbits - 1) + 2;
        return results;
    }
}
