package models.falabella_models;

public class UserData {
    private String firstName;
    private String lastName;
    private String email;
   // private String idType;
    private String idNumber;
    private String confirmId;
    private String phoneNumber;
    private String password;
    private Boolean acceptTOS;
    private Boolean terms;

    public UserData(String firstName, String lastName, String email, //String idType,
                    String idNumber, String confirmId, String phoneNumber, String password,
                    Boolean acceptTOS, Boolean terms) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
       // this.idType = idType;
        this.idNumber = idNumber;
        this.confirmId = confirmId;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.acceptTOS = acceptTOS;
        this.terms = terms;
    }

    // Getters y setters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
   // public String getIdType() { return idType; }
    public String getIdNumber() { return idNumber; }
    public String getConfirmId() { return confirmId; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getPassword() { return password; }
    public Boolean isAcceptTOS() { return acceptTOS; }
    public Boolean isTerms() { return terms; }
}
