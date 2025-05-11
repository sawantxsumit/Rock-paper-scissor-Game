public class array {
    public static void main(String[] args) {
        // String[] cars = {"mustang" , "audi", "thar" , "creta"};
        // cars[3] = "mustang";

        // System.out.println(cars[3]);

        String[] cars= new String[3];

        cars[0] = "camero";
        cars[1]= "tesla";
        cars[2]="audi";

        for(int i=0;i<cars.length; i++)
        {
            System.out.println(cars[i]);
        }
    }
}
