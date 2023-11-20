package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private final String TAG="Etiket";
    private int sayi=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"debug (hata ayıklama)");
    }
    public void islemYap(View view){
        Log.i(TAG,"Düğmeye Tıklandı");
        EditText editText=(EditText) findViewById(R.id.editText);
        Log.i(TAG,"Edit Text tanımlandı");
        String s1=editText.getText().toString();
        Log.i(TAG,"Yazı sayıya çevrildi");
        sayi=sayi+2;
        Log.i(TAG,"sayıya 2 eklendi");

    }
}