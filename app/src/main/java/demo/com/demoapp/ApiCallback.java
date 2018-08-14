package demo.com.demoapp;

public interface ApiCallback {
    public void success(String responseData);
    public void failure(String errorMSg);
}