class DivideEvenly{

  public static void main(String[] args){
    final int LIMIT = 11111111;
    int var;
    System.out.println(LIMIT + " is evenly divisible by ");
    for ( var = 1; var <= LIMIT; ++var) {
        if (LIMIT % var == 0) {
            System.out.print(var + " ");
        }
    }

  }
}