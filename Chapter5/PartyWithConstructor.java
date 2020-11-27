class PartyWithConstructor{
  
  private int guests;

  public PartyWithConstructor(){
      System.out.println("Creating a party.");
  }

  public int getGuests() {
    return guests;
  }

  public void setGuests(int guests) {
    this.guests = guests;
  }

  public void displayInvitation() {
    System.out.println("Please come to my party!");
  }

}
