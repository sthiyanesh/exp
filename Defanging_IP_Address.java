public class Defanging_IP_Address {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
