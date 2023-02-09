import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {

        Scanner in  =new Scanner(System.in);
        TravelAgencies[] travelAgencies = new TravelAgencies[4];
        for (int i = 0; i < travelAgencies.length; i++) {
            int a= in.nextInt();in.nextLine();
            String b= in.nextLine();
            String c= in.nextLine();
            int d= in.nextInt();
            boolean e = in.nextBoolean();

            travelAgencies[i]= new TravelAgencies(a,b,c,d,e);
        }
        int SeregNo = in.nextInt();in.nextLine();
        String SepackageType = in.next();
        in.close();
        System.out.println(findAgencyWithHighestPackagePrice(travelAgencies));
        TravelAgencies result = agencyDetailsForGivenldAndType(travelAgencies,SeregNo,SepackageType);

        System.out.println(result.getAgencyName()+":"+result.getPrice());

  }
      public static int findAgencyWithHighestPackagePrice(TravelAgencies[] travelAgencies){
        int High=0;
          for (int i = 0; i < travelAgencies.length; i++) {
              if (High<travelAgencies[i].getPrice()){
                  High = travelAgencies[i].getPrice();
              }
          }
          return High;
      }
      public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies[] travelAgencies,int SeregNo,String SepackageType){
          for (int i = 0; i < travelAgencies.length; i++) {
              if (travelAgencies[i].isFlightFacility() && travelAgencies[i].getRegNo()==SeregNo && travelAgencies[i].getPackageType().equals(SepackageType))
                  return travelAgencies[i];
          }
          return null;
      }


}

class TravelAgencies{
    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }
}
