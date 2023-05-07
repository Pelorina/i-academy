package StringBuilder;

public class Reverse {
    public static void main(String[] args) {

        String name="adelola";
        StringBuilder newName=new StringBuilder(name);
        newName= new StringBuilder(name.toUpperCase());
        System.out.println(newName);
        System.out.println(newName.reverse());

        System.out.println("concatenate");
        String height="oloyede";
        String weight="tobi";
        String total=height.concat(weight);
        System.out.println(total);

        System.out.println("occurrences");
        String method="all argument constructor";
        StringBuilder newMethod=new StringBuilder(method);
        String voids=new String();
        System.out.println(newMethod.replace(5,50,voids));
         newName.setCharAt(5,'e');
        System.out.println(newName);
        newName.setLength(50);
        System.out.println(newName);
        newName.equals(6);
        System.out.println(newName);
        newName=new StringBuilder(name.toLowerCase());

        System.out.println("palindrome");
        StringBuilder check=new StringBuilder("ada");
        StringBuilder checks=new StringBuilder("ada");
        StringBuilder checkMate=new StringBuilder(check.compareTo(checks));
        if (check ==checks){
            System.out.println(true);
        }else {
            System.out.println(false);
        }






        }

    }

