package models.falabella_models;

public class UserData {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String idType;
    private final String idNumber;
    private final String confirmId;
    private final String phoneNumber;
    private final String password;

    public UserData(String firstName, String lastName, String email, String idType,
                    String idNumber, String confirmId, String phoneNumber, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.idType = idType;
        this.idNumber = idNumber;
        this.confirmId = confirmId;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    // getters...
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getIdType() { return idType; }
    public String getIdNumber() { return idNumber; }
    public String getConfirmId() { return confirmId; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getPassword() { return password; }
}