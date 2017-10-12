package com.ashwin.ashwindparmar.drupalapp;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

/**
 * Created by ashwin.d.parmar on 10/11/2017.
 *
 */

public class UserProfile {

    private JSONObject data;
    private JSONObject userData;
    private JSONObject userPicture;

    private String sessid;
    private String session_name;
    private String token;

    private int uid;
    private String name;
    private String mail;
    private int status;
    private String pictureUrl;
    private String fieldFirstName;
    private String fieldLastName;
    private String fieldDateOfBirth;
    private String fieldMobile;
    private String timezone;
    private String login;
    private String created;
    private String access;
    private String signature;
    private String theme;

    public UserProfile(String data) throws JSONException {
        this.data = new JSONObject(data);
        this.userData = new JSONObject(String.valueOf(this.data.getJSONObject("user")));
        this.userPicture = new JSONObject(String.valueOf(this.userData.getJSONObject("picture")));

        //this.sessid = this.data.getString("sessid");
        //this.session_name = this.data.getString("session_name");
        //this.token = this.data.getString("token");

        this.uid = this.userData.getInt("uid");
        this.name = this.userData.getString("name");
        this.mail = this.userData.getString("mail");
        //this.theme = this.userData.getString("theme");
        //this.signature = this.userData.getString("signature");
        //this.created = this.userData.getString("created");
        //this.access = this.userData.getString("access");
        //this.login = this.userData.getString("login");
        //this.status = this.userData.getInt("status");
        //this.timezone = this.userData.getString("timezone");

        this.pictureUrl = this.userPicture.getString("url");

        //this.fieldFirstName = this.userData.getJSONObject('field_first_name');
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

    public JSONObject getUserData() {
        return userData;
    }

    public void setUserData(JSONObject userData) {
        this.userData = userData;
    }

    public JSONObject getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(JSONObject userPicture) {
        this.userPicture = userPicture;
    }

    public String getSessid() {
        return sessid;
    }

    public void setSessid(String sessid) {
        this.sessid = sessid;
    }

    public String getSession_name() {
        return session_name;
    }

    public void setSession_name(String session_name) {
        this.session_name = session_name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getFieldFirstName() {
        return fieldFirstName;
    }

    public void setFieldFirstName(String fieldFirstName) {
        this.fieldFirstName = fieldFirstName;
    }

    public String getFieldLastName() {
        return fieldLastName;
    }

    public void setFieldLastName(String fieldLastName) {
        this.fieldLastName = fieldLastName;
    }

    public String getFieldDateOfBirth() {
        return fieldDateOfBirth;
    }

    public void setFieldDateOfBirth(String fieldDateOfBirth) {
        this.fieldDateOfBirth = fieldDateOfBirth;
    }

    public String getFieldMobile() {
        return fieldMobile;
    }

    public void setFieldMobile(String fieldMobile) {
        this.fieldMobile = fieldMobile;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
