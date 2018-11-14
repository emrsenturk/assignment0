package com.example.sentrkk.helloandroidapp02;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.Objects;

public class cow implements Parcelable {

    public cow(Integer _breed, Integer _ıd) {
        this._breed = _breed;
        this._ıd = _ıd;
    }

    private Integer _breed;

    public Integer get_breed() {
        return _breed;
    }

    public Integer get_ıd() {
        return _ıd;
    }

    private Integer _ıd;

    public String toString(){

        return  this._breed+"                                         "+this._ıd;
    }
    public cow(Parcel in){
        this._breed=in.readInt();
        this._ıd=in.readInt();
    }

    public static final Creator<cow> CREATOR = new Creator<cow>() {
        @Override
        public cow createFromParcel(Parcel in) {
            return new cow(in);
        }

        @Override
        public cow[] newArray(int size) {
            return new cow[size];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this._breed);
        dest.writeInt(this._ıd);
    }
}