public class Person {
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;

    Person(String name1, String surname1, String address1, String phoneNumber1) {
        name = setName(name1);
        surname = setSurname(surname1);
        address = address1;
        phoneNumber = setPhoneNumber(phoneNumber1);
    }

    private String setName(String name) {
        if (name.length() <= 2) {
            System.exit(1);
        } else {
            this.name = name;
        }
        return name;
    }

    private String setSurname(String surname) {
        if (surname.length() <= 2) {
            System.exit(1);
        } else {
            this.surname = surname;
        }
        return surname;
    }
     String setPhoneNumber(String phoneNumber){
       char first = phoneNumber.charAt(0);
       if (first != '0'){
           System.exit(1);
      }else{
           this.phoneNumber = phoneNumber;
       }
       return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
