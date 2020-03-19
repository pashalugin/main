class Customer {

    {
        idGenertor++;
    }

    private static int idGenertor = 0;
    private int id = idGenertor;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int CardNumber;
    private int BankNumber;

    Customer(String surname, String name, String patronymic, String address, int CardNumber, int BankNumber) {

        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.CardNumber = CardNumber;
        this.BankNumber = BankNumber;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public int getCardNumber() {
        return CardNumber;
    }

    public int getBankNumber() {
        return BankNumber;
    }

    public String toString() {
        return String.format("ID: %d\t name: %s\t surname: %s\t patronymic %s \t CardNumber %d\t BankNumber %d",
                id, surname, name, patronymic, CardNumber, BankNumber);
    }

}
