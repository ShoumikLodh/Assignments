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
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Enter name");
                    Scanner sc = new Scanner(System.in);
                    String name = sc.nextLine();
                    System.out.println("Enter age");
                    int age = scan.nextInt();
                    if (age < 18) {
                        System.out.println("You should be at least 18 years old");
                        System.exit(0);
                    }

                    System.out.println("Enter id");

                    int id = scan.nextInt();
                    int length = String.valueOf(id).length();
                    if (length != 12) {
                        System.out.println("Incorrect ID");
                        System.exit(03);
                    }
                    Citizen obj=new Citizen(name,age,id);


                    obj.reg_citizen(id);

                    break;
                case 4:
                    break;
                case 5:

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
