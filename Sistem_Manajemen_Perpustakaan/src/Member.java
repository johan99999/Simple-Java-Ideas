public class Member {
    private String id;
    private String name;
    private String address;
    private String phoneNumber;

    public Member(String id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getter dan Setter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id ='" + id + '\'' +
                ", name = '" + name + '\'' +
                ", address = '" + address + '\'' +
                ", phoneNumber= '" + phoneNumber + '\'' +
                '}';
    }
}
