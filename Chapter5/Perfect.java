class Perfect{
  
  public static void main(String[] args){
    for (int i = 1,numb = 1, isPerfect = 0; i <= 100000; numb++, i+=numb) {
        for (int j = numb; j > 0; j--) {
            if(i % j == 0) isPerfect ++;
        }
        if (isPerfect == numb) System.out.println(i);
        isPerfect = 0;
    }
  }

}
