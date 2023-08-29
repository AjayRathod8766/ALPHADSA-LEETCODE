public class strings {
    public static void main(String[] args) {
        String s1 = "TAT";
        String s2 = "TAT";
        String s3 = new String("TAT");
        String s4 = new String("TAT");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        asssiii();
    }
    public static void asssiii(){
        byte Ascii[] = {71, 70, 71};
        String firststr = new String(Ascii);
        System.out.println(firststr);

        String secondstr = new String(Ascii,1,2);
        System.out.println(secondstr);
    }
}
