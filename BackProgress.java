import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class BackProgress {
    static Scanner sc = new Scanner(System.in);
    public static void searchByFirstLetter() {
        boolean flag = false;
        System.out.println("Enter the first letter :");
        char ch = sc.next().charAt(0);

        for(int i = 0; i < Main.m1.size(); ++i) {
            if (ch == ((Members)Main.m1.get(i)).name.charAt(0)) {
                System.out.println("Here are his/her details ");
                System.out.println(((Members)Main.m1.get(i)).toString());
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("No such members : ");
            System.out.println("-------------------");
            Main.searchMemberNames();
        } else {
            System.out.println("Found successfully : ");
            System.out.println("---------------");
        }

    }


    public static void searchByGender()
    {
        int opt2;
        System.out.println("Enter any option below :");
        System.out.println("1: Male");
        System.out.println("2: female");
        System.out.println("3: Gay");
        System.out.println("4: lesbian");
        opt2 = sc.nextInt();
        switch (opt2) {
            case 1:
            {
                String gender = "Male";
                searchMemberName(gender,Main.m1);
                break;
            }
            case 2:
            {
                String gender = "female";
                searchMemberName(gender,Main.m1);break;
            }
            case 3:
            {
                String gender = "Gay";
                searchMemberName(gender, Main.m1);break;
            }
            case 4:
            {
                String gender = "lesbian";
                searchMemberName(gender , Main.m1);break;
            }
        }

    }
    public  static void searchMemberName(String gender, ArrayList<Members> m)
    {
        for (int i = 0;i<m.size();i++)
        {
            if (Main.m1.get(i).gender.equals(gender))
            {
                System.out.println(Main.m1.get(i).toString());
            }
        }
        System.out.println("\n" + "Type which type  to search");
        Scanner sc = new Scanner(System.in);
        System.out.println("1: press 1 to main screen");
        System.out.println("2: press 2 to searh at the same screen");
        int opt3 = sc.nextInt();
        switch(opt3)
        {
            case 1:
            {
                Main.searchMemberNames();
                break;
            }
            case 2:
            {
                searchByGender();
                break;
            }
            default:
            {
                System.out.println("sorry wrong option quiting to main screen ");
                Main.searchMemberNames();
            }
        }


    }
}
