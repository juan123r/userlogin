package com.elcholostudios.userlogin.files;

import com.elcholostudios.userlogin.util.Configuration;

public class DataFile extends Configuration {

    public DataFile() {
        super("playerData");
    }

    @Override
    public void registerDefaults() { }
}