package org.surrel.messengerbypasser;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent i = getIntent();
//        if(i != null) {
//            Log.i("Messenger bypasser",""+i);
//        }

        //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        //startActivity(intent);

        finish();
    }
}
