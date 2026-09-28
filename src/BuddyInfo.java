public class BuddyInfo {

    private String name;
    private String address;
    private String number;

    public BuddyInfo(String thisName, String thisAddress, String thisNumber) {
        name = thisName;
        address = thisAddress;
        number = thisNumber;
    }

    public BuddyInfo() {
        this("John Doe", "123 Main Street", "613-123-4567");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Bob", "123 Main Street", "613-123-4567");
        System.out.println("Hello " + buddy.getName());
    }
}
