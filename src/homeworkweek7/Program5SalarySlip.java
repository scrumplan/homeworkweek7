package homeworkweek7;

/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10%
DA = Basic salary 8%
 TA = Basic salary 9%
  PF= Basic salary 20%
  Gross salary = basic salary + HRA + TA + DA –PF
   Print in following format
    _______________________________
    | Salary Slip                  |
    |______________________________|
    | Employee Id : 2564           |
    | Employee Name : Jay          |
    |______________________________|
    | Basic Salary : 25000.0       |
    | HRA 10% : 2500.0             |
    | TA 8% : 2250.0               |
    | DA 9% : 2000.0               |
    | PF - 20& : 5000.0            |
    |______________________________|
    | Gross Salary : 26750.0       |
    |===========================   |
 */

import java.util.Scanner;
public class Program5SalarySlip {

        public static void main(String[] args) {
            int empId;
            String empName;
            double bs, hra,ta, da, pf;
            double gross = 0;


            Scanner em = new Scanner(System.in); //scanner syntax
            System.out.print("Enter employee Id: ");
            empId =em.nextInt();

            System.out.print("Enter employee name: ");
            empName =em.next();

            System.out.print("Enter employee salary: ");
            bs = em.nextDouble();
            da = 9.0 / 100.0 * bs;
            hra = 10.0 / 100.0 * bs;
            ta = 8.0 / 100.0 * bs;
            pf = 20.0 / 100.0 * bs;

            gross = ((bs +hra + ta + da) - (pf));
            System.out.println("|------------------------------------|");
            System.out.println("|          Salary Slip               |");
            System.out.println("|------------------------------------|");
            System.out.println("| Employee Id          : "+empId+"         |");
            System.out.println("| Employee Name        : "+empName+"       |");
            System.out.println("|------------------------------------ |");
            System.out.println("| Basic Salary         : "+bs+"     |");
            System.out.println("| HRA  10%             : "+hra+"      |");
            System.out.println("| TA    8%             : "+ta+"      |");
            System.out.println("| DA    9%             : "+da+"      |");
            System.out.println("| PF - 20 &            : "+pf+"      |");
            System.out.println("|____________________________________|");
            System.out.println("| Gross Salary         : "+gross+"     |");
            System.out.println("|====================================|");
        }
}





