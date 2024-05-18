import java.util.*;
class Quiz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Question Number 1");
        System.out.println("What planet is known as the Red Planet");
        System.out.println("Select one option");
        System.out.println("a) Venus");
        System.out.println("b) Mars");
        System.out.println("c) Jupiter");
        System.out.println("d) Saturn");
        String ans1 = sc.nextLine();

        if(ans1.equalsIgnoreCase("b")){
            System.out.println("correct");
            System.out.println();
            score++;
        }
        else{
            System.out.println("Incorrect. The correct answer is b) Mars");
            System.out.println();
        }


        System.out.println("Question Number 2");
        System.out.println("In which year did World War II end?");
        System.out.println("Select one option");
        System.out.println("a) 1945");
        System.out.println("b) 1946");
        System.out.println("c) 1947");
        System.out.println("d) 1948");
        String ans2 = sc.nextLine();

        if(ans1.equalsIgnoreCase("a")){
            System.out.println("correct");
            System.out.println();
            score++;
        }
        else{
            System.out.println("Incorrect. The correct answer is a) 1945");
            System.out.println();
        }


        System.out.println("Question Number 3");
        System.out.println("What force keeps us on the ground?");
        System.out.println("Select one option");
        System.out.println("a) Magnetism");
        System.out.println("b) Gravity");
        System.out.println("c) Electromagnetism");
        System.out.println("d) Friction");
        String ans3 = sc.nextLine();

        if(ans1.equalsIgnoreCase("b")){
            System.out.println("correct");
            System.out.println();
            score++;
        }
        else{
            System.out.println("Incorrect. The correct answer is b) Gravity");
            System.out.println();
        }

        System.out.println("Your Final Score is "+score+"/3");
    }
}