package com.soft19;

import com.soft.TicketWindow;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        TicketWindow tw=new TicketWindow("张三");
        Thread t1=new Thread(tw);
        t1.start();
    }
}
