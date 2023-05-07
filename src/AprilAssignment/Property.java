package AprilAssignment;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



    @Getter
    @Setter
    @NoArgsConstructor
    @ToString
    public abstract class Property {

        private String propertyCode;
        private String Location;
        private int noOfBedrooms;
        private int noOfBathrooms;
        private double rentPerMonth;
        private boolean isOccupiedStatus;
        private PropertyCode property;

        public Property(String propertyCode, String location, int noOfBedrooms, int noOfBathrooms, double rentPerMonth,
                        boolean isOccupiedStatus, PropertyCode property) {
            this.propertyCode = PropertyCodeGenerator.propertyCode(property);
            Location = location;
            this.noOfBedrooms = noOfBedrooms;
            this.noOfBathrooms = noOfBathrooms;
            this.rentPerMonth = rentPerMonth;
            this.isOccupiedStatus = isOccupiedStatus;
        }

        public void setPropertyCode(String propertyCode) {
            this.propertyCode = PropertyCodeGenerator.propertyCode(property);
        }



        public abstract double rentalIncome();

        @Override
        public String toString() {
            return
                    "propertyCode='" + propertyCode + "," +'\n' +
                            "Location='" + Location + "," + '\n' +
                            "noOfBedrooms=" + noOfBedrooms +"," + '\n' +
                            "noOfBathrooms=" + noOfBathrooms + "," + '\n' +
                            "rentPerMonth=" + rentPerMonth + "," + '\n' +
                            "isOccupiedStatus=" + isOccupiedStatus + "\n";
        }
    }

