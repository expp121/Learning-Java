public class DemoPhoneCalls {

  public static void main(String args[]) {

    IncomingPhoneCall incomingPhoneCall = new IncomingPhoneCall("+497878912332155");
    incomingPhoneCall.displayInformation();
    OutgoingPhoneCall outgoingPhoneCall = new OutgoingPhoneCall("+497878912332155",30);
    outgoingPhoneCall.displayInformation();

  }
}