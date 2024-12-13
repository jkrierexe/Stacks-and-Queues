import java.util.Stack;
import java.util.Scanner;
import java.util.Arrays;


public class stack{
    public static void main(String args[]){
        Stack<String> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        String newWord = "";
        
        System.out.print("Please enter a word :: ");
        String word = scan.nextLine();

        stack.addAll(Arrays.asList(word.split("")));

        while(stack.isEmpty()==false){
            newWord += stack.pop();
        }

        System.out.println("\nReversed :: " + newWord);
        System.out.println("Palindrome? :: " + newWord.equals(word));
            
        }

        
    }
