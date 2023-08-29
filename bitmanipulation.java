public class bitmanipulation {
    public static void andoperator(){
        System.out.println(5 & 6);
    }
    public static void oroperator(){
        System.out.println(5 | 6);
    }
    public static void xoroperator(){
        System.out.println(5 ^ 6);
    }
    public static void oncecomplement(){
        int a = ~5;
        System.out.println(a);
    }
    public static void bineryleftshift(){
        System.out.println(5 << 2);
    }
    public static void binrightshift(){
        System.out.println(5 >> 2);
    }
    public static void evenoddnum(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("even number ");
        }
        else {
            System.out.println("odd number ");
        }
    }
    public static int getithbit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        } else {
            return 1;
        }
    }
    public static int setithbit(int n, int i){
        int bitmask = 1 << i;
        return n | bitmask;
    }
    public static int clearithbit(int n, int i){
        int bitmask = ~(1 << i);
        return n & bitmask;
    }


    public static void main(String[] args) {
        andoperator();//4
        //oroperator();7
       // xoroperator();3
        //oncecomplement();-6
        //bineryleftshift();20
        //binrightshift();1
       // evenoddnum(5);even
       //System.out.println(getithbit(5,2));//1
        //System.out.println(setithbit(10,2));//14
        //System.out.println(clearithbit(10,1));//8


    }
}
