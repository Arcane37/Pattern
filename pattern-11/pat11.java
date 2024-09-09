import java.util.*;

public class pat11 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pattern size : ");
        int n = sc.nextInt();
        System.out.print("\n");

        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
                for(int j=0;j<i+1;j++)
                {
                    if(j%2!=0)
                        System.out.print("1 ");
                    else
                        System.out.print("0 ");    
                }
            else
                for(int j=0;j<i+1;j++)
                {
                    if(j%2!=0)
                        System.out.print("0 ");
                    else
                        System.out.print("1 ");    
                }    
            System.out.print("\n");
        }
        System.out.print("\n");
        sc.close();
    }    
}
