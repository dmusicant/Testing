package com.sg;

import com.testcompany.util.Util;

/**
 * Created by DMusicant on 4/3/16.
 */
public class Test {
    private static int value = 0;

    public static void main(String[] args)
    {
        //Pulled from external library
        Util util = new Util( "Test" );

        System.out.println( "Imported library: " + util.getName());

        Test.value = 1;

        System.out.println( "First test of commit to GitHub");
    }
}
