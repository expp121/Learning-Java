class Population{

  public static void main(String Args[])
  {
      float populationMexico = 114;
      float populationUS = 12314;

      float annyallyUS = 0.14f;
      float anuallyMexico = 1.01f;

      byte yearsPassed = 0;

      do{
        
        populationMexico += populationMexico * anuallyMexico;
        populationUS -= populationUS * annyallyUS;
        yearsPassed++;
        System.out.println("Year " + (yearsPassed) + "\nMexico Populatiion: " + populationMexico + "\nUS: " + populationUS + "\n");
 
      }while(populationMexico < populationUS);

      System.out.println("It took " + yearsPassed + " Mexico to outgrow US");

  }
}