package com.example.broadcastlesson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 2 "ACTION_SCHOO" のBroadcastを受信開始する
    }

    @Override
    protected void onDestroy() {
        // TODO 3 受信を終了する


        super.onDestroy();
    }

    // TODO 1 TextViewに "Message" を表示するクラス MyReceiver を作成する
}
