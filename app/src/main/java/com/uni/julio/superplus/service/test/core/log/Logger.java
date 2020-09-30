package com.uni.julio.superplus.service.test.core.log;

public class Logger {
    private String log="";
    public Logger(){}

    public String getLog(){
        synchronized (this){
            return log;
        }
    }

    public void l(String s){
        synchronized (this){
            log+=System.currentTimeMillis()+" "+s+"\n";
        }
    }
}