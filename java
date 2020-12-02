public class FractionTest {

    public static void main(String[] args) {
   //write test cases here:
        Fraction f = new Fraction(2,2);
        f.divison();
    }

}

 class Fraction{
    static int num;
    static int den;

    public Fraction(){
        num = 1;
        den = 2;
    }
    public Fraction(int numer,int denum){
        num = numer;
        den = denum;
    }
    public static void addition() {
            System.out.println(num+den + "/1");
    }
     public static void subtraction(){
             System.out.println(num-den + "/1");
     }
     public static void divison(){
        if(num%den == 0) {
            System.out.println(num/den + "/1");
        }else{
            System.out.println(num + "/" + den);
        }
     }
     public static void multiplication(){

             System.out.println(num*den + "/1");

     }

}
