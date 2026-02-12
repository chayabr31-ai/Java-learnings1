class demo{
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        if(num1>num2)
        {
            System.out.println(num1+"is greater than"+num2);
        }
        else
        {
           System.out.println(num1+"is not greater than"+num2);

        }
    }
}

class demo2 {
    public static void main(String[] args) {
        String name = new String("Hello");
        String name2 = new String("Hello");
        System.out.println(name == name2);
    }
}

 class Main {
    public static void main(String[] args) {
        //declare and initialize an array
        int[] numbers = {5, -2, 0, 10, -7};
        System.out.println("Elements of the array:");
        for (int num : numbers) {
            if (num > 0) {
                System.out.println(num + " is positive");
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }
    }
}

