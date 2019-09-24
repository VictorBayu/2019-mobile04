package id.ac.polinema.intent.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class USER implements Parcelable {
    private String username, name;
    private int age;

    public USER(String username, String name, int age) {
        this.username = username;
        this.name = name;
        this.age = age;
    }

    public USER() {
    }

    protected USER(Parcel in) {
        username = in.readString();
        name = in.readString();
        age = in.readInt();
    }

    public static final Creator<USER> CREATOR = new Creator<USER>() {
        @Override
        public USER createFromParcel(Parcel in) {
            return new USER(in);
        }

        @Override
        public USER[] newArray(int size) {
            return new USER[size];
        }
    };

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(name);
        dest.writeInt(age);
    }
}
