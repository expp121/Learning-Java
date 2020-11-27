import java.math.RoundingMode;
import java.text.DecimalFormat;

class Inspections{
  
  private static DecimalFormat df = new DecimalFormat("#.##");

  public static void main(String Args[])
  {
      byte factory;
      byte inspections = 0;
      float factory1 = 0, factory2 = 0 , factory3 = 0, factory4 = 0;

      df.setRoundingMode(RoundingMode.UP);

      while(inspections < 52){

        factory = (byte)(1 + (byte)(Math.random() * 4));

        switch (factory) {
          
          case 1: 
            factory1++;
          break;
            
          case 2: 
            factory2++;
          break;

          case 3: 
            factory3++;
          break;

          case 4: 
            factory4++;
          break;
        
          default:
            break;
        }

        inspections++;
      
      }

      factory1 = (factory1 / 52) * 100;
      factory2 = (factory2 / 52) * 100;
      factory3 = (factory3 / 52) * 100;
      factory4 = (factory4 / 52) * 100;

      System.out.println("Factory1: " + df.format(factory1) + 
      "%\nFactory2: " + df.format(factory2) + 
      "%\nFactory3: " + df.format(factory3) +  
      "%\nFactory4: " + df.format(factory4) + "%");

  }
}