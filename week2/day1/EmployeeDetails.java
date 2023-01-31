package week2.day1;

public class EmployeeDetails {
		public void prientEmployeeDetails(String empName , int empId) {
			System.out.println("EmployeeDetails :"+ empName);
			System.out.println("Employee Id :" + empId);
		}
		public void employeeAddress(String empAdress) {
			System.out.println("EmployeeAddress :"+ empAdress);
		}
		public void employeeSalary( Double empSalary) {
			System.out.println("Employee Salary :" + empSalary);
		}
		public void employeeMobileNumber(long mobNum) {
			System.out.println("EmployeeMobileNumber :" +mobNum );
		}
		
        public static void main(String[] args) {
			EmployeeDetails employee=new EmployeeDetails();
			employee.prientEmployeeDetails("Mohamed razali",78654);
			employee.employeeAddress("Chennai");
			employee.employeeSalary(35000.67);
			employee.employeeMobileNumber(7871655826l);
		}

}
