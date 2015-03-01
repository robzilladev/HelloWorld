package helloworld;

import java.util.ArrayList;

public class HelloWorld {

    static ArrayList list;
    
    public static void main(String[] args) {
        list = new ArrayList();
        System.out.println("Size of list = " + list.size());
        
        for (int i = 0; i<=1000; i++)
        {
            list.add(i);
        }
        System.out.println(list.size());
        for (Object a:list)
        {
            System.out.println((int)a);
        }
    }
    
}
