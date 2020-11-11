package com.example.a390_y_json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.json.JSONException;

import java.io.IOException;
import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    private EditText outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.outputText=(EditText)this.findViewById(R.id.editText);
    }

    public void runExample(View view) {
        try {
            Company company = ReadJSONExample.readCompanyJSONFile(this);
            outputText.setText(company.toString());
        }
        catch (Exception e){
            outputText.setText(e.getMessage());
            e.printStackTrace();
        }
    }
}