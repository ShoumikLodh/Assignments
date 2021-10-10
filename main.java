package com.company;
import java.util.*;
import java.util.Random;


public class Slot {
    int day;
    int slot;
    int quantity;
    //Vaccine v=new Vaccine(String v_name, int doses, int gap);
    String vname;
    String h_id;
//    Vaccine name;
//    Hospital uniq_id;
    public Slot(int day, int slot, int quantity, String vname, String h_id ){

        this.vname=vname;
        this.slot=slot;
        this.quantity=quantity;
        this.h_id=h_id;




    }
    public void add_slot(int day, int slot, int quantity, String vname, String h_id ){
        System.out.println("Slot added for Hospital "+ h_id+ " for Day: "+day+", Available Quantity: "+quantity+"of Vaccine "+vname);
        Main.main(null);
    }


}

public class Vaccine {
    String name;
    int doses;
    int gap;


    public Vaccine(String v_name, int doses, int gap){
        this.name=v_name;
        this.doses=doses;
        this.gap=gap;
    }
    public void add_vaccine(String v_name, int doses, int gap){
        System.out.println("Vaccine Name:  "+ v_name);
        System.out.println("Number of doses:  "+ doses);
        System.out.println("Gap between doses:  "+gap);
        System.out.println("Vaccine Name:  "+ v_name+"Number of doses:  "+ doses+"Gap between doses:  "+gap);
        Main.main(null);
    }

}
public class Hospital {
    String name;
    int pincode;
    String n;
    static ArrayList h_id=new ArrayList();
    static ArrayList pcode=new ArrayList();
    static ArrayList<Hospital> data = new ArrayList<Hospital>();
    /////////////////////////////////////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////////////////////////////////
    static void hdata(String name_hospital, int pincode, String n ){
        data.add(new Hospital(name_hospital, pincode, n));
    }

    public Hospital(String name_hospital, int pincode,String n){
    this.name=name_hospital;
    this.pincode=pincode;


//    h_id.add(n);
//    pcode.add(pincode);
    }


    /////////////////////////////////////////////////////////////////////////////////////////
    public void reg_hospital(String name,int pincode){
        System.out.println(h_id);
        System.out.println("Name of hospital: "+name);
        System.out.println("Pincode: "+pincode);
        System.out.println("Name of hospital: "+name+"Pincode: "+pincode+ "Unique ID : "+n);
        Main.main(null);
    }
//    public void cr_slot(int ID ,int slots, )


}
public class Citizen {
    static ArrayList ids=new ArrayList();

    String name;
    int age;  //no one under 18 allowed
    int id;     // need 6 digits
    String status;

    ////////////////////////////////////////////////////////////////////

    public Citizen(String name, int age, int id, String status) {
        this.name=name;
        this.age=age;
        this.id=id;
        this.status=status;
        if (ids.contains(id)==true){
            System.out.println("ID already present,please try again!");
        }else {
            ids.add(id);
        }



    }


/////////////////////////////////////////////////////////////////////

    void reg_citizen( String name, int age, int id, String status)
    {


        System.out.println("Citizen Name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("Unique Id:"+ id);
        System.out.println("Citizen Name: "+ name+" ,Age:"+ age+",Unique Id: "+ id);

        System.out.println(ids);
        Main.main(null);




    }


}


public class Main {

    public static <string> void main(String[] args) {
        System.out.println("CoWin Portal Initialized....");
        System.out.println("--------------------------------");
        System.out.println("1. Add Vaccine");
        System.out.println("2. Register Hospital");
        System.out.println("3. Register Citizen");
        System.out.println("4. Add Slot for Vaccination");
        System.out.println("5. Book Slot for Vaccination");
        System.out.println("6. List all slots for a hospital");
        System.out.println("7. Check Vaccination Status");
        System.out.println("8. Exit");
        Scanner scan= new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter your choice");
        int selection = scan.nextInt();
        System.out.println("your choice:"+selection);
            switch (selection) {


                case 1:
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Vaccine name: ");
                    String v_name= sc3.nextLine();
                    int doses=scan.nextInt();
                    int gap=scan.nextInt();

                    break;



                    case 2:
                    System.out.println("Enter name");
                    Scanner sc = new Scanner(System.in);
                    String name_hospital = sc.nextLine();
                    System.out.println("Enter pincode");
                    int pincode=scan.nextInt();
                    int len_p = String.valueOf(pincode).length();
                    if (len_p != 6) {
                        System.out.println("Incorrect pincode");
                        System.exit(03);
                    }



                        Random rnd = new Random();
                        int r = rnd.nextInt(999999);
                        String n=String.format("%06d", r);



                    Hospital h = new Hospital(name_hospital,pincode,n);
                    h.reg_hospital(name_hospital,pincode);

                    break;



                    case 3:
                    System.out.println("Enter name");
                    Scanner sc1 = new Scanner(System.in);
                    String name = sc1.nextLine();
                    System.out.println("Enter age");
                    int age = scan.nextInt();
                    if (age < 18) {
                        System.out.println("You should be at least 18 years old");
                        System.exit(0);
                    }

                    System.out.println("Enter id");

                    int id = scan.nextInt();
                    int len_id = String.valueOf(id).length();
                    if (len_id != 3) {
                        System.out.println("Incorrect ID");
                        System.exit(0);

                    }
                    String status= "REGISTERED";
                    Citizen obj=new Citizen(name,age,id,status);
                    obj.reg_citizen( name,  age,  id, status);

                    break;


                    case 4:
                        System.out.println("Enter hospital ID");
                        Scanner sc4 = new Scanner(System.in);
                        String h_id=sc4.nextLine();
                        if (h_id.length()!=6){
                            System.out.println("Incorrect ID");
                            System.exit(0);
                        }
                        System.out.println("Enter number of slots to be added");
                        int slot=scan.nextInt();
                        System.out.println("Enter Day number");
                        int day=scan.nextInt();
                        System.out.println("Enter Quantity");
                        int quantity=scan.nextInt();

                        System.out.println("Enter vaccine");
                        System.out.println("0. Covax");
                        System.out.println("1. Covi");
                        //String vname="Name";
                        int selected= scan.nextInt();
                        if (selected==0) {
                            String vname = "Covax";
                            Slot s1= new Slot(day, slot, quantity, vname, h_id);
                            s1.add_slot(day, slot, quantity, vname, h_id);
                            break;
                        }else if(selected==1) {
                            String vname = "Covi";
                            Slot s1= new Slot(day, slot, quantity, vname, h_id);
                            s1.add_slot(day, slot, quantity, vname, h_id);
                            break;
                        }else {

                            System.out.println("Invalid input");
                            //System.exit(0);
                        }


                        break;


                        case 5:
                            System.out.println("Enter Unique Patient ID: ");
                            







                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Invalid Input");


            }

        


    }
}
