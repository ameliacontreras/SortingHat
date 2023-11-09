import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to Hogwarts! Let the Sorting Hat choose your house.");
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        int count = 0;
        System.out.println("Answer the following questions using the letter option");
        System.out.println("You're assigned a group project. Your role is:");
        System.out.println("(a)Leading and organizing the team");
        System.out.println("(b)Supporting and helping where needed");
        System.out.println("(c)Brainstorming and offering creative solutions");
        System.out.println("(d)Ensuring the group gets recognition");
        String answer1 = scan.nextLine();
        if(answer1.equals("a")){
            count +=1;
        }else if(answer1.equals("b")){
            count+=2;
        } else if (answer1.equals("c")) {
            count +=3;
        }else if(answer1.equals("d")){
            count +=4;
        }
        System.out.println("You come across a locked door with a riddle. Do you:");
        System.out.println("(a)Attempt to force it open");
        System.out.println("(b)Wait for someone else to solve it");
        System.out.println("(c)Spend time analyzing the riddle");
        System.out.println("(d)Look for another way around");
        String answer2 = scan.nextLine();
        if(answer2.equals("a")){
            count +=1;
        }else if(answer2.equals("b")){
            count+=2;
        } else if (answer2.equals("c")) {
            count +=3;
        }else if(answer2.equals("d")){
            count +=4;
        }
        System.out.println("A competition is announced with a grand prize. You:");
        System.out.println("(a)Enter without hesitation,trusting your skills");
        System.out.println("(b)Consider if it's worth your time");
        System.out.println("(c)Learn as much as you can to ensure victory");
        System.out.println("(d)Make alliances to secure your win");
        String answer3 = scan.nextLine();
        if(answer3.equals("a")){
            count +=1;
        }else if(answer3.equals("b")){
            count+=2;
        } else if (answer3.equals("c")) {
            count +=3;
        }else if(answer3.equals("d")){
            count +=4;
        }
        System.out.println("Which trait do you value most in yourself?");
        System.out.println("(a)Bravery");
        System.out.println("(b)Loyalty");
        System.out.println("(c)Intelligence");
        System.out.println("(d)Ambition");
        String answer4 = scan.nextLine();
        if(answer4.equals("a")){
            count +=1;
        }else if(answer4.equals("b")){
            count+=2;
        } else if (answer4.equals("c")) {
            count +=3;
        }else if(answer4.equals("d")){
            count +=4;
        }
        //Sorts you into a house based on points
        if (count <= 4){
            System.out.println("You belong in Gryffindor");
        }else if(count > 4 && count <= 8){
            System.out.println("You belong in Hufflepuff");
        }else if (count > 8 && count <= 12){
            System.out.println("You belong in Ravenclaw");
        }else{
            System.out.println("You belong in Slytherin");
        }
    }
}
