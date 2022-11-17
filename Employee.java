
class EmployeeDetails {
    private String empAddress;
    private String empID;
    private String empName;
    private String emp_doj;
    private String MobileNumber;

    public String getEmployeedetails(String empID, String empName, String emp_doj, String empAddress, String empMobileNumber) {
        return "\tempID :" + empID + "\n\t empName :" + empName + "\n\t emp_doj :" + emp_doj + "\n\t empAddress :" + empAddress + "\n\t MobileNumber :" + empMobileNumber;
    }

    public void EmployeeDetails(String empID, String empName, String emp_doj, String empAddress, String empMobileNumber) {
        this.empID = empID;
        this.empName = empName;
        this.emp_doj = emp_doj;
        this.empAddress = empAddress;
        this.MobileNumber = empMobileNumber;
    }
}
class Emp_IncomeInfo {
    Integer emp_ctc;
    private String empID;
    public void Emp_IncomeInfo(Integer emp_ctc, String empID){
        this.emp_ctc = emp_ctc;
        this.empID = empID;
    }
    public Integer getEmp_IncomeInfo(Integer emp_ctc , String empID){
        return emp_ctc;
    }
    public String Emp_Income_Classification(Integer emp_ctc){
        Integer base_sal = emp_ctc / 2;
        Integer hra = emp_ctc / 4;
        Integer special_allowance = emp_ctc / 4;
        String base_salstr = base_sal.toString();
        String hrastr = hra.toString();
        String specialallowancestr= special_allowance.toString();
        return "Total_CTC : " + emp_ctc + "\n Base_Salary :" + base_salstr + "\n House Rent Allowance :" + hrastr + "\n Special Allowance :" + specialallowancestr;
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
