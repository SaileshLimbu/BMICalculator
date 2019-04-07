package np.com.softwarica.secondassignment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BMIActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText etHeight, etWeight, etBMI;
    private Button btnCompute;
    private BMI bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        etHeight = findViewById(R.id.etHeight);
        etWeight = findViewById(R.id.etWeight);
        etBMI = findViewById(R.id.etBMI);
        btnCompute = findViewById(R.id.btnCompute);
        bmi = new BMI();

        btnCompute.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        float height = Float.parseFloat(etHeight.getText().toString());
        float weight = Float.parseFloat(etWeight.getText().toString());

        if(!validation()){
            return;
        }

        bmi.setHeight(height);
        bmi.setWeight(weight);

        float result = bmi.calculateBMI();
        etBMI.setText(Float.toString(result));

        Toast.makeText(this, "" + result, Toast.LENGTH_SHORT).show();
    }

    private boolean validation(){
        if(TextUtils.isEmpty(etHeight.getText().toString())){
            etHeight.setError("Please enter height!!!");
            etHeight.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(etWeight.getText().toString())){
            etWeight.setError("Please enter weight!!!");
            etWeight.requestFocus();
            return false;
        }
        return true;
    }
}
