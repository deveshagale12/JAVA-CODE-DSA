public ArrayIteration{
     public static void main(String[] args)
    {

        // 1. Declare and create an array of size 6
        int[] marks = new int[6];

        // 2. Initialize array elements
        marks[0] = 88;
        marks[1] = 74;
        marks[2] = 91;
        marks[3] = 82;
        marks[4] = 68;
        marks[5] = 94;

        // 3. Access and print array elements using normal for loop (Way 1)
        System.out.print("Way 1: ");
        for (int i = 0; i < marks.length; i++)
        {
            System.out.print(marks[i] + " ");
        }
        System.out.println(); // Move to next line

        // 4. Access and print array elements using for-each loop (Way 2)
        System.out.print("Way 2: ");
        for (int no : marks)
        {
            System.out.print(no + " ");
        }
        System.out.println(); // Move to next line
    }
}