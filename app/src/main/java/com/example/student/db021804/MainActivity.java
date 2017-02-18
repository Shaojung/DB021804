package com.example.student.db021804;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File p = getFilesDir();
        Log.d("FILE", p.toString());
        File f = new File(p.toString() + File.separator + "a1.txt");
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello World\r\n");
            bw.write("第二行\r\n");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
