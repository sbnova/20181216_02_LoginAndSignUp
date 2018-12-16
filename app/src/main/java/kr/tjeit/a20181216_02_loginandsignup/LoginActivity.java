package kr.tjeit.a20181216_02_loginandsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends BaseActivity {

    TextView signUpTxt;
    Button loginBtn;
    EditText idEdt;

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

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                아이디 Edit에 뭐라고 적혀 있는지? 변수에 저장
                String inputId = idEdt.getText().toString();

//                메인 액티비티로 넘어갈때 inputid를 들고 가려면?
//                intent 변수에게 첨부물을 들려주면 됨.
                Intent intent = new Intent(mContext, MainActivity.class);
                intent.putExtra("입력아이디", inputId);

//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        signUpTxt = findViewById(R.id.signUpTxt);
        loginBtn = findViewById(R.id.loginBtn);
        idEdt = findViewById(R.id.idEdt);
    }
}
