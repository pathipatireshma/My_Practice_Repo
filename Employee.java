
class EmployeeDetails {
    private String empAddress;
    private String empID;
    private String empName;
    private String emp_doj;
    private String MobileNumber;

    public String getEmployeedetails(String empID, String empName, String emp_doj, String empAddress, String empMobileNumber) {
        return "empID :" + empID + "\n empName :" + empName + "\n emp_doj :" + emp_doj + "\n empAddress :" + empAddress + "\n MobileNumber :" + empMobileNumber;
    }

    public void setEmployeedetails(String empID, String empName, String emp_doj, String empAddress, String empMobileNumber) {
        this.empID = empID;
        this.empName = empName;
        this.emp_doj = emp_doj;
        this.empAddress = empAddress;
        this.MobileNumber = empMobileNumber;
    }
}

    public class Employee {
        public static void main(String args[]) {
            EmployeeDetails emp = new EmployeeDetails();
            emp.setEmployeedetails("101", "Reshma", "24-June-2022", "Hyderabad", "9959996264");
            String empInfo = emp.getEmployeedetails("101", "Reshma", "24-June-2022", "Hyderabad", "9959996264");

            System.out.println(empInfo);

        }
}
