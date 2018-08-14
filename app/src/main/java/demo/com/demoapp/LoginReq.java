package demo.com.demoapp;

public class LoginReq {
    public String email;
    public int password;
    public int deviceType;
    public String address;
    public int isPush;
    public String deviceToken;
    public LoginReq(String email, int pass, int deviceType, String add, int push, String deviceToken) {
            this.email=email;
            this.password=pass;
            this.deviceType=deviceType;
            this.address=add;
            this.deviceToken=deviceToken;
            this.isPush=push;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIsPush() {
        return isPush;
    }

    public void setIsPush(int isPush) {
        this.isPush = isPush;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }


}
