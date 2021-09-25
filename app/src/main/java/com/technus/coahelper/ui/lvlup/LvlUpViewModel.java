package com.technus.coahelper.ui.lvlup;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LvlUpViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LvlUpViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}