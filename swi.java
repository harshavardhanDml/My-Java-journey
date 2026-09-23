
import java.util.Scanner;
public class swi{
    public static void main(String[] args){
        int day;
        System.out.println("Enter the day number");
        Scanner sc=new Scanner(System.in);
        day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                 System.out.println("Tuesday");
                 break;
                 case 3:
                    System.out.println("Wednesday");
                    break;
                    default:
                        System.out.println("Invalid day");
                
    }
    sc.close();
    
}
}

