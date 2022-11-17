
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
    public void Emp_IncomeInfo(){
        this.emp_ctc = emp_ctc;
    }
    public Integer getEmp_IncomeInfo(Integer emp_ctc){
        return emp_ctc;
    }
    public String Emp_Income_Classification(Integer emp_ctc){
        Integer base_sal = emp_ctc / 2;
        Integer hra = emp_ctc / 4;
        Integer special_allowance = emp_ctc / 4;
        String base_salstr = base_sal.toString();
        String hrastr = hra.toString();
        String specialallowancestr= special_allowance.toString();
        String ctcstr = emp_ctc.toString();
        return  "\n\t Total_CTC : " + ctcstr + "\n\t Base_Salary :" + base_salstr + "\n\t House Rent Allowance :" + hrastr + "\n\t Special Allowance :" + specialallowancestr;
        }

}

public class Employee {

        public static void main(String args[]) {
            String Company_Name = "\t\t CAPGEMINI \n\t\t\t HYDERABAD \n\t\t Employee-Details";
            EmployeeDetails emp = new EmployeeDetails();
            Emp_IncomeInfo emp_info = new Emp_IncomeInfo();

            String empInfo_emp1 = emp.getEmployeedetails("101", "Reshma", "24-June-2022", "Hyderabad", "9959996264");
//            Integer emp_ctc = emp_info.getEmp_IncomeInfo();
//            String emp_ctc_str = emp_info.emp_ctc.toString();
            String Income_Info1 = emp_info.Emp_Income_Classification(100000);
            String Income_Info2 = emp_info.Emp_Income_Classification(200000);


            String empInfo_emp2 = emp.getEmployeedetails("102", "Harini", "20-June-2022", "Hyderabad", "9959996264");


            System.out.println("\t" + Company_Name + "\nEmp1_Details :" + "\n\t"+empInfo_emp1 + "\t" + Income_Info1 + "\nEmp2_Details :" + "\n\t"+empInfo_emp2 + "\t" + Income_Info2);

        }
    public void pattern() {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == 1 || i == 10 || j == 1 || j == 10) {
                    System.out.println("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
