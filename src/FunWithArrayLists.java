import java.util.ArrayList;
import java.util.Scanner;

public class FunWithArrayLists {
    public static void main(String[] args){
        //Scanner
        Scanner kybd = new Scanner(System.in);
        String userInput = "";

        //Part 1
        ArrayList<String> colorList = new ArrayList<>();

        //Part 2
        colorList.add("pink");
        colorList.add("red");
        colorList.add("blue");

        System.out.println(colorList);

        //Part 3
        System.out.println(colorList.get(1));

        //Part 4/5

        while(userInput != "q"){
            System.out.print("Enter a color(Press 'Q' to quit): ");
            userInput = kybd.next();

            if(userInput.equals("q") || userInput.equals("Q")){
                userInput = "q";
            }
            else{
                colorList.add(userInput);
            }
        }
        System.out.println("These are your colors: " + colorList);
    }
}
