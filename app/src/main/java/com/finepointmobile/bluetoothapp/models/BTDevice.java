package com.finepointmobile.bluetoothapp.models;

/**
 * Created by danielmalone on 7/21/17.
 */

public class BTDevice {
    private String mName;
    private String mAddress;

    public BTDevice(String name, String address) {
        mName = name;
        mAddress = address;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }
}
