import java.util.*;
import java.lang.*;

public class pat6 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pattern size : ");
        int n = sc.nextInt();
        System.out.print("\n");
        for(int i=n;i>-1;i--)
        {
            for(int j=1;j<i+1;j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
