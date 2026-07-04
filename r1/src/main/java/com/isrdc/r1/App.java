package com.isrdc.r1;

import com.google.gson.Gson;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        User user=new User();
        user.setAge(21000);
        user.setName("yamraj");
        Gson gson=new Gson();
        String str=gson.toJson(user);
        System.out.println(str);
    }
}
