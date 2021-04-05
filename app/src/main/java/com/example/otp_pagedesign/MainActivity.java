package com.example.otp_pagedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.alimuzaffar.lib.pin.PinEntryEditText;

public class MainActivity extends AppCompatActivity {

    PinEntryEditText pinEntryEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intFunction();
        intLisener();
    }

    private void intLisener() {
        pinEntryEditText.setOnPinEnteredListener(new PinEntryEditText.OnPinEnteredListener() {
            @Override
            public void onPinEntered(CharSequence str) {

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Successfully Login", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void intFunction() {
        pinEntryEditText =  findViewById(R.id.txt_pin_entry);
    }
}