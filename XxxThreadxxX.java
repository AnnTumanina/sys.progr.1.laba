package com.company;

class XxxThreadxxX extends Thread{

    public void run(){
        System.out.println(getName());
    }

    public static void main(String[] args) {
       for(int i = 0; i < 12; i++){
           (new XxxThreadxxX()).start();
       }
       System.out.println(Thread.currentThread());
    }
}


