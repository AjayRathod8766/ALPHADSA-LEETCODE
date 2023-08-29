public class obNewInstance implements Cloneable{
    //method 1
    @Override
    protected Object clone()
        throws CloneNotSupportedException{
        return super.clone();
    }
    String name = "GeeksForGeek";

    public static void main(String[] args) {
        obNewInstance ob = new obNewInstance();

        try{
            obNewInstance obj2 = (obNewInstance)ob.clone();
            System.out.println(obj2.name);
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
