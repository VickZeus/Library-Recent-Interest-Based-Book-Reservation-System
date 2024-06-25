
import Student_Record.*;
import java.util.*;
import SQL.*;

public class Run
{
  static private boolean isConnected=false;
  static private String pass="";
  static private boolean stopper=true;

  static public Run obj=new Run();
  static public Recorder obj1=new Recorder();
  static public Interface1 obj2=new Interface1();
  static public Scanner sc=new Scanner(System.in);
  static public connect cn=new connect();
    
  public void repeatunit() // Handles The choice Making Procedure.
  {
    obj2.interface1();
    obj2.sleep(3);
    obj2.choose();
    String ch=sc.nextLine();
    obj2.sleep(3);
    switch(ch)
    {
      case "1" :
                obj2.choice1();
                System.out.print("\033[3mPlease Enter Your Registration Number --->\033[0m");
                String reg_no=sc.nextLine();
                obj1.rec_manager(reg_no,pass);
                break;
      case "2" :
                break;
      case "x" : 
                obj2.endit();
                obj2.sleep(2);
                obj2.endit2();
                stopper=false;
                break;
      default :
                System.out.println("OOPs Invalid Input !!! Try Again !!!!");
                repeatunit();

    }
  }


  public void manager() // Main Method That Manages The Flow Of Program
  {
      int count=1;
      while(!isConnected)
      {
          obj2.mainface();
          pass=sc.nextLine();
          isConnected=cn.Connect(pass);
          if (count==3)
          {
            System.out.println();
            System.out.println("\033[1mMaximum Attempts Reached !!!! Try Again Later !!!\033[0m");
            break;
          }
          count++;
      }
      if (count<3)
      {
        obj2.redirecting();
        obj2.developermessage();
        while (stopper)
        {
          obj.repeatunit();
        }
      }
  } 


  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      obj.manager();
      sc.close();
  }

}
