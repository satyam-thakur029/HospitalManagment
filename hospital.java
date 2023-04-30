package hospitalManagement;
import java.util.Calendar;
import java.util.Scanner;





class userPassword
{
    private String a ="satyam";
    private String b ="arpit";
    private String c ="arun";
  
    private int  e =12345;
    private int  f =1234;
    private int  g =123;
 
    String docter0;
    int doctor1;
    String patient;
    int  patient1;
    String facilitie;
    int facilitie1;
  
    Scanner scan = new Scanner(System.in);
    public void password()
    {
        int choice;
        System.out.println("PLEASE SELECT ANY ONE I'D ");
        System.out.println("----------------------------------------------------------------------------------------");
        
        System.out.println("1 :- DOCTOR");
        System.out.println("2 :- PATIENT");
        System.out.println("3 :- FACILITIE");
        System.out.println("-----------------------------------------------------------------------------------------");
        choice =scan.nextInt();
          switch(choice){
            case 1 : 
              {     
                    System.out.println("PLEASE DOCTOR ENTER A I'D NAME");
                    docter0 =scan.next();
                     System.out.println("PLEASE DOCTOR ENTER A PASSWORD");
                    doctor1=scan.nextInt(); 
                     if(a.equalsIgnoreCase(docter0) && (e==doctor1) )
                    {     
                        System.out.println("**************************************WELCOME DOCTOR**************************************");  
                    }
                    else
                    {
                       System.out.println("PLEASE ENTER RIGHT NAME AND PASSWORD");
                    } 
                    
                   break;
                }
                 
            case 2 :
            {
                      System.out.println("PLEASE PATIENT ENTER A I'D NAME");
                      patient =scan.next();
                      System.out.println("PLEASE PATIENT ENTER A PASSWORD");
                      patient1=scan.nextInt();   
                      if(b.equalsIgnoreCase(patient) && (f==patient1))
                      {
                        System.out.println("***************************************WELCOME PATIENT**************************************"); 
                    }
                    else
                   {
                   System.out.println("PLEASE PATIENT ENTER RIGHT NAME AND PASSWORD");
                   }
                   break;
            }
            
            case 3 :
            {
                     System.out.println("PLEASE FACILITIE ENTER A I'D NAME");
                     facilitie =scan.next();
                     System.out.println("PLEASE FACILITIE ENTER A PASSWORD");
                     facilitie1=scan.nextInt();  
                     if(c.equalsIgnoreCase(facilitie) && (facilitie1==g))
                     {
                 System.out.println("*********************************************WELCOME FACILITIE************************************"); 
                }
                     
                    else
                   {
                   System.out.println("PLEASE FACILITIE ENTER RIGHT NAME AND PASSWORD");
                    }
                   break;
            }

                  default : System.out.println("PLEASE ENTER THE VALID OPTION");   
              
        }
         

         //scan.close();
    
          }
    
}
class doctor{
    public static Object dc;
    String name;
    String specilist;
    String sex ;
    int id ;
    int age;
    String appoint;
    String room;

