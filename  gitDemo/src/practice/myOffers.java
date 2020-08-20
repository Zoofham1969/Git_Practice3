package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class myOffers {

    public static void main(String[] args) {
        offer offer1 = new offer();
        offer1.setInfo("ILL", "SDET", 120000, true, false);
        offer1.getInfo();
        System.out.println();
        System.out.println("=====================================================================");

        offer offer2 = new offer();
        offer2.setInfo("Chicago", "Developer", 140000, true, false);
        offer2.getInfo();
        System.out.println("============================================================");

        offer offer3 = new offer();
        offer3.setInfo("Michigan", "Sdet", 900000, true, true);
        offer3.getInfo();


        offer offer4 = new offer();
        offer4.setInfo("Virjinia", "Sm", 100000, false, false);
        offer4.getInfo();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        offer offer5 = new offer();
        offer5.setInfo("Californa", "SDET", 19000, true, false);
        offer5.getInfo();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        offer offer6 = new offer();
        offer6.setInfo("Newyark", "SDET", 190000, true, true);
        offer6.getInfo();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        offer offer7 = new offer();
        offer7.setInfo("Chicago", "QA", 150000, false, true);
        offer7.getInfo();

        // offer[] offers = {offer1,offer2,offer3,offer4,offer5,offer6,offer7};
        ArrayList<offer> allOffers = new ArrayList<>();
        allOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));
        //  allOffers.removeIf(p-> !p.location.equals("Chicago"));
        //  allOffers.removeIf(p->!p.jobTitle.equals("SDET") &&!p.jobTitle.equals("QA"));
        //  allOffers.removeIf(p->p.workFromHome==true);
        allOffers.removeIf(p -> p.hasBenefit == false);


        System.out.println(allOffers.size());

        for (offer each : allOffers) {
            each.getInfo();
        }


    }


}
