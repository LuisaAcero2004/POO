import java.util.*;


public class UberVan extends Car{

    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passengers;


    public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted,ArrayList<String> seatsMaterial ){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }

    @Override
    public void setPassengers(Integer passengers){
        if(passengers == 6){
            this.passengers = passengers;
        }else{
            System.out.println("The value of passengers should be 4");
        }
        
    }
    
}
