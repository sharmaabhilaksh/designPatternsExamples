package com;

import java.io.*;

public class Test {

    public static void main(String[] args) {

        try{

            BufferedReader br = new BufferedReader(new FileReader("/home/abhilaksh/Desktop/1"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/abhilaksh/Desktop/2"));
            int i;

            do{
                i=br.read();
                bw.write((char)i);
            }while (i!=-1);

            bw.close();
            br.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }



    }


}