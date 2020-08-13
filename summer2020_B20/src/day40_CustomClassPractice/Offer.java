package day40_;
/*
Offer
		Attribute:
			salary, Location, hasPTO, isFullTime, WFH, jobTitle, hasBenefit
		Actions:
			setOfferInfo
			getOfferInfo
		MUST use this keyword
 */
public class Offer {

    double salary;
    String state;
    boolean hasPTO;
    boolean isFullTime;
    boolean isWHF;
    String jobTitle;
    boolean hasBenefit;

        public void setOfferInformation(double salary, String state, boolean hasPTOt, boolean isFulltime, boolean isWHF, String jobTitle, boolean hasBenefit){
               this.salary = salary;
               this.state = state;
               this.hasPTO = hasPTO;
               this.isFullTime = isFullTime;
               this.isWHF = isWHF;
               this.jobTitle = jobTitle;
               this.hasBenefit = hasBenefit;



        }
    public void getOfferInfo(){// display the offer info
        System.out.println("==============================================");
        System.out.println("Salary: "+salary);
        System.out.println("JobTitle: "+jobTitle);
        System.out.println("Location: "+state);
        System.out.println("==============================================");
    }

}
