class SlidingWindow{
    public static void main(String[] args)
    {
        int[] users = {100,80,40,70,120,90,60};
        int days = 3;

        int total=0;
        for(int i=0; i<days; i++)
        {
            total = total + users[i];
        }

        System.out.println("Total number of users visited in last 3 days");
        System.out.println(total);

        for(int i=1; i<=users.length-days; i++)
        {
            total = total - users[i-1] + users[i+days-1];
            System.out.println(total);
        }
    }
}