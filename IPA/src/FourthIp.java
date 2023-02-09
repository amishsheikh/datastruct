import java.util.Arrays;
import java.util.Scanner;

public class FourthIp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Laptop[] laptops = new Laptop[5];
        for (int i = 0; i <5; i++) {
            int id=in.nextInt();
            String brand = in.next();
            String osType = in.next();
            int rating  = in.nextInt();
            laptops[i] = new Laptop(id,brand,osType,rating);
        }

        String searchBrand = in.next();
        String searchOsType = in.next();
        int resultCount = countOfLaptopByBrand(laptops,searchBrand);
        Laptop result = searchByOsType(laptops,searchOsType);
        if (resultCount==0){
            System.out.println("The given brand is not present  ");
        }
        else
            System.out.println(resultCount);
        if (result==null){
            System.out.println("the given os is not present");
        }else {
                System.out.println(result.getId()+"\n"+result.getRating());
        }

    }

    public static  int countOfLaptopByBrand(Laptop[] laptops,String searchBrand){
        int count =0;
        for (int i = 0; i < laptops.length; i++) {
            if (laptops[i].getBrand().equals(searchBrand) && laptops[i].getId()>3){
                count++;
            }
        }
        return count ;
    }

    public static Laptop searchByOsType(Laptop[] laptops,String searchOsType){

        for (int i = 0; i < laptops.length; i++) {
            if (laptops[i].getOsType().equals(searchOsType)){
              return laptops[i];
            }
        }
        return null;
    }

}

class Laptop{
   private    int id;

   private String brand ;
    private String osType;
    private int price ;
    private int rating ;
    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getBrand() {
        return brand;
    }

    public String getOsType() {
        return osType;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public int getId(){
        return id;
    }

    public Laptop(int id,String brand ,String osType, int rating ){
        this.id = id;
        this.brand =brand;
        this.osType=osType;
        this.rating=rating;

    }

}