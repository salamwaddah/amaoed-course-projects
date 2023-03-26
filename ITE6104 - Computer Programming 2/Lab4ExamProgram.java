/**
 * ITE6104 - Lab 4
 * Exam Program
 * Abdulsalam Alaraj
 * AMA Computer University
 * -
 * Create a program that allows the user to take exam.
 * The exam should have 5 questions (You can ask any questions).
 * The questions are in multiple choice form and the choices are numbers.
 * The program will display the questions one by one, and then the user can enter the correct number that corresponds to his answer.
 * Every time the user answers question the program will check if it is correct,
 * if the answer is correct the program will print "Correct!" otherwise it will display "Incorrect!" and the correct answer.
 * Once the user is done with all the questions, the program will display the score and the equivalent percentage that the user got.
 */

import java.util.Scanner;

public class Lab4ExamProgram {
    public static void main(String[] args) {
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        String[][][] questions = {
                {
                        {"Who is the first president of the Philippines?"},
                        {"Emilio Aguinaldo", "Joseph Estrada", "Manuel Quezon", "GMA"},
                        {"1"}
                },
                {
                        {"Hitler party which came into power in 1993 is known as?"},
                        {"Labour Party", "Nazi Party", "Ku-Klux-Klan", "Democratic Party"},
                        {"2"}
                },
                {
                        {"For which of the following disciplines is Nobel Prize awarded"},
                        {"Physics and Chemistry", "Physiology or Medicine", "Literature, Peace and Economics", "All of the above"},
                        {"4"}
                },
                {
                        {"What is 3*(2-1)?"},
                        {"1", "2", "3", "4"},
                        {"3"}
                },
                {
                        {"What is 1+1"},
                        {"1", "2", "3", "4"},
                        {"1"}
                },
        };

        int questionsCount = questions.length;

        for (int q = 0; q < questions.length; q++) {
            String question = questions[q][0][0];
            int correctAnswer = Integer.parseInt(questions[q][2][0]);
            String[] options = questions[q][1];
            System.out.println(question);

            for (int o = 0; o < options.length; o++) {
                System.out.println(o + 1 + "." + options[o]);
            }

            System.out.println("Enter [1-4]: ");
            int answer = scanner.nextInt();

            if (answer == correctAnswer) {
                score++;
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect! The correct answer is (" + correctAnswer + "): " + options[correctAnswer - 1]);
            }

            System.out.println();
        }

        float percent = score * 100 / questionsCount;
        System.out.println("Congratulations, you got " + score + " answers right!");
        System.out.println("That is a score of " + percent + " percent");
    }
}
