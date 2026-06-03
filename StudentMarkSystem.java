import java.util.*;
public class StudentMarkSystem{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Students");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name of Students and their marks");
        String[] student = new String[n];
        int[] marks = new int[n];
        for(int i =0; i< n; i++){
            System.out.println("Enter name of the students:");
            student[i] = sc.nextLine();
            System.out.println("Enter marks of each Student:");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }
        char[] grades = new char[n];
        for(int i =0; i<n; i++){
            if(marks[i] >90 && marks[i]<= 100){
                grades[i] = 'A';
            }else if(marks[i] > 80 && marks[i] <= 90){
                grades[i] = 'B';
            }else if(marks[i] > 70 && marks[i] <= 80){
                grades[i] = 'C';
            }else if(marks[i] > 60 && marks[i] <= 70){
                grades[i] = 'D';
            }else{
                grades[i] = 'F';
            }
        }
        System.out.println("\nStudent Details");
        System.out.printf("%-10s %-15s %-15s%n", "NAME", "MARKS", "GRADE");
        for(int i = 0; i< n; i++){
            System.out.printf("%-10s %-15s %-15s%n", student[i], marks[i], grades[i]);
        }
        int maxscore = marks[0];
        for(int i= 1; i<n; i++){
            if(maxscore < marks[i]){
                maxscore = marks[i];
                
            }    
        }
        System.out.printf("\nMAXIMUM SCORE : " + maxscore);
        System.out.printf("\n Maximum Score was secured by ");
        for(int i =0; i<n; i++){
            if(maxscore == marks[i]){
                System.out.printf(student[i]);
            }
        }
       
        
        int minscore = marks[0];
        for(int i =1; i< n; i++){
            if(minscore > marks[i]){
                minscore = marks[i];
            }
        }
        System.out.printf("\nMINIMUM SCORE : " +minscore);
        System.out.printf("\nMinimum Score was secured by ");
        for(int i =0; i<n; i++){
            if(minscore == marks[i]){
                System.out.printf(student[i]+ " ");
            }
        }
        
        int totalmarks = 0;
        for(int i = 0; i< n; i++){
            totalmarks += marks[i];
            
        }
        double avgmarks = (double) totalmarks / n;
        System.out.printf("\nTOTAL MARKS : %d%n", totalmarks);
        System.out.printf("AVERAGE MARKS : %.2f%n", avgmarks);
        int pass = 0;
        int fail = 0;
        for(int i =0; i<n; i++){
            if(grades[i] == 'A' || grades[i] == 'B' || grades[i] == 'C' || grades[i] == 'D'){
                pass++;
            }else{
                fail++;
            }
        }
        System.out.printf("\nTOTAL PASS : " + pass);
        System.out.printf("\nTOTAL FAIL : " +fail);

        System.out.printf("\nEnter Student Name to search : ");
        String search = sc.nextLine();
        for(int i = 0;i<n; i++){
            if(student[i].equalsIgnoreCase(search)){
                System.out.printf(student[i] + " scored " + marks[i]);
            }
        }
        
        sc.close();
    }
}

