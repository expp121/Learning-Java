class EverySum{
  
  public static void main(String[] args){
      for (int i = 1,numb = 1; i <= 100; numb++, i+=numb) {
          System.out.print(i + " = ");
          for (int j = numb; j > 0; j--) {
              System.out.print(j + " + ");
          }
          System.out.println("0"); 
      }
  }

}
