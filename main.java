package com.company;
import java.util.*;
import java.util.Random;




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
