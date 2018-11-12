package com.example.sentrkk.helloandroidapp02;

public class cow {

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

        return  this._breed+"                                        "+this._ıd;
    };
}