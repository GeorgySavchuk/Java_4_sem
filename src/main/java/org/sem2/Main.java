package org.sem2;

import org.sem2.practice1.Tester1;
import org.sem2.practice2.Tester2;
import org.sem2.practice3.Tester3;
import org.sem2.practice4.Tester4;
import org.sem2.practice5.Tester5;
import org.sem2.practice6.Tester6;
import org.sem2.practice7.Tester7;
import org.sem2.practice8.Tester8;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int task;
        while (true){
            System.out.print("Enter task number: ");
            task = scanner.nextInt();
            switch (task){
                case (1) ->{
                    Tester1.test();
                }
                case (2) ->{
                    Tester2.test();
                }
                case (3) ->{
                    Tester3.test();
                }
                case (4) ->{
                    Tester4.test();
                }
                case (5) ->{
                    Tester5.test();
                }
                case (6) ->{
                    Tester6.test();
                }
                case (7) ->{
                    Tester7.test();
                }
                case (8) ->{
                    Tester8.test();
                }

            }
        }
    }

}
