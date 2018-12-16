package kr.tjeit.a20181216_02_loginandsignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    TextView userIdTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        String userId = getIntent().getStringExtra("입력아이디");

        userIdTxt.setText(userId);
    }

    @Override
    public void bindViews() {
        userIdTxt = findViewById(R.id.userIdTxt);
    }
}
