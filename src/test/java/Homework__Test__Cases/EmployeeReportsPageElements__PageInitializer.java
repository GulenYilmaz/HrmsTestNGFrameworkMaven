package Homework__Test__Cases;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.testbase.BaseClass;

import Homework__Test__Cases.EmployeeReportsPageElements;

//initializes all pages class and stores references in static varibales
//that will called/used in test classes
public class EmployeeReportsPageElements__PageInitializer extends BaseClass{

	public static LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static DashboardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static EmployeeReportsPageElements empReports;
	
	public static void initialize() {
		
		login=new LoginPageElements();
		dashboard=new DashboardPageElements();
		addEmp=new AddEmployeePageElements();
		pdetails=new PersonalDetailsPageElements();
		empReports = new EmployeeReportsPageElements();
	}
}