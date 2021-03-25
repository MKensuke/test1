package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ボタン
        Button button = findViewById(R.id.button1);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Hello World!って書いてるテキスト
        TextView textView = findViewById(R.id.textView1);
        //　入力できるテキスト
        EditText editText = findViewById(R.id.editText1);

        // 入力したテキストをstring1に設定する呪文
        SpannableStringBuilder sb = (SpannableStringBuilder)editText.getText();
        String string1 = sb.toString();

        // string1をテキストを設定して表示
        textView.setText(string1);
    }
}