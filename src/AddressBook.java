import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public String[] getNames(){
        String[] names = new String[buddies.size()];
        for (int i=0; i<buddies.size(); i++){
            names[i] = buddies.get(i).getName();
        }
        return names;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("John", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);

    }
}
// Test commit