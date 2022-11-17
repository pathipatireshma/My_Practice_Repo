
class EmployeeDetails {
    private String empAddress;
    private String empID;
    private String empName;
    private String emp_doj;
    private String MobileNumber;

    public String getEmployeedetails(String empID, String empName, String emp_doj, String empAddress, String empMobileNumber) {
        return "\tempID :" + empID + "\n\t empName :" + empName + "\n\t emp_doj :" + emp_doj + "\n\t empAddress :" + empAddress + "\n\t MobileNumber :" + empMobileNumber;
    }

    public void setEmployeedetails(String empID, String empName, String emp_doj, String empAddress, String empMobileNumber) {
        this.empID = empID;
        this.empName = empName;
        this.emp_doj = emp_doj;
        this.empAddress = empAddress;
        this.MobileNumber = empMobileNumber;
    }
}
class Emp_Income {
    String base_sal ;
    String emp_hra = "2000";
    String emp_ctc = "25,000";
    String Special_allowance = "3000";

    public String getEmp_Income(String base_sal , String emp_hra , String emp_ctc, String Special_allowance){
        return "emp_ctc :" + emp_ctc + "\n base_sal :" + base_sal + "\n emp_hra :" + emp_hra + "\nSpecial_allowance :" + Special_allowance;
    }

    public void setEmp_Income(String base_sal , String emp_hra , String emp_ctc, String Special_allowance){
        this.emp_ctc = emp_ctc;
        this.base_sal = base_sal;
        this.emp_hra = emp_hra;
        this.Special_allowance = Special_allowance;
    }
}



    public class Employee {
        public static void main(String args[]) {
            EmployeeDetails emp = new EmployeeDetails();
            String empInfo_emp1 = emp.getEmployeedetails("101", "Reshma", "24-June-2022", "Hyderabad", "9959996264");

            String empInfo_emp2 = emp.getEmployeedetails("102", "Harini", "20-June-2022", "Hyderabad", "9959996264");


            System.out.println("Emp1_Details :" + "\n\t"+empInfo_emp1 + "\nEmp2_Details :" + "\n\t"+empInfo_emp2);

        }
}
