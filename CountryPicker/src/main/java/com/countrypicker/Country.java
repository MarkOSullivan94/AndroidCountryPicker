package com.countrypicker;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * POJO
 */
public class Country implements CountryPickerModel {

    private String code;
    private String name;

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSearchableString() {
        return name;
    }

    @Override
    public Boolean hasID() {
        return !code.isEmpty();
    }

    @Override
    public String getID() {
        return code;
    }
}
