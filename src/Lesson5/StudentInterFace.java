package Lesson5;

import java.util.Scanner;

public class StudentInterFace {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Scanner s = new Scanner(System.in);
        
        String name;
        int score;
        //1st Student
        while(true){
        System.out.print("Enter name for 1st student (min 1 letter): ");
        name = s.nextLine();
        s1.setName(name);
        for (int i = 1; i <=3; i++) {
            System.out.format("Enter test score %d for %s: ", i, s1.getName());
            score = s.nextInt();
            s1.setScore(i, score);
        }
        String em = s1.validateData();
        if(em == null){
            break;
        }else {
            System.out.println(em);
        }
    }
        
        s.nextLine();        
        System.out.println("\n-----------------------\n");
        //2nd Student
        while(true){
        System.out.print("Enter name for 2nd student: ");
        name = s.nextLine();
        s2.setName(name);
        for (int i = 1; i <=3; i++) {
            System.out.format("Enter test score %d for %s: ", i, s2.getName());
            score = s.nextInt();
            s2.setScore(i, score);
        }
        String errormsg = s2.validateData();
        if(errormsg == null) break;
        else System.out.println(errormsg);
    }
        System.out.println("\n-----------------------\n");
        
        //print Student Info
        System.out.println(s1);
        System.out.println(s2);
        if(s1.getHighScore()>s2.getHighScore()){
            System.out.format("%s has the highest score of %d", s1.getName(), s1.getHighScore());
        }
        else System.out.format("%s has the highest score of %d", s2.getName(), s2.getHighScore());
        if(s1.getAverage()>s2.getAverage()){
            System.out.format("%s has the highest average score of %d", s1.getName(), s1.getAverage());
        }
        else System.out.format("%s has the highest average score of %d", s2.getName(), s2.getAverage());
    }
    
}
