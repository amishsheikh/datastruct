//https://github.com/venkivijay/Java-Solutions-TCS-Xplore-Proctored-Assessment/blob/master/Associate_For_Given_Technology/Question.md

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Associate[] laptops=new Associate[5];
        for (int i = 0; i < laptops.length; i++) {
            laptops[i]= new Associate(in.nextInt(),in.next(),in.next(),in.nextInt());
        }
//        String searchTechnology = in.next();
//        Associate[] result= associateForGivenTechnology(arr,searchTechnology);
//
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i].getId());
//        }
        String searchBrand = in.next();
        String searchOsType = in.next();
        int resultCount = countOfLaptopByBrand(laptops,searchBrand);
        Associate result = searchByOsType(laptops,searchOsType);
        if (resultCount==0){
            System.out.println("The given brand is not present  ");
        }
        else
            System.out.println(resultCount);
        if (result==null){
            System.out.println("the given os is not present");
        }else {
            System.out.println(result.getId()+"\n"+result.getExperienceInYear());
        }
    }

    public static Associate[] associateForGivenTechnology(Associate[] arr,String searchTechnology){
        Associate[] refined = new Associate[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getTechnology().equals(searchTechnology) && arr[i].getExperienceInYear()%5==0){
                refined= Arrays.copyOf(refined,refined.length+1);
                refined[refined.length-1] = arr[i];
            }
        }
        return refined;
    }
    public static  int countOfLaptopByBrand(Associate[] laptops,String searchBrand){
        int count =0;
        for (int i = 0; i < laptops.length; i++) {
            if (laptops[i].getName().equals(searchBrand) && laptops[i].getExperienceInYear()>3){
                count++;
            }
        }
        return count ;
    }

    public static Associate searchByOsType(Associate[] laptops,String searchOsType){

        for (int i = 0; i < laptops.length; i++) {
            if (laptops[i].getTechnology().equals(searchOsType)){
                return laptops[i];
            }
        }
        return null;
    }
}
class Associate{
    int id;
    String name;
    String technology;
    int experienceInYear;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getTechnology(){
        return technology;
    }

    public void setTechnology(String technology){
        this.technology=technology;
    }
    public int getExperienceInYear(){
        return experienceInYear;
    }
    public void setExperienceInYear(int experienceInYear){
        this.experienceInYear=experienceInYear;
    }

    public Associate(int id,String name,String technology,int experienceInYear){
        this.id=id;
        this.name=name;
        this.technology=technology;
        this.experienceInYear=experienceInYear;
    }
}