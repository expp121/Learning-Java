class DivideEvenly2{

    public static void main(String[] args){

        int number;    
        final int LIMIT = 120000;
        int var;
        long currentTime = System.currentTimeMillis() ,timePassed;

        for (number = 1; number <= LIMIT; ++number) {
            System.out.println(number + " is evenly divisible by ");
            for (var = 1; var <= number; ++var) {
                if (number % var == 0) {
                    System.out.print(var + " ");
                }
            }
            System.out.println("\n\n");
        }
        timePassed = System.currentTimeMillis();
        System.out.println("\n\nIt took you to run the program: " + ((timePassed - currentTime)/1000) + " seconds.");
  
    }
  }