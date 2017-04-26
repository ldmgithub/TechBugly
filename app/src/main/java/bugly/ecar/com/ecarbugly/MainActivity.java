package bugly.ecar.com.ecarbugly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test();
    }

    private void test() {

//        Toast.makeText(this, "未修复", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "修复成功", Toast.LENGTH_SHORT).show();

    }
}
