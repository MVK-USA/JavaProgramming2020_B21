package day36_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Masha {

    public static void main(String[] args) {

        ArrayList<Offer> offers = new ArrayList<>();
        offers.addAll(Arrays.asList(
              new Offer(),
              new Offer(),
              new Offer(),
              new Offer(),
              new Offer()
        ));
         offers.get(0).setInfo("CA", "SDET", "CapitalOne",
                 120000, true, true, false, false);
         offers.get(1).setInfo("VA", "QA", "Apple", 115000,
                 true, true, true, true);
         offers.get(2).setInfo("PA", "Scrum Master", "American Express",
                 100000, true, true, false,false);
         offers.get(3).setInfo("DC", "SDET", "USAID", 125000, false, true, true,false);
        offers.get(4).setInfo("Texas", "SDET", "Bank Of America", 100000, true, false, true, true);

/*
        for(int i=0; i <= offers.size()-1; i++){
            offers.get(i).getInfo();
            */
        System.out.println("=====================================================");
        // only print offers from VA

        for(Offer each:offers){
            if(each.location.equals("VA")&& each.salary>=100000){
                each.getInfo();
            }
        }
        System.out.println("===============================================");

        ArrayList<Offer> localOffers = new ArrayList<>(offers);
        localOffers.removeIf(p-> !p.location.equals("VA")); //retain if the offer is from VA

        System.out.println("VA offers: "+localOffers.size());

        System.out.println("================================================");

        ArrayList<Offer> SDETOffers = new ArrayList<>(offers);
        SDETOffers.removeIf(p-> !p.jobTitle.equals("SDET")); // retain if the offers for SDET

        System.out.println("SDET Offers: "+SDETOffers.size());

        System.out.println("================================================");

        ArrayList<Offer> goodSalary = new ArrayList<>(offers);
        goodSalary.removeIf(p -> p.salary < 120000);

        System.out.println("$120k or more: "+goodSalary);

    }
}
