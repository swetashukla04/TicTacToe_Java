package player;

public class Player {
    private String name;
    private char playerSymbol;
    private String address;
    private String ContactNumber;
    private String emailId;
    private int age;

    public void setPlayerDetail(String name, char playerSymbol, String address, String ContactNumber, String emailId,
            int age) {
        this.name = name;
        this.playerSymbol = playerSymbol;
        this.address = address;
        this.ContactNumber = ContactNumber;
        this.emailId = emailId;
        this.age = age;
    }

    public void setPlayerNameandSymbol(String name, char symbol) {
        this.name = name;
        this.playerSymbol = symbol;
    }

    public String getPlayerName() {
        return this.name;
    }

    public char getPlayerSymbol() {
        return this.playerSymbol;
    }

    public void changeSymbol( char symbol)
    {
        this.playerSymbol=symbol;
    }
    

    public void getPlayerDetail() {
        System.out.println("Name of the player: " + this.name);
        System.out.println("Symbol chosen by the player: " + this.playerSymbol);
        System.out.println("Email ID of the player: " + this.emailId);
        System.out.println("Age of the player: " + this.age);
        System.out.println("Player contact number: " + this.ContactNumber);
        System.out.println("Address of the player: " + this.address);
    }

}
