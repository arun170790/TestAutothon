package com.pwc.parallelweb;
import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class methodtest {

    public static void main(String[] args) throws FileNotFoundException {
//        String[] arr = new String[10];
        ArrayList<String> arr = new ArrayList<String>();
        File file = new File("C:\\Users\\athangaraj001\\Desktop\\testdata.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter(";");
        for (int i = 0; i < 5; i++) {
            arr.add(sc.next());
        }
        for (String i : arr) {
            System.out.println(i);
        }
        System.out.println(arr.get(1));
    }
}
