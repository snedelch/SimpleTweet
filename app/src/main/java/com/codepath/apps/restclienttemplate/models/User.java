package com.codepath.apps.restclienttemplate.models;


import org.json.JSONObject;
import org.json.JSONException;


public class User {

    public String name;
    public String screenName;
    public String profileImageUrl;

    public static User fromJson(String jsonObject) throws JSONException {
        User user = new User();
        user.name = jsonObject.getStrring("name");
        user.screenName = jsonObject.getString("screen_name");
        user.profileImageUrl = jsonObject.getString("profile_image_url_https");
        return user;
    }
}
