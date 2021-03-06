class TimeFusedLoop{

  public static void main(String[] args){
    long startTime1, startTime2, endTime1, endTime2;
    final long REPEAT = 100000L;
    startTime1 = System.currentTimeMillis();
    for (long x = REPEAT; x >= 0; --x) {
        method1(REPEAT);
    }

    for (long x = REPEAT; x >= 0; --x) {
        method2(REPEAT);
    }
    
    endTime1 = System.currentTimeMillis();
    System.out.println("Time for two separate loops: " + (endTime1 - startTime1) + " milliseconds.");

    startTime2 = System.currentTimeMillis();
    for (long x = REPEAT; x >= 0; --x) {
        method1(REPEAT);
        method2(REPEAT);
    }
    endTime2 = System.currentTimeMillis();
    System.out.println("Time for fused loops: " + (endTime2 - startTime2) + " milliseconds.");
  }
  
  public static void method1(final long REPEAT) {
      for (long x = REPEAT; x >= 0; --x);
  }

  public static void method2(final long REPEAT) {
    for (long x = REPEAT; x >= 0; --x);
}
}