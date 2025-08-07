package students_detail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylistproject {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<College> list = new ArrayList<>();

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("The name of the Student:");
            String stuName = sc.nextLine();

            System.out.println("The regno of the Student:");
            int regno = sc.nextInt();
            sc.nextLine(); 

            System.out.println("The department of the Student:");
            String department = sc.nextLine();

            String transport;
            while (true) {
                System.out.println("Enter transport mode (dayscholar / college bus / hosteller):");
                transport = sc.nextLine().toLowerCase();
                if (transport.equals("dayscholar") || transport.equals("college bus") || transport.equals("hosteller")) {
                    break;
                } else {
                    System.out.println("Invalid transport option. Please enter again.");
                }
            }

            System.out.println("Enter email ID:");
            String email = sc.nextLine();

            
            list.add(new College(stuName, regno, department, transport, email));
        }

               System.out.println("\n--- Student Details ---");
        Iterator<College> it = list.iterator();
        while (it.hasNext()) {
            College c = it.next();
            System.out.println(c);
        }
        sc.close();
    }
}


class College {
    String stuName;
    int regno;
    String department;
    String transport;
    String email;

    
    College(String stuName, int regno, String department, String transport, String email) {
        this.stuName = stuName;
        this.regno = regno;
        this.department = department;
        this.transport = transport;
        this.email = email;
    }

    public String toString() {
        return "Student " + stuName + " regno " + regno + " belongs to " + department +
               "\nTransport: " + transport + ", Email: " + email + "\n";
}
}
