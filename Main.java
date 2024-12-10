
        public class Main {

            public static void main(String[] args) {
sum(12,24);
sum(1,2,3);

    }
    public static void sum(int a, int b){
                int rez=a+b;
        System.out.println("Skaitu summa ir" + rez);
    }
    public static void sum(int a, int b, int c) {
        int rez = a + b + c;
        System.out.println("Skaitu summa ir" + rez);
    }
        public static void sum(String a, String b){
            int rez=a+b;
            System.out.println("Skaitu summa ir" + rez);
        }

    public static void batter(){
        System.out.println("Mix the dry ingredients.");
        System.out.println("Cream the butter and sugar.");
        System.out.println("Beat in the eggs.");
        System.out.println("Stir in the dry ingredients.");
    }
    public static void baking(){
        System.out.println("Set the oven temperature.");
        System.out.println("Set the timer.");
        System.out.println("Place a batch of cookies into the oven.");
        System.out.println("Allow the cookies to bake.");
        System.out.println("Set the oven temperature.");
        System.out.println("Set the timer.");
        System.out.println("Place a batch of cookies into the oven.");
        System.out.println("Allow the cookies to bake.");
    }
    public static void decorating(){
        System.out.println("Mix ingredients for frosting.");
        System.out.println("Spread frosting and sprinkles.");
    }

}