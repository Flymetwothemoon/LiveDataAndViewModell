package com.example.livedata;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TextViewModel extends ViewModel {
    public MutableLiveData<Integer> livedata = new MutableLiveData<Integer>();
    int a =0;
    public void init(){

        livedata.setValue(a);
        Log.d("1234",String.valueOf(livedata.getValue()));
    }
    public void plusOne(){
        a++;
        livedata.setValue(a);
        Log.d("1234",String.valueOf(livedata.getValue()));
    }
    public void clear(){
        a = 0;
        livedata.setValue(a);
    }
}
