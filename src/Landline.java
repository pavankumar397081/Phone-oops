public class Landline implements Phone{
    String myPhoneNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public Landline(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
        this.isRinging =false;
        this.isPowerOn=true;
    }


    public String getMyPhoneNumber() {
        return myPhoneNumber;
    }

    public void setMyPhoneNumber(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }




    @Override
    public void powerOn() {
        this.isPowerOn=true;

    }

    @Override
    public void callNumber(String PhoneNumber) {
        if(isPowerOn==true)
            System.out.println("Your are dialing the number "+PhoneNumber);
        else
            System.out.println("Your landline is off");
    }

    @Override
    public void receiveCall(String PhoneNumber) {
        if(isPowerOn && myPhoneNumber.equals(PhoneNumber)) {

                this.isRinging = true;
                System.out.println("hey, " + myPhoneNumber + " You are receiving call");
        }
        else {
            System.out.println("call not received");
        }
        return;
    }

    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("Call answered");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {

      return isRinging;
    }
}
