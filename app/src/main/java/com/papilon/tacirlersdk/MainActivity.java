package com.papilon.tacirlersdk;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.digitalonboarding.view.pap_WelcomeKvkk;

import java.security.cert.X509Certificate;
import java.util.Objects;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class MainActivity extends AppCompatActivity {

    Button openSdkButton;
    TextView textView;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openSdkButton = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        openSdkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLibraryActivity();
            }
        });
    }

    public void startLibraryActivity() {
        Intent intent = new Intent(MainActivity.this, pap_WelcomeKvkk.class);
        intent.putExtra("calling_package", this.getPackageName());
        intent.putExtra("calling_class", this.getClass().getName());
        intent.putExtra("from_main", "true");

        // license parameters
        intent.putExtra("token_for_license", "");
        intent.putExtra("license_id", "");
        // ----------------------------------------------------------------

        // UI parameters
        //intent.putExtra("logo_image", "base64 image string)
        //intent.putExtra("font_type", "gilroy");
        //intent.putExtra("background_color", "#000000");
        //intent.putExtra("theme_color", "#724656");
        //intent.putExtra("enable_button_color", "#000800");
        //intent.putExtra("disable_button_color", "#800000");
        // ----------------------------------------------------------------

        startActivity(intent);
    }
}

