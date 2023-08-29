public class sumN{
    public static int naturalnum(int n){
        int sum = 0;
      for(int i = 0; i <= n; i++){
          sum = sum + i;
      }
      return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(naturalnum(n));
    }
}
