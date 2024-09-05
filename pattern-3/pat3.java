import java.util.*;

public class pat3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pattern size : ");
        int n = sc.nextInt();
        System.out.print("\n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print(j+1);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }    
}
