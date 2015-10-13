package com.test.chuaundi;

//import java.io.Serializable;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public User(String name,int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void writeToParcel(Parcel dest, int flage) {
		dest.writeString(getName());
		dest.writeInt(getAge());
	}
	
	public static final Creator<User>  CREATOR = new Creator<User>() {
		
		@Override
		public User[] newArray(int size) {
			// TODO Auto-generated method stub
			return new User[size];
		}
		
		@Override
		public User createFromParcel(Parcel source) {
			// TODO Auto-generated method stub
			return new User(source.readString(), source.readInt());
		}
	};
	
}
