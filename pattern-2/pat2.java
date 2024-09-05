import java.util.*;
import java.lang.*;

public class pat2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pattern size :");
        int n = sc.nextInt();
        System.out.print("\n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

}
