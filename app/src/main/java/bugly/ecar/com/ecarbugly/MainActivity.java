package bugly.ecar.com.ecarbugly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        error();
        fixed();
    }
    // 错误
    private void error() {
        Toast.makeText(this, "修复成功".getBytes()[100], Toast.LENGTH_SHORT).show();

    }

    //修复
    private void fixed() {
        Toast.makeText(this, "修复成功", Toast.LENGTH_SHORT).show();
    }
}
