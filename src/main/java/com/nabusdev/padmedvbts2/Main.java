package com.nabusdev.padmedvbts2;
import com.nabusdev.padmedvbts2.service.config.DatabaseLoader;
import com.nabusdev.padmedvbts2.service.config.PropertiesLoader;
import com.nabusdev.padmedvbts2.service.telnet.TelnetServer;

public class Main {

    public static void main(String[] args) {
        PropertiesLoader.load("server");
        DatabaseLoader.load();
        TelnetServer.init();
    }
}
