package Lesson6;

import java.util.Scanner;

public class PayrollInterface {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee emp;
        String name;
        int type;
        double rate;
        int hours;       
        
        while (true){
            emp = new Employee();
            //ask for name
            System.out.println("Enter data for new Employee\n=================\n");
            System.out.print(" >> Name or, <enter> to quit: ");
            name = scan.nextLine();
            //try to set name, if fail get out of program
            if(emp.setName(name)==false) break;
            //if no break fill in rest of data for employee
            //type
            while(true){
                System.out.print(" >> Type: (" + emp.getTypeRules() + "):");
                type = scan.nextInt();
                if(emp.setType(type)) break;
            }
            
            //rate
            while(true){
                System.out.print(" >> Rate: (" + emp.getRateRules() + "):");
                rate = scan.nextDouble();
                if(emp.setRate(rate)) break;
            }
            
            //hours
            while(true){
                System.out.print(" >> Hours: (" + emp.getHourRules() + "):");
                hours = scan.nextInt();
                if(emp.setHours(hours)) break;
            }
            
            //when I get to here the employee has all VALID data set to its properties
            //print the pay
            System.out.format("Weekly pay for %s is $%.2f\n", emp.getName(), emp.getPay());
            System.out.println("");
            scan.nextLine(); //clear the scanner at bottom of loop
        }
        System.out.println("Program ended.");
    }
    
}
/*
Testing Log
Attempt         Data        Expected        Actual
=======         ====        ========        ======
1               type=0      Type not set    Type not set
2               type=1      Type set        Type set
3               type=2      Type set        Type set
4               type=3      Type not set    Type not set
5               type=-1000  Type not set    Type not set
6               type=1000   Type not set    Type not set
7               rate=6.74   Type not set    Type not set
8               rate=6.75   Type set        Type set
9               rate=30.50  Type not set    Type not set
10              rate=30.51  Type not set    Type not set
11              rate=-100   Type not set    Type not set
12              rate=100    Type not set    Type not set
13              hours=-1    Type not set    Type not set
14              hours=0     Type not set    Type not set
15              hours=1     Type set        Type set
16              hours=59    Type set        Type set
17              hours=60    Type set        Type set
18              hours=61    Type not set    Type not set
19              hours=-100  Type not set    Type not set
20              hours=100   Type not set    Type not set
*/
