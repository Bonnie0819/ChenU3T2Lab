public class SelectionMadness
{
    // No instance variables //

    // no-parameter constructor with "empty" body since no instance variables
    public SelectionMadness() { }

    /* Simulates randomly flipping a fair coin and returning true for heads and
       false for tails; hint: this method should use the Math.random() method to
       generate a random number.  This method returns true (heads) 50% of the
       time and false (tails) 50% of the time, on average.
     */
    public boolean flipCoin() {
        int num = (int) (Math.random() * 10) + 10;
        if (num <= 10) {
            return false;
        } else {
            return true;
        }
    }

    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
        int greatest = 0;

        if (num1 >= num2) {
            greatest = num1;
        } else {
            greatest = num2;
        }
        if(greatest <= num3) {
            greatest =num3;
        }
            return greatest;
    }

    /* Returns true if the three provided lengths create a right triangle, in
       other words, a2 + b2 = c2, where c is the longest side; returns false
       Otherwise (hint: use the largest() method that you wrote above!).
       Be careful -- this is a bit more challenging than it seems!  Consider if
       side1 = 3, side2 = 4, and side3 = 5 vs. if side1 = 5, side2 = 4, and
       side3 = 3 -- will your code work regardless of which side is the longest
       of the three?
     */
    public boolean rightTriangle(int side1, int side2, int side3) {
        int greatest = largest(side1, side2, side3);
        double a2 = Math.pow(side1, 2);
        double b2 = Math.pow(side2, 2);
        double c2 = Math.pow(side3, 2);
        //checks to see if side1 is the greatest
        if(greatest == side1) {
            a2 = Math.pow(side2, 2);
            b2 = Math.pow(side3, 2);
            c2 = Math.pow(side1, 2);
        }
        //checks to see if side 2 is the greatest
        if(greatest == side2) {
            a2 = Math.pow(side1, 2);
            b2 = Math.pow(side3, 2);
            c2 = Math.pow(side2, 2);
        }

        if(a2 + b2 == c2){
            return true;
        } else {
            return false;
        }



    }

}

