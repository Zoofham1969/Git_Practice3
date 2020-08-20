package practice;

public class offer {

    String location;
    String jobTitle;
    boolean hasBenefit;
    double salary;
    boolean workFromHome;

    public void setInfo(String jobLocation, String title, double jobSalary, boolean hasBenefit, boolean wfh){

        location = jobLocation;
        jobTitle = title;
        salary = jobSalary;
        hasBenefit =hasBenefit;
        workFromHome = wfh;

    }

    public void getInfo(){

        System.out.println("location : "+ location+",jobTitle: "+jobTitle+",Salary: "+salary+"Benifit: "+hasBenefit+", workFromHome:"+workFromHome);




    }


}
