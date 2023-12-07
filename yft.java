public class yft
{
    public static void main(String [] args)
    {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        ug adding = (a, b) -> {
            int sum = 0;
            for(int i = a; i <= b; i++)
            {
                sum += i;
            }
            return sum;
        };

        int num = adding.add(start,end);
        System.out.println(num);
    }
}