class CountByFive{

    public static void main(String[] args) {
        
        for(int i = 5; i <= 200 ; i++) {
            if(i % 50 != 0)
                System.out.print(i + " ");
            else System.out.println(i + " \n");
        }
    }
}