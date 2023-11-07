/* Q1) Write a program to read the First Name and Last Name of a person, his weight and height using
command line arguments. Calculate the BMI Index which is defined as the individual's body mass
divided by the square of their heigh
 */
public class S02_1 {
    public static void main(String args[]) {

        String name = args[0];
        String Sname = args[1];
        int wt = Integer.parseInt(args[2]);
        double ht = Integer.parseInt(args[3]);

        double  BMI = wt / (ht * ht);

        System.out.println("BMI of " + name + " " + Sname + " is " + BMI);
    }
}
