package Student_Record;

import java.util.concurrent.TimeUnit;
import java.util.*;

public class Interface1 
{
    static public Scanner sc=new Scanner(System.in); 

    public void SOP(String s) // To Dispay The Message On The Screen
    {
        System.out.println(s);
    }


    public void issue_return()
    {
        interface1();
        System.out.println("                                            \033[1m << BOOK ISSUE/RETURN PORTAL >> \033[0m ");
        gap(3);
        System.out.println("\033[3mChoose One Of The Following---> \033[0m >>> ");
        gap(1);
        System.out.println("                                                                               <1> \033[3m To Issue A Book \033[0m ");
        System.out.println("                                                                               <2> \033[3m To Return A Book  \033[0m ");
        System.out.println("                                                                               <x> \033[3m To Exit \033[0m  ");
        gap(3);
        System.out.print("Choice >>>> ");   
        sleep(3);
    }


    public void choice1()
    {
        interface1();
        System.out.println("                                            \033[1m << BOOK ISSUE/RETURN PORTAL >> \033[0m ");
        gap(3);
        System.out.println("\033[3m                                  ----Please Enter The Following Information---- \033[0m ");
        gap(1);
    }


    public void issuebook()
    {
        interface1();
        System.out.println("                                            \033[1m << BOOK ISSUE PORTAL >> \033[0m ");
        gap(3);
        System.out.println("\033[3m                                 ----PLEASE CHOOSE THE BOOKS---- \033[0m ");
        gap(1);
    }


    public String B(String s) // Returns The Bold String
    {
        String S="\033[1m"+s+"\033[0m";
        return S;
    }


    public String I(String s) // Returns The Italics String
    {
        String S="\033[3m"+s+"\033[0m";
        return S;
    }


    public String U(String s) // Returns The Underlined String
    {
        String S="\033[4m"+s+"\033[0m";
        return S;
    }


    public void sleep(int n) // Puts The Program To Sleep for n-seconds
    {
        try
        {
            TimeUnit.SECONDS.sleep(n);
        }
        catch(Exception e)
        {
            System.out.println("Oops !!! Something Went Wrong ! ");
            System.out.println("Stack Trace : "+e.getStackTrace());
            System.out.println("Exception occured >> "+e.getMessage()+e);
        }
    }


    public void endit()
    {
        SOP(B("***************************************************************************************************************"));
    }


    public void endit2()
    {
        sleep(2);
        gap(32);
        SOP(B("***************************************************************************************************************"));
        sleep(2);
        SOP("                                         "+B("--- THANK YOU ---"));
        sleep(2);
        SOP(B("***************************************************************************************************************"));
        gap(10);
    }


    public void developermessage() // Provides With Developer Message
    {
        interface1();
        SOP("                                        "+B("---<DEVELOPER'S MESSAGE>----"));
        gap(1);
        System.out.print(I("                     \"Welcome to JAVALIB, your gateway to a diverse world of literature.\"\n\n Explore a wide array of books tailored to your interests with personalized recommendations based on your \nreading habits and preferences."));
        System.out.print(I("Beyond recommendations, JAVALIB allows you to efficiently manage your book loans and reservations directly from the interface.\n\n Keep track of your reading list and seamlessly borrow or reserve books with ease."));
        System.out.println(I("Whether you're a seasoned reader or just beginning your literary journey, JAVALIB is here to enrich your reading experience and provide easy access to a wealth of knowledge."));
        gap(1);
        SOP("                                  "+B("Embark On Your Literary Journey With Us"));
        SOP("                                                                                 ----"+I("Abhishek Singh(23BCE7273)"));
        gap(2);
        endit();
        gap(2);
        sleep(6);
    }


    public void choose()
    {
        System.out.println("                                                   \033[1m < OPTIONS >  \033[0m");
        gap(1);
        System.out.println("      \033[4m PLEASE ENTER ONE OF THE FOLLOWING CHOICES TO PROCEED : \033[0m");
        System.out.println("                                                                               <1> \033[3m To Issue/Return A Book \033[0m ");
        System.out.println("                                                                               <2> \033[3m To Run Recommender \033[0m ");
        System.out.println("                                                                               <x> \033[3m To Exit \033[0m  ");
        gap(3);
        System.out.print("Choice >>>> ");   
    }


    public void interface1() // Provides with the main interface 
    {
        gap(32);
        SOP(B("***************************************************************************************************************"));
        System.out.println("                                                 \033[1m<<< JAVALIB >>>\033[0m                                               ");
        System.out.println("\033[3m                                       A MULTIPURPOSE LIBRARY ASSISTANCE TOOL\033[0m     ");
        SOP(B("***************************************************************************************************************"));
        gap(3);
    }


    public void inchoice1() // Interface For Choice-1
    {

        interface1();
        System.out.println("                                            \033[1m << BOOK RECOMMENDATION PORTAL >> \033[0m ");
        gap(3);
        System.out.println("\033[3mPlease Enter The Following Informations \033[0m >>> ");
        gap(1);
        sleep(3);
    }


    public void redirecting() // Provides With a Redirecting Animation.
    {
        System.out.println("Checking Requirements....");
        sleep(1);
        System.out.println("Redirecting....");
        sleep(1);
        System.out.print("Almost There in ");
        sleep(1);
        System.out.print("3...");
        sleep(1);
        System.out.print("2...");
        sleep(1);
        System.out.print("1...");
        sleep(2);
    }


    public void mainface() //Provides With The Initial Interface
    {
        gap(32);
        SOP(B("***************************************************************************************************************"));
        sleep(1);
        System.out.println("                                                 \033[1m<<< JAVALIB >>>\033[0m                                               ");
        sleep(2);
        System.out.println("\033[3m                                       A MULTIPURPOSE LIBRARY ASSISTANCE TOOL\033[0m     ");
        SOP(B("***************************************************************************************************************"));
        sleep(3);
        gap(3);
        SOP("                                ---Please Enter MySQL Database Password To Establish Connection---");
        gap(3);
        System.out.print("Password --->");


    }


    public void gap(int n) // Keeps a gap of n-lines
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(" ");
        }
    }

}
