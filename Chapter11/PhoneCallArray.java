public class PhoneCallArray {

    public static void main(String args[]) {
        PhoneCall[] phoneCalls = new PhoneCall[10];
        for (int i = 0; i < phoneCalls.length - 1; i += 2) {
            phoneCalls[i] = new IncomingPhoneCall("Call " + (i + 1));
            phoneCalls[i + 1] = new OutgoingPhoneCall("Call " + (i + 2), i+1);
        }
        for (int i = 0; i < phoneCalls.length; i++) {
            phoneCalls[i].displayInformation();
            System.out.println("----------------");
        }

    }
}