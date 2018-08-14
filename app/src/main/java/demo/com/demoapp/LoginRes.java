package demo.com.demoapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginRes {

@SerializedName("status")
@Expose
private String status;
@SerializedName("data")
@Expose
private Data data;

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public LoginRes withStatus(String status) {
this.status = status;
return this;
}

public Data getData() {
return data;
}

public void setData(Data data) {
this.data = data;
}

public LoginRes withData(Data data) {
this.data = data;
return this;
}

}