public class decision {
    public static void main(String[] args) {
        String address="udaipur,Rajastha,India";
        if (address.endsWith("india")){
            if(address.contains("Meerut"))
            {
                System.out.println("your city is meerut");
            }
            else if (address.contains("Noida")) {
                System.out.println("your city is noida");

            }
        }
        else{
            System.out.println("your city is :"+address.split(",")[0]);
        }
       
    }
}
