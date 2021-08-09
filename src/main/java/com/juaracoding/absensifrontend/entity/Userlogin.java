package com.juaracoding.absensifrontend.entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Userlogin implements Parcelable {
    @SerializedName("id")
    private long id;
    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;

    public Userlogin(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeString(this.username);
        dest.writeString(this.password);
    }

    public void readFromParcel(Parcel source) {
        this.id = source.readLong();
        this.username = source.readString();
        this.password = source.readString();
    }

    public Userlogin() {
    }

    protected Userlogin(Parcel in) {
        this.id = in.readLong();
        this.username = in.readString();
        this.password = in.readString();
    }

    public static final Parcelable.Creator<Userlogin> CREATOR = new Parcelable.Creator<Userlogin>() {
        @Override
        public Userlogin createFromParcel(Parcel source) {
            return new Userlogin(source);
        }

        @Override
        public Userlogin[] newArray(int size) {
            return new Userlogin[size];
        }
    };
}
