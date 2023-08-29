public class patterns {
    public static void hollow_pattern(int totalrows, int totalcol){
        for(int i = 1; i <= totalrows; i++){
            for(int j = 1; j <= totalcol; j++){
                if(i == 1 || i == totalrows || j == 1 || j == totalcol){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid_withnumbers(int n){
        for(int i = 1; i < n; i++){
            for(int j = 1; j < n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void floydtriangle(int n){
        int counter = 1;
        for(int i = 1; i < n; i++){
            for(int j = 1; j <= i; j++ ){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zeroonetriangle(int n){
        for(int i = 1; i < n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j) % 2== 0){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterflypattern(int n){
        for(int i = 1; i < n; i++){
            //star print
            for(int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            //space
            for(int j = 1; j <= 2 *(n - i); j++){
                System.out.print(" ");
            }
            //star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //next line
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            //star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //space
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void solidrhombus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowrhombus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diomondpattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1 ; i--){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void numberpyramid(int n){
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //inverted_half_pyramid(5);
      //hollow_pattern(5, 10);
        //inverted_half_pyramid_withnumbers(5);
       // floydtriangle(5);
       // zeroonetriangle(5);
        //butterflypattern(5);
        //solidrhombus(5);
       // hollowrhombus(5);
       // diomondpattern(7);
        numberpyramid(7);
    }
}
