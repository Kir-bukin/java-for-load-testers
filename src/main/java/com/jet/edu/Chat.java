package com.jet.edu;

public class Chat {
    public  static void main(String[] args) {
        Server.start();
        Client.start();
    }

}

    class Client{
    public static  String login;
    public static  String password;

    public static void start(){
        Server.auth(login, password);
    }

    public static void stop(){

    }

    private static void sendMessage(String login, String message){
        if (message == "//exit"){
            stop();
        }
        Server.bufer(login, message);
    }

    public static void getMessage(String login, String message){

    }

}

    class Server{
    public static void start(){

    }

    public static void stop(){

    }

    public static int auth(String login, String password){
            return 0;
    }

    public static void bufer(String login, String message){
        logfile(login, message);
        Client.getMessage(login, message);
    }

    public static void logfile(String login, String message){
        addHistory(login, message);
    }

    private static void addHistory(String login, String message){

    }

    private static void callHistory(){

    }
}