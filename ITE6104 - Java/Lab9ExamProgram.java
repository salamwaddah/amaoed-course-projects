/**
 * ITE6104 - Lab 9
 * Abdulsalam Alaraj
 * AMA Computer University
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab9ExamProgram {
    public static void main(String[] args) {
        boolean valid;

        do {
            try {
                valid = false;
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
            } catch (InputMismatchException e) {
                System.out.println("INVALID INPUT!");
                valid = true;
            }
        } while (valid);
    }
}
