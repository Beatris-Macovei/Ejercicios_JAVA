public class AAA{
    public static void main(String[] args){
        int sum=0;
        for (int i=1; i<=2; i++) {
            for(int j=1; j<=2; j++) {
                sum += i+j;
            }
        }
        System.out.println(sum);
    }
    
}