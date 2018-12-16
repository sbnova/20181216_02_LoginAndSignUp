package kr.tjeit.a20181216_02_loginandsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends BaseActivity {

    TextView signUpTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        signUpTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                이동시작점과 도착점
                Intent intent = new Intent(mContext, SignUpActivity.class);
//                시작
                startActivity(intent);
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        signUpTxt = findViewById(R.id.signUpTxt);
    }
}
