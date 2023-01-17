public interface Phone {
    void powerOn();
    void callNumber(String PhoneNumber);
    void receiveCall(String PhoneNumber);
    boolean answerCall();
    boolean isRinging();
}
