import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static ArrayList<Members> m1 = new ArrayList<>();
    static BackProgress b1 = new BackProgress();

    public static void main(String[] args) {
        addMemberNames();
        searchMemberNames();
    }

    public static void addMemberNames() {
        m1.add(new Members("Jeyasingh", "Male"));
        m1.add(new Members("Sadhu", "Male"));
        m1.add(new Members("Jebarson", "female"));
        m1.add(new Members("Jeb", "Gay"));
        m1.add(new Members("Jeba", "lesbian"));
        m1.add(new Members("Abishek", "Male"));
        m1.add(new Members("Hilton", "Male"));
    }

    public static void searchMemberNames() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Search by first letter :");
        System.out.println("2: Search by gender :");
        System.out.println("3: search by skill:");
        System.out.println("4: Add new .Members: ");
        System.out.println("Please select any option from 1 to 4 :");
        int selected = 0;
        try {
            selected = sc.nextInt();
        } catch (Exception e) {
            System.out.println("You have entered :" + e);
            System.out.println("Please try again please select from 1 to 4");
            System.out.println("------------------");
            searchMemberNames();//recursive method
        } finally {
            System.out.println("You have chosen option " + selected);
        }
        switch (selected) {
            case 1:
            {
                b1.searchByFirstLetter();
                break;
            }
            case 2:
            {
                b1.searchByGender();
                break;
            }

            case 3:
            {

            }
            case 4:
            default: {
                System.out.println("Please select from 1 to 4 : Wrong option");
                searchMemberNames();//recursion
                break;
            }
        }
    }

    public  static void addMembersName(String gender, String name)
    {
        m1.add(new Members(name,gender));
        searchMemberNames();


    }
}