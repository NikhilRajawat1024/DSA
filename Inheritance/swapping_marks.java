public class swapping_marks {

    static String result(int alice,int bob){
        if(alice>bob)
        {
            return "yes";
        }
        else
        {
            alice=rev(alice);
            // System.out.println(alice+" "+bob);
            if(alice>bob)
            {
                return "yes";
            }
            else
            {
                bob=rev(bob);
                if(alice>bob)
                {
                    return "yes";
                }
                else
                {
                    return "no";
                }
            }
        }
    //    return "no";
    }

    static int rev(int a)
    {
        int ans=0;
        while (a>0) {
            int rem=a%10;
            ans=ans*10+rem;
            a/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int no=523;
        // rev(no);
        // System.out.println(rev(no));
        String ans=result(12,34);
        System.out.println(ans);

    }
}
