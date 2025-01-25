import java.util.Scanner;

public class marks{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of subject marks: ");
        int n = scan.nextInt();
        int[] marks = new int[n];
        int total = 0;
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+ (i+1) +" mark:");
            marks[i] = scan.nextInt();
            total += marks[i];
        }

        double avg = (double) total/(n * 100)*100;
        String g="";
        for(int j=0;j<n;j++){
            if(marks[j]<50){
                g="Sorry you failed!";
            }
            else{
                if(avg>=90){
                    g="A+";
                }
                else if(avg>=80){
                    g="A";
                }
                else if(avg>=70){
                    g="B+";
                }
                else if(avg>=60){
                    g="B";
                }
                else
                {
                    g="C";
                }
            }
        }

        System.out.println("*****Result*****");
        System.out.println("The Total mark is: "+total);
        System.out.println("The Average Percentage is "+avg+"%");
        System.out.println("The Grade is: "+g);
        scan.close();
    }
}
