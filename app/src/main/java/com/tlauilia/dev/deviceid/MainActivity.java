package com.tlauilia.dev.deviceid;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
//import java.util.Random;

    public class MainActivity extends Activity {


        ImageView imageview1;
        ImageView imageview2;
        Button button1;
        Button button2;
        Button button3;
        Bitmap bitmap1;
        Bitmap bitmap2;
        Canvas canvas1;
        Canvas canvas2;
        Paint paint1;
        Paint paint2;
        TextView idView;


        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main_activity);


        button3 = (Button) findViewById(R.id.button3);
        idView = (TextView) findViewById(R.id.textView2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TelephonyManager telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);


                // getDeviceId() function Returns the unique device ID.
                // for example,the IMEI for GSM and the MEID or ESN for CDMA phones.

                //stringimei = telephonyManager.getDeviceId();
                //idView.append("IMEI No : " + stringimei + "\n");


                // getSubscriberId() function Returns the unique subscriber ID,
                // for example, the IMSI for a GSM phone.

                // imsi = telephonyManager.getSubscriberId();
                // idView.append("IMSI No : " + imsi + "\n");


                //* Settings.Secure.ANDROID_ID returns the unique DeviceID
                //* Works for Android 2.2 and above

                String androidId = Settings.Secure.getString(getContentResolver(),
                        Settings.Secure.ANDROID_ID);
                idView.append("AndroidID : " + androidId + "\n");

            }

        });

    }

}



