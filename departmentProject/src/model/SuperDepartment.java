package model;

public class SuperDepartment {
	public String temp;
	public String departmentName()
	{
		temp="Super Department";
		return  temp;
	}
	public String getTodaysWork() {
		temp="No Work as of now";
				return  temp;
	}
	public String getWorkDeadline() {
		temp=" Nil";
				return  temp;
	}
	public String isTodayAHoliday() {
		temp="Today is not a Holiday";
				return  temp;
	}

}
