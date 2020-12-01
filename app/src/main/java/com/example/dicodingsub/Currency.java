package com.example.dicodingsub;

import android.os.Parcel;
import android.os.Parcelable;

public class Currency implements Parcelable{
    private String Uang;
    private String Detail;
    private int Img;
    public Currency() {

    }
    public String getUang() {
        return Uang;
    }

    public void setUang(String uang) {
        this.Uang = uang;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        this.Detail = detail;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        this.Img = img;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Uang);
        parcel.writeString(Detail);
        parcel.writeInt(Img);

    }

    protected Currency(Parcel in) {
        Uang = in.readString();
        Detail = in.readString();
        Img = in.readInt();

    }

    public static final Parcelable.Creator<Currency> CREATOR = new Parcelable.Creator<Currency>() {
        @Override
        public Currency createFromParcel(Parcel in) {
            return new Currency(in);
        }

        @Override
        public Currency[] newArray(int size) {
            return new Currency[size];
        }
    };

}
