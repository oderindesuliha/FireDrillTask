package chapter5;

import java.util.Scanner;

public class StudentGrade {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int gradeA = 0;
            int gradeB = 0;
            int gradeC = 0;
            int gradeD = 0;

            for (int count = 1; count <= 5; count++) {
                System.out.print("Enter Student " + count + "'s name: ");
                String name = input.next();

                System.out.print("Enter " + name + "'s grade (A, B, C, D): ");
                char grade = input.next().charAt(0);

                switch (grade) {
                    case 'A':
                        gradeA++;
                        break;
                    case 'B':
                        gradeB++;
                        break;
                    case 'C':
                        gradeC++;
                        break;
                    case 'D':
                        gradeD++;
                        break;
                    default:
                        System.out.println("Invalid grade");
                        break;
                }
            }

            System.out.println("Grade A: " + gradeA);
            System.out.println("Grade B: " + gradeB);
            System.out.println("Grade C: " + gradeC);
            System.out.println("Grade D: " + gradeD);
        }
    }



