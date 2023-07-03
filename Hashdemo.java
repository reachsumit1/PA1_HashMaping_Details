package bridgelabzprojecthashmaping;

import java.util.HashMap;
class CustomDetails{
    String FirstName;
    String LastName;
    String Address;
    String City;
    long Phone;
    String Email;
    CustomDetails(String s1, String s2, String s3, String s4, long l, String s5){
        this.FirstName= s1;
        this.LastName= s2;
        this.Address= s3;
        this.City= s4;
        this.Phone= l;
        this.Email= s5;

    }

    @Override
    public String toString() {
        return "CustomDetails{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", Phone=" + Phone +
                ", Email='" + Email + '\'' +
                '}';
    }
}
public class Hashdemo {
    public static void main(String[] args) {
        CustomDetails s1= new CustomDetails("Piyush","Kumar", "Alpha coplex", "Delhi", 9874563210l, "pk@gnail.com");
        CustomDetails s2= new CustomDetails("Amit", "Kumar", "Delta Complx", "Pune",8794561230l, "Alp@gmail.com");
        CustomDetails s3= new CustomDetails("Mohit","Mohan", "Vinay Nagar", "Kolkata",9987456321l, "mohitmm@gmail.com");
        CustomDetails s4= new CustomDetails("Anil", "Kishore", "Vijay Vihar", "Bhopal", 8879456123l, "al47@gmail.com");
        CustomDetails s5= new CustomDetails("Vibhor", "Gupta", "Ivy Estate", "Pune",6958471230l, "vibe101@gmail.com");
        CustomDetails s6= new CustomDetails("Umesh", "Nandan", "Railway Colony", "Gaziabad", 7485963203l, "Umeshn@gmail.com");
        CustomDetails s7= new CustomDetails("Naresh", "Sharma", "Bright Colony", "Noida", 9856472130l, "nmm@gmail.com");
        CustomDetails s8= new CustomDetails("Prsveen", "Roy", "Nehru Colony", "Kochi", 6206206206l, "pravn1@gmail.com");
        CustomDetails s9= new CustomDetails("Ziya", "Ana", "Cross Road", "Goa", 9998887776l, "anazi@gmail.com");
        CustomDetails s10= new CustomDetails("Rohit", "Prasad", "Hill View", "Mumbai", 7778889996l, "rohitp@gmail.com");
        HashMap<Long, CustomDetails> list1= new HashMap<>();

        list1.put(s1.Phone,s1);
        list1.put(s2.Phone,s2);
        list1.put(s3.Phone,s3);
        list1.put(s4.Phone,s4);
        list1.put(s5.Phone,s5);
        list1.put(s6.Phone,s6);
        list1.put(s7.Phone,s7);
        list1.put(s8.Phone,s8);
        list1.put(s9.Phone,s9);
        list1.put(s10.Phone,s10);
        System.out.println(list1 );

    }
}