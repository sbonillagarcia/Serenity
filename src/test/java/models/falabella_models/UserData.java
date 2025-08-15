package models.falabella_models;

public class UserData {
    private String firstName;
    private String lastName;
    private String email;
    private String idType;
    private String idNumber;
    private String confirmId;
    private String phoneNumber;
    private String password;
    private String confirmPassword;
    private String acceptTOS;

    public UserData() {}

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getIdType() { return idType; }
    public void setIdType(String idType) { this.idType = idType; }

    public String getIdNumber() { return idNumber; }
    public void setIdNumber(String idNumber) { this.idNumber = idNumber; }

    public String getConfirmId() { return confirmId; }
    public void setConfirmId(String confirmId) { this.confirmId = confirmId; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getConfirmPassword() { return confirmPassword; }
    public void setConfirmPassword(String confirmPassword) { this.confirmPassword = confirmPassword; }

    public String getAcceptTOS() { return acceptTOS; }
    public void setAcceptTOS(String acceptTOS) { this.acceptTOS = acceptTOS; }
}
