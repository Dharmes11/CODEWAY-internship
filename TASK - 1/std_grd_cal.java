import java.io.*;
import java.util.*;
public class std_grd_cal 
{
    public static void main(String[] args) 
    {
        int no,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number Of Student : ");
        no=sc.nextInt(); 
        
        grade_calc[] g1 = new grade_calc[no];

        for(i=0;i<no;i++)
        {
            g1[i]=new grade_calc();
            System.out.println("Enter Details For Student "+(i+1)+" : ");
            g1[i].getdata();
            g1[i].calculate();
        }

        System.out.println("\n\n\t\t\t\t Student Information");
        System.out.println("====================================================================================");
        System.out.println("NAME"+"\t\t"+ "MARKS1"+"\t"+"MARKS2"+"\t"+"MARKS3"+"\t"+ "MARKS4"+"\t"+ "MARKS5"+"\t"+"TOTAL"+"\t"+"PERCENTAGE"+"\t"+"GRADE");

        for(j=0;j<no;j++)
        {
            g1[j].display();
        }
        System.out.println("====================================================================================");
        System.out.println("\n");
    }
}
class student
{
    String name;
    String grade;
    float tot,per;
    int[] marks=new int[5];
    int i;

    Scanner sc=new Scanner(System.in);

    void getdata()
    {
        System.out.print("Enter Student Name : ");
        name=sc.nextLine();

        for(i=0;i<5;i++)
        {
            do
            {
                System.out.print("Enter Marks "+(i+1)+" : ");
                marks[i]=sc.nextInt();

                if(marks[i]<0 || marks[i]>100 )
                {
                    System.out.println("!!!!!!==>> Please Enter Marks Between 1 to 100 <<==!!!!!!");
                    marks[i]--;
                }
            }while(marks[i]<0 || marks[i]>100);
            

        }

        tot=0.0f;
        per=0.0f;

        for(i=0;i<5;i++)
        {
            tot=tot+marks[i];
        }

        per=tot/5;
    }
}

class grade_calc extends student
{
    void calculate()
    {
        if(per>90 && per<=100)
        {
            grade="A+";
        }
        else if(per>80 && per<=90)
        {
            grade="A";
        }
        else if(per>70 && per<=80)
        {
            grade="B+";
        }
        else if(per>60 && per<=70)
        {
            grade="B";
        }
        else if(per>50 && per<=60)
        {
            grade="C+";
        }
        else if(per>40 && per<=50)
        {
            grade="C";
        }
        else if(per>30 && per<=40)
        {
            grade="D+";
        }
        else if(per>20 && per<=30)
        {
            grade="D";
        }
        else if(per>0 && per<=20)
        {
            grade="E";
        }
    }

    void display()
    {
        System.out.println(name+"\t\t"+marks[0]+"\t"+marks[1]+"\t"+marks[2]+"\t"+marks[3]+"\t"+marks[4]+"\t"+tot+"\t"+"   "+per+"\t"+"\t"+grade);
    }
}

