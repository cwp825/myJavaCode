package registerSystem;

public class User {
    private String userName;
    private String password;
    private String personalId;
    private String phoneNumber;

    public User() {
    }

    public User(String userName, String password, String personalId, String phoneNumber) {
        this.userName = userName;
        this.password = password;
        this.personalId = personalId;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
