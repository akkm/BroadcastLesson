package com.example.broadcastlesson;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MyReceiver mReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 2 "ACTION_SCHOO" のBroadcastを受信開始する
        IntentFilter filter = new IntentFilter("ACTION_SCHOO");
        mReceiver = new MyReceiver();
        registerReceiver(mReceiver, filter);
    }

    @Override
    protected void onDestroy() {
        // TODO 3 受信を終了する
        unregisterReceiver(mReceiver);
        super.onDestroy();
    }

    // TODO 1 TextViewに "Message" を表示するクラス MyReceiver を作成する
    private class MyReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            String message = intent.getStringExtra("Message");
            TextView textView = (TextView) findViewById(R.id.message);
            textView.setText(message);
        }
    }
}