    public void doc(){
      
        Scanner scan =new Scanner(System.in);
        System.out.print(" id :- ");
        id=scan.nextInt();
        System.out.print("name:- ");
        name=scan.next();
        System.out.print("age:- ");
        age=scan.nextInt();
        System.out.print("sex:- ");
        sex=scan.next();
        System.out.print("specilist:- ");
        specilist=scan.next();
        System.out.print("appoint:- ");
        appoint=scan.next();
        System.out.print("room:- ");
        room=scan.next();
        // scan.close();

    }
    public void info()
    {
        System.out.println( id + "\t" + name + "\t\t"+" " + age + " \t" + sex +  "\t" + specilist +" \t" + appoint + "\t" + room + "\t");
    }

}
class patient
{
    String name;
    String disease;
    String sex ;
    int id ;
    int age;
    String admit;
    String room;
    void patie()
    {
       
        Scanner scan =new Scanner(System.in);
        System.out.print(" id :- ");
        id=scan.nextInt();
        System.out.print("name:- ");
        name=scan.next();
        System.out.print("age:- ");
        age=scan.nextInt();
        System.out.print("sex:- ");
        sex=scan.next();
        System.out.print("disease:- ");
        disease=scan.next();
        System.out.print("admitstatus:- ");
        admit=scan.next();
        System.out.print("room:- ");
        room=scan.next(); 
    //    scan.close();

    }
    public void infor() {
        System.out.print(id+" \t   "+ name+"  \t  "+age+ "  \t  " + sex + "  \t  "+disease+ " \t\t"+ admit + " \t"+ room+" \t");
        System.out.print("\n");
    }

    
}
class medical 
{  String name;
    String comp;
    String exp ;
    int cost ;
    int unit;
    public void med() 
    { 
        Scanner scan =new Scanner(System.in);
        System.out.print("name:-  ");
        name=scan.next();
        System.out.print("comp:- ");
        comp=scan.next();
        System.out.print("exp_date:- ");
        exp=scan.next();
        System.out.print("cost:- ");
        cost=scan.nextInt();
        System.out.print("no_of_unit:- ");
        unit=scan.nextInt();
        
    //    scan.close();

    }
    public void inform()
    { 
        System.out.print(name + "\t " + comp + "\t " + exp + "   \t " +unit + "  \t "+ cost+"\t ");
        System.out.print("\n");
    }
    
}
class laboratory
{
    String fecility;
    int cost;
    public void lab() 
    {
      Scanner scan = new Scanner(System.in); 
      System.out.println("fecility :- ");
       fecility = scan.next();
       System.out.println("cost :- ");
       cost= scan.nextInt();
    //    scan.close();
    }
    public void co(){
      System.out.println(fecility + "\t\t" + cost );

    }
   
}
class fecility{
    String fec_name;
    public void value_fec()
    {
        Scanner scan = new Scanner(System.in); 
        System.out.println("fecility Name :- ");
         fec_name= scan.next();
        // scan.close();
    }
    public void feci_name()
    {
     System.out.println(fec_name);
    }
}


public class hospital
 {
    public static void main(String[] args)
     {
       
        Calendar calendar = Calendar.getInstance();
        
        System.out.println("=========================================================================================");
        System.out.println("                        ****   WELCOME TO HOSPITAL ****                        ");
        System.out.println("==========================================================================================");
        System.out.println("------------------------------------------------------------------------------");
        String[] months={
            "JAN",
            "FEB",
            "MAR",
            "APR",
            "MAY",
            "JUN",
            "JUL",
            "AUG",
            "SEP",
            "OCT",
            "NOV",
            "DEC"
            
            
            
        };
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + calendar.get(Calendar.DATE)+ " "+ 
        calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR)+":" + 
        calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));
        userPassword up =new userPassword();
        System.out.println("\n");
        up.password();
        doctor[]d = new doctor[25];
        patient[]p = new patient[100];
        medical[]m =new medical[100];
        fecility[]f = new fecility[100];
        laboratory[]la = new laboratory[50];
        int i;
        for(i=0;i<25;i++)
        {
            d[i]=new doctor();
            
        }
        for(i=0;i<100;i++)
        {
            p[i]=new patient();
        }
        for(i=0;i<100;i++)
        {
            m[i]=new medical();
        }
        for(i=0;i<60;i++)
        {
            f[i]=new fecility();
        }
        for(i=0;i<50;i++)
        {
            la[i]=new laboratory();
        }
        //  ArrayList<doctor> z =new ArrayList<doctor>();
        // //DOCTORS........................................................................................
        d[0].id=123;
        d[0].name ="DR.HEMANT KUSHWAHA SIR";
        d[0].age = 18;
        d[0].sex="MALE";
        d[0].specilist ="NEUROLOGIST";
        d[0].appoint="1:00-4:00 PM";
        d[0].room="D69";

        d[1].id=124;
        d[1].name ="DR.ARUN MISHRA SIR";
        d[1].age = 20;
        d[1].sex="MALE";
        d[1].specilist ="INTERNISTS";
        d[1].appoint="12:00-3:00 PM";
        d[1].room="D6";

        d[2].id=169;
        d[2].name ="DR.ASHISH DWIVEDI SIR";
        d[2].age = 22;
        d[2].sex="MALE";
        d[2].specilist ="PSYCHOLOGIST";
        d[2].appoint="3:00-6:00 PM";
        d[2].room="D9";

        d[3].id=201;
        d[3].name ="DR.ARPIT JAIN SIR";
        d[3].age = 19;
        d[3].sex="MALE";
        d[3].specilist ="PROCTOLOGIST";
        d[3].appoint="8:00-11:00 PM";
        d[3].room="D50";

        d[4].id=205;
        d[4].name ="DR.SATYAM THAKUR SIR";
        d[4].age = 19;
        d[4].sex="MALE";
        d[4].specilist ="SEXOLOGIST";
        d[4].appoint="9:00-11:30 PM";
        d[4].room="D23";

        d[5].id=150;
        d[5].name ="DR.SAVITRI IYER MA'AM";
        d[5].age = 20;
        d[5].sex="FEMALE";
        d[5].specilist ="CARDIOLOGISTS";
        d[5].appoint="2:00-5:00 PM";
        d[5].room="D5";
      
 
        //PATIENT.....................................................................................

        
        p[0].id=334;
        p[0].name="AANCHAL ";
        p[0].age=21;
        p[0].sex="FEMALE";
        p[0].disease="MENTALDISEASE";
        p[0].admit="12-12-2023";
        p[0].room="p69";

        p[1].id=394;
        p[1].name="UNNATI ";
        p[1].age=22;
        p[1].sex="FEMALE";
        p[1].disease="CONGENITAL";
        p[1].admit="16-02-2023";
        p[1].room="p99";

        p[2].id=301;
        p[2].name="ARUN ";
        p[2].age=21;
        p[2].sex="MALE";
        p[2].disease="PILES";
        p[2].admit="23-07-2005";
        p[2].room="p10";

        p[3].id=311;
        p[3].name="ARYAN";
        p[3].age=19;
        p[3].sex="MALE";
        p[3].disease="CANSER";
        p[3].admit="30-10-2021";
        p[3].room="p49";
        
        p[4].id=325;
        p[4].name="ROHIT";
        p[4].age=20;
        p[4].sex="MALE";
        p[4].disease="BRAINCANSER";
        p[4].admit="11-12-2020";
        p[4].room="p23";
        
        p[5].id=379;
        p[5].name="RAJ";
        p[5].age=18;
        p[5].sex="MALE";
        p[5].disease="MENTALDISEASE";
        p[5].admit="27-02-2023";
        p[5].room="p11";
        
       
        
        //MEDICAL............................................................................................
        
        m[0].name="COREX";
        m[0].comp="CINO PVT";
        m[0].exp="9-5-26";
        m[0].cost=55;
        m[0].unit=8;

        m[1].name="NYTRA";
        m[1].comp="ACE PVT";
        m[1].exp="4-4-26";
        m[1].cost=550;
        m[1].unit=5;

        m[2].name="BRUFA";
        m[2].comp="RECKITT";
        m[2].exp="12-7-24";
        m[2].cost=40;
        m[2].unit=56;

        m[3].name="PRIDE";
        m[3].comp="DDF PVT";
        m[3].exp="13-4-25";
        m[3].cost=1100;
        m[3].unit=100;

        m[4].name="PARACETAMOL";
        m[4].comp="ACUVIN";
        m[4].exp="23-9-26";
        m[4].cost=20;
        m[4].unit=200;

        //FECILITY.........................................................................................
        
        f[0].fec_name="ABULANCE";
       f[1].fec_name="ADMIT FACILITY";
        f[2].fec_name="CANTEEN";
       f[3].fec_name="EMERGENCY";
      f[4].fec_name="WORKERS";
       
        
        //LABORATORY.......................................................................................
        
        la[0].fecility="X-RAY";
        la[0].cost=800;
        la[1].fecility="CT SCAN";
        la[1].cost=1200;
        la[2].fecility="OR SCAN";
        la[2].cost=500;
        la[3].fecility="BLOOD BANK";
        la[3].cost=50;
  
       
        System.out.println("--------------------------------------------------------------------------------------------");
System.out.println("\n                                     MAIN MENU");
System.out.println("--------------------------------------------------------------------------------------------");
System.out.println("1:- DOCTOR\n2:- PATIENTS\n3:- MEDICINES\n4:- LABORATORIES\n5:- FACILITIES\n");
Scanner scanner = new Scanner(System.in);
int choice;
int count1=10,count2=10,count3=10,count4=10,count5=10;

int s1=1,s2=1,s3=1,s4=1,s5=1,c1;
choice=scanner.nextInt();
switch (choice)
 {
    
    case 1:
    {
System.out.println("---------------------------------------------------------------------------------------------");
System.out.println("                                      ***DOCTOR SECTION***");
System.out.println("------------------------------------------------------------------------------------------------");
    {  
        while(s1==1)
        {  System.out.println("1:- ADD NEW ENTRY\n2:- EXITSTING DOCTORS LIST");
            c1=scanner.nextInt();
          switch (c1) {
            case 1:
            {
              d[count1].doc();
              count1++;   
            break;
            }
            case 2:
            {
                System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("ID \t NAME\t\t\t\t AGE \t SEX \t SPECILIST \t APPOINT \tROOM");
                System.out.println("-----------------------------------------------------------------------------------------------");
                for( i=0;i<count1;i++)
                {
                  d[i].info();

                }
                break;
            }
    
          }
          System.out.println("\nRETRUN TO BACK PRESS 1 AND FOR MAIN MENU PRESS 0");
          s1= scanner.nextInt();
         
      }
    }
        
        break;
}
case 2:
{
System.out.println("---------------------------------------------------------------------------------------------");
System.out.println("                                      ***PATIENT SECTION***");
System.out.println("------------------------------------------------------------------------------------------------");
    {  
        while(s2==1)
        {  System.out.println("1:- ADD NEW ENTRY\n2:- EXITSTING PATIENT LIST");
            c1=scanner.nextInt();
          switch (c1) {
            case 1:
            {
              p[count2].patie();
              count2++;   
            break;
            }
            case 2:
            { 
                System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("ID \t   NAME \t   AGE \t  SEX\t             DISEASE   \t        ADMIT \t    ROOM   ");
                System.out.println("----------------------------------------------------------------------------------------");
                
                for( i=0;i<count1;i++)
                {
                  p[i].infor();

                }
                break;
            }
    
          }
          System.out.println("\nRETRUN TO BACK PRESS 1 AND FOR MAIN MENU PRESS 0");
          s2= scanner.nextInt();
         
      }
    }
        
        break;
    }
    case 3:
{
System.out.println("---------------------------------------------------------------------------------------------");
System.out.println("                                      ***MEDICAL SECTION***");
System.out.println("------------------------------------------------------------------------------------------------");
    {  
        while(s3==1)
        {  System.out.println("1:- ADD NEW ENTRY\n2:- EXITSTING PATIENT LIST");
            c1=scanner.nextInt();
          switch (c1) {
            case 1:
            {
              m[count3].med();
              count3++;   
            break;
            }
            case 2:
            { 
                System.out.println("------------------------------------------------------------------------");
        System.out.println("NAME\tCOMPOUND \t EXPIRE DATE \t UNITS \t COST\t");
                System.out.println("-------------------------------------------------------------------------");
                
                for( i=0;i<count3;i++)
                {
                  m[i].inform();

                }
                break;
            }
    
          }
          System.out.println("\nRETRUN TO BACK PRESS 1 AND FOR MAIN MENU PRESS 0");
          s3= scanner.nextInt();
         
      }
    }
        
        break;
    }
    case 5:
{
System.out.println("---------------------------------------------------------------------------------------------");
System.out.println("                                      ***FACILITIE SECTION***");
System.out.println("------------------------------------------------------------------------------------------------");
    {  
        while(s4==1)
        {  System.out.println("1:- ADD NEW ENTRY\n2:- EXITSTING FACILITIE LIST");
            c1=scanner.nextInt();
          switch (c1) {
            case 1:
            {
              f[count4].value_fec();
              count5++;   
            break;
            }
            case 2:
            { 
                System.out.println("------------------------------------------------------------------------");
        System.out.println("FECILITY NAME  ");
                System.out.println("-------------------------------------------------------------------------");
                
                for( i=0;i<count5;i++)
                {
                  f[i].feci_name();

                }
                break;
            }
    
          }
          System.out.println("\nRETRUN TO BACK PRESS 1 AND FOR MAIN MENU PRESS 0");
          s4= scanner.nextInt();
         
      }
    }
        
        break;
    }
    case 4:
{
System.out.println("---------------------------------------------------------------------------------------------");
System.out.println("                                      ***LABORATORY SECTION***");
System.out.println("------------------------------------------------------------------------------------------------");
    {  
        while(s5==1)
        {  System.out.println("1:- ADD NEW ENTRY\n2:- EXITSTING LABORATORY LIST");
            c1=scanner.nextInt();
          switch (c1) {
            case 1:
            {
              la[count4].lab();
              count2++;   
            break;
            }
            case 2:
            { 
                System.out.println("------------------------------------------------------------------------");
        System.out.println("FECILITIE \t COST");
                System.out.println("-------------------------------------------------------------------------");
                
                for( i=0;i<count4;i++)
                {
                  la[i].co();

                }
                break;
            }
    
          }
          System.out.println("\nRETRUN TO BACK PRESS 1 AND FOR MAIN MENU PRESS 0");
          s5= scanner.nextInt();
         
      }
    }
        
        break;
    }
    
     
        
 }

 scanner.close();


}
}
    
     
      
    