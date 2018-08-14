package demo.com.demoapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

@SerializedName("user_id")
@Expose
private int userId;
@SerializedName("ur_id")
@Expose
private int urId;
@SerializedName("ut_id")
@Expose
private String utId;
@SerializedName("service_id")
@Expose
private int serviceId;
@SerializedName("first_name")
@Expose
private String firstName;
@SerializedName("last_name")
@Expose
private String lastName;
@SerializedName("address")
@Expose
private String address;
@SerializedName("latitude")
@Expose
private String latitude;
@SerializedName("longitude")
@Expose
private String longitude;
@SerializedName("photo")
@Expose
private String photo;
@SerializedName("email")
@Expose
private String email;
@SerializedName("mobile_no")
@Expose
private String mobileNo;
@SerializedName("password")
@Expose
private String password;
@SerializedName("social_id")
@Expose
private String socialId;
@SerializedName("social_type")
@Expose
private String socialType;
@SerializedName("device_token")
@Expose
private String deviceToken;
@SerializedName("notification_token")
@Expose
private String notificationToken;
@SerializedName("is_active")
@Expose
private int isActive;
@SerializedName("is_notification_switch")
@Expose
private String isNotificationSwitch;
@SerializedName("is_email_switch")
@Expose
private int isEmailSwitch;
@SerializedName("avg_rating")
@Expose
private int avgRating;
@SerializedName("geo_range")
@Expose
private int geoRange;
@SerializedName("password_reset_token")
@Expose
private String passwordResetToken;
@SerializedName("create_date")
@Expose
private String createDate;
@SerializedName("update_date")
@Expose
private String updateDate;
@SerializedName("create_by")
@Expose
private int createBy;

public int getUserId() {
return userId;
}

public void setUserId(int userId) {
this.userId = userId;
}

public Data withUserId(int userId) {
this.userId = userId;
return this;
}

public int getUrId() {
return urId;
}

public void setUrId(int urId) {
this.urId = urId;
}

public Data withUrId(int urId) {
this.urId = urId;
return this;
}

public String getUtId() {
return utId;
}

public void setUtId(String utId) {
this.utId = utId;
}

public Data withUtId(String utId) {
this.utId = utId;
return this;
}

public int getServiceId() {
return serviceId;
}

public void setServiceId(int serviceId) {
this.serviceId = serviceId;
}

public Data withServiceId(int serviceId) {
this.serviceId = serviceId;
return this;
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public Data withFirstName(String firstName) {
this.firstName = firstName;
return this;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public Data withLastName(String lastName) {
this.lastName = lastName;
return this;
}

public String getAddress() {
return address;
}

public void setAddress(String address) {
this.address = address;
}

public Data withAddress(String address) {
this.address = address;
return this;
}

public String getLatitude() {
return latitude;
}

public void setLatitude(String latitude) {
this.latitude = latitude;
}

public Data withLatitude(String latitude) {
this.latitude = latitude;
return this;
}

public String getLongitude() {
return longitude;
}

public void setLongitude(String longitude) {
this.longitude = longitude;
}

public Data withLongitude(String longitude) {
this.longitude = longitude;
return this;
}

public String getPhoto() {
return photo;
}

public void setPhoto(String photo) {
this.photo = photo;
}

public Data withPhoto(String photo) {
this.photo = photo;
return this;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public Data withEmail(String email) {
this.email = email;
return this;
}

public String getMobileNo() {
return mobileNo;
}

public void setMobileNo(String mobileNo) {
this.mobileNo = mobileNo;
}

public Data withMobileNo(String mobileNo) {
this.mobileNo = mobileNo;
return this;
}

public String getPassword() {
return password;
}

public void setPassword(String password) {
this.password = password;
}

public Data withPassword(String password) {
this.password = password;
return this;
}

public String getSocialId() {
return socialId;
}

public void setSocialId(String socialId) {
this.socialId = socialId;
}

public Data withSocialId(String socialId) {
this.socialId = socialId;
return this;
}

public String getSocialType() {
return socialType;
}

public void setSocialType(String socialType) {
this.socialType = socialType;
}

public Data withSocialType(String socialType) {
this.socialType = socialType;
return this;
}

public String getDeviceToken() {
return deviceToken;
}

public void setDeviceToken(String deviceToken) {
this.deviceToken = deviceToken;
}

public Data withDeviceToken(String deviceToken) {
this.deviceToken = deviceToken;
return this;
}

public String getNotificationToken() {
return notificationToken;
}

public void setNotificationToken(String notificationToken) {
this.notificationToken = notificationToken;
}

public Data withNotificationToken(String notificationToken) {
this.notificationToken = notificationToken;
return this;
}

public int getIsActive() {
return isActive;
}

public void setIsActive(int isActive) {
this.isActive = isActive;
}

public Data withIsActive(int isActive) {
this.isActive = isActive;
return this;
}

public String getIsNotificationSwitch() {
return isNotificationSwitch;
}

public void setIsNotificationSwitch(String isNotificationSwitch) {
this.isNotificationSwitch = isNotificationSwitch;
}

public Data withIsNotificationSwitch(String isNotificationSwitch) {
this.isNotificationSwitch = isNotificationSwitch;
return this;
}

public int getIsEmailSwitch() {
return isEmailSwitch;
}

public void setIsEmailSwitch(int isEmailSwitch) {
this.isEmailSwitch = isEmailSwitch;
}

public Data withIsEmailSwitch(int isEmailSwitch) {
this.isEmailSwitch = isEmailSwitch;
return this;
}

public int getAvgRating() {
return avgRating;
}

public void setAvgRating(int avgRating) {
this.avgRating = avgRating;
}

public Data withAvgRating(int avgRating) {
this.avgRating = avgRating;
return this;
}

public int getGeoRange() {
return geoRange;
}

public void setGeoRange(int geoRange) {
this.geoRange = geoRange;
}

public Data withGeoRange(int geoRange) {
this.geoRange = geoRange;
return this;
}

public String getPasswordResetToken() {
return passwordResetToken;
}

public void setPasswordResetToken(String passwordResetToken) {
this.passwordResetToken = passwordResetToken;
}

public Data withPasswordResetToken(String passwordResetToken) {
this.passwordResetToken = passwordResetToken;
return this;
}

public String getCreateDate() {
return createDate;
}

public void setCreateDate(String createDate) {
this.createDate = createDate;
}

public Data withCreateDate(String createDate) {
this.createDate = createDate;
return this;
}

public String getUpdateDate() {
return updateDate;
}

public void setUpdateDate(String updateDate) {
this.updateDate = updateDate;
}

public Data withUpdateDate(String updateDate) {
this.updateDate = updateDate;
return this;
}

public int getCreateBy() {
return createBy;
}

public void setCreateBy(int createBy) {
this.createBy = createBy;
}

public Data withCreateBy(int createBy) {
this.createBy = createBy;
return this;
}

}