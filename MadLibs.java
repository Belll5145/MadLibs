import java.util.Scanner;
/**
 * Write a description of class MadLibs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MadLibs
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter the date: ");
        int date = input.nextInt();
        input.nextLine();
        System.out.print("Enter an adjective: ");
        String adjOne = input.nextLine();
        System.out.print("Enter a noun: ");
        String nounOne = input.nextLine();
        System.out.print("Enter a place: ");
        String place = input.nextLine();
        System.out.print("Enter a piece of clothing: ");
        String picCloth = input.nextLine();
        System.out.print("Enter an adjective: ");
        String adjTwo = input.nextLine();
        System.out.print("Enter an adjective: ");
        String adjThree = input.nextLine();
        System.out.print("Enter an adjective: ");
        String adjFour = input.nextLine();
        System.out.print("Enter an adjective: ");
        String adjFive = input.nextLine();
        System.out.print("Enter a song title: ");
        String songTitle = input.nextLine();
        System.out.print("Enter a food: ");
        String food = input.nextLine();
        System.out.print("Enter an adjective: ");
        String adjSix = input.nextLine();
        System.out.print("Enter a past tense verb: ");
        String pastVerbOne = input.nextLine();
        System.out.print("Enter a noun: ");
        String nounTwo = input.nextLine();
        System.out.print("Enter a noun: ");
        String nounThree = input.nextLine();
        System.out.print("Enter a past tense verb: ");
        String pastVerbTwo = input.nextLine();
        System.out.print("Enter a past tense verb: ");
        String pastVerbThree = input.nextLine();
        System.out.print("Enter a noun: ");
        String nounFour = input.nextLine();
        System.out.print("Enter a noun: ");
        String nounFive = input.nextLine();
        System.out.print("Enter a verb: ");
        String verbOne = input.nextLine();
        System.out.print("Enter a verb: ");
        String verbTwo = input.nextLine();
        System.out.print("Enter a verb: ");
        String verbThree = input.nextLine();
        System.out.print("Enter an adjective: ");
        String adjSeven = input.nextLine();
        System.out.println("It was a "+ adjOne + " summer day. "+ nounOne + " and I were excited to");
        System.out.println(" go camping at "+ place + ". It was my first time going there. I");
        System.out.println(" packed my favorite "+ picCloth +". It is "+ adjTwo + " and "+ adjThree + ".");
        System.out.println(" Perfect for camping! On the road we went in our "+ adjFour);
        System.out.println(" "+ adjFive +" van! We were listening to "+ songTitle +" all the");
        System.out.println(" way down. The drive was about 5 hours but it was so worth it.");
        System.out.println(" When we got there we unpacked the van. I could smell "+ food);
        System.out.println(" being cooked. It smelled "+ adjSix +". I "+ pastVerbOne +" to the room");
        System.out.println(" I was staying in with my "+ nounTwo +". The next thing I knew, ");
        System.out.println(nounThree +" came and "+ pastVerbTwo +" on the bed. I heard my mom");
        System.out.println(" scream, 'Get off the bed!' I "+ pastVerbThree +" outside. I saw "+ nounFour +".");
        System.out.println(" It was "+ nounFive +". Over the next few days I got to "+ verbOne +", ");
        System.out.println(verbTwo +", and "+ verbThree +". My camping trip was "+ adjSeven +".");
        
    }
}
