package AprilAssignment;

import java.util.Arrays;

public class Testing {

        public static void main(String[] args) {
            Property apa1 = new Apartment.Apartments("1", "berger", 3,
                    2, 2000, true, PropertyCode.APA, 2);
            Property apa2 = new Apartment.Apartments("2", "Badagry", 3,
                    2, 4500, false, PropertyCode.APA, 2);
            Property apa3 = new Apartment.Apartments("3", "idumota", 3,
                    2, 4500, false, PropertyCode.APA, 2);
            Property apa4 = new Apartment.Apartments("4", "Ikorodu", 3,
                    2, 4500, true, PropertyCode.APA, 2);
            Property apa5 = new Apartment.Apartments("5", "balogun", 3,
                    2, 4500, true, PropertyCode.APA, 2);
            Property apa6 = new Apartment.Apartments("6", "Palmgroove", 3,
                    2, 4500, false, PropertyCode.APA, 2);
            Property apa7 = new Apartment.Apartments("7", "Oshodi", 3,
                    2, 4500, true, PropertyCode.APA, 2);
            Property apa8 = new Apartment.Apartments("8", "Ketu", 3,
                    2, 4500, true, PropertyCode.APA, 2);
            Property condos1 = new Condos("1", "Ikeja", 3, 2,
                    3500, true, PropertyCode.CON, 4, "Pool");
            Property condos2 = new Condos("1", "Mile12", 3, 2,
                    3500, false, PropertyCode.CON, 4, "Pool");
            Property condos3 = new Condos("2", "adeniji", 3, 2,
                    3500, true, PropertyCode.CON, 4, "Pool");
            Property house1 = new Houses("1", "Ajegumle", 3, 2,
                    3500, true, PropertyCode.HOU, 4, 3.5);
            Property house2 = new Houses("2", "lekki", 3, 2,
                    3500, true, PropertyCode.HOU, 4, 3.5);

            RentalRepository rentalRepo = new RentalRepository(20);

            rentalRepo.addProperty(apa1);
            rentalRepo.addProperty(apa2);
            rentalRepo.addProperty(apa3);
            rentalRepo.addProperty(apa4);
            rentalRepo.addProperty(apa5);
            rentalRepo.addProperty(apa6);
            rentalRepo.addProperty(apa7);
            rentalRepo.addProperty(apa8);
            rentalRepo.addProperty(house1);
            rentalRepo.addProperty(house2);
            rentalRepo.addProperty(condos1);
            rentalRepo.addProperty(condos2);
            rentalRepo.addProperty(condos3);

        rentalRepo.deleteProperty("APA001");

        Property newApa2 = new Apartment.Apartments("2", "Ijaiye", 3,
                4, 2000, false, PropertyCode.APA, 2);
        rentalRepo.updateProperty("APA002",newApa2);
        System.out.println(apa2);


//             get all properties from the repo
        Property[] properties = rentalRepo.viewAllProperties();

        // print the property details
        for (Property property: properties) {
            System.out.println(property.toString());
        }

        System.out.println(Arrays.toString(rentalRepo.viewAllProperties()));

        System.out.println(Arrays.toString(rentalRepo.viewAllApartments()));
        System.out.println(Arrays.toString(rentalRepo.viewAllHouses()));
        System.out.println(Arrays.toString(rentalRepo.viewAllCondos()));
        System.out.println(Arrays.toString(rentalRepo.getAllOccupiedProperties()));
        System.out.println(Arrays.toString(rentalRepo.getAllUnoccupiedProperties()));
        System.out.println(Arrays.toString(rentalRepo.searchByLocation("Apapa")));
        System.out.println(rentalRepo.getTotalNumberOfProperties());
        System.out.println(rentalRepo.getTotalNumberofApartments());
        System.out.println(rentalRepo.getTotalNumberOfBedroomsInApartments());
        System.out.println(rentalRepo.getTotalNumberOfBathroomsInApartments());
        System.out.println(rentalRepo.getTotalRentalIncomePerMonthFromApartments());
        System.out.println(rentalRepo.getTotalNumberOfOccupiedApartments());
            System.out.println(rentalRepo.getTotalNumberOfUnoccupiedApartments());


        }
    }

