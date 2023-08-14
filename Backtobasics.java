import java.util.*;

public class Backtobasics {
    //main - menu for all prompts
    public static void main(String[] args) {
        Backtobasics exec = new Backtobasics();
        //exec.method
    }

    //name prompt
    public void Name () {
        System.out.print("What is your name? ");
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        read.close();
        System.out.println("Hello " + name + "!");
    }

    //sum from 1 to n
    public void Sum () {

    }
    
    //sum of 5s from 1 to n
    //sum from 1 to n OR product based on prompt
    //mul tables
    //primes from 1 to n
    //guess secret number
}