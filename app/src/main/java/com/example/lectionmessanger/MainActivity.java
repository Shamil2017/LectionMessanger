package com.example.lectionmessanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMessage = findViewById(R.id.etMessage);

    }

    public void onSendMessage(View view) {
        String messageText = etMessage.getText().toString();
        Intent intent = new Intent(this, ReceiveMainActivity.class);
        intent.putExtra(ReceiveMainActivity.EXTRA_MESSAGE, messageText);
        startActivity(intent);

    }
}