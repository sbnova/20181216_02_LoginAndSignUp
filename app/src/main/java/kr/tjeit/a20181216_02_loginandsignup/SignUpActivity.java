package kr.tjeit.a20181216_02_loginandsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class SignUpActivity extends BaseActivity {

    CheckBox allCheckBox;
    CheckBox moneyCheckBox;
    CheckBox agreementCheckBox;
    Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        allCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                isChecked : true => 눌리는 상황 / false => 해제되는 상황

                if(isChecked){
//                    전체 동의가 눌렸다면? 금융과 이용약관이 동의로 처리
                    moneyCheckBox.setChecked(true);
                    agreementCheckBox.setChecked(true);
                }else{
                    moneyCheckBox.setChecked(false);
                    agreementCheckBox.setChecked(false);
                }
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(allCheckBox.isChecked() && moneyCheckBox.isChecked() && agreementCheckBox.isChecked()){
//                    다음 화면으로 이동해야함.
                    Log.d("약관동의", "모두 동의함. 다음화면으로");

                    Intent intent = new Intent(mContext,SignUpStep2Activity.class);
                    startActivity(intent);
                }
                else{
//                    사용자에게 모두 동의하셔야 가입이 가능합니다. 안내메세지. => Toast 이용
                    Toast.makeText(mContext, "모두 동의하셔야 가입이 가능합니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        allCheckBox = findViewById(R.id.allCheckBox);
        moneyCheckBox = findViewById(R.id.moneyCheckBox);
        agreementCheckBox = findViewById(R.id.agreementCheckBox);
        nextBtn = findViewById(R.id.nextBtn);
    }
}
