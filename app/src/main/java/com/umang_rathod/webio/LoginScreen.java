package com.umang_rathod.webio;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class LoginScreen extends AppCompatActivity {

    // On create method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

//        TextView appName = findViewById(R.id.appname);
//        TextPaint paint = appName.getPaint();
//        float width = paint.measureText("..");
//        Shader textShader = new LinearGradient(0,0,width,appName.getTextSize(),
//                new int[]{
//                        Color.parseColor("#FF0000"),
//                        Color.parseColor("#00FF00"),
//                        Color.parseColor("#0000FF"),
//                },null,Shader.TileMode.CLAMP);
//        appName.getPaint().setShader(textShader);

        // Hooks for transition
        TextView appName = findViewById(R.id.appname);
        TextView welcome = findViewById(R.id.welcome);
        TextView signIn = findViewById(R.id.signin);
        TextInputEditText mailInput = findViewById(R.id.mailinput);
        TextInputEditText passwordInput = findViewById(R.id.passwordinput);
        MaterialButton signinButton = findViewById(R.id.signinbutton);
        TextView createNewAcc = findViewById(R.id.createnewacc);

        // Create new account
        createNewAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignupScreen.class);
                Pair[] pairs = new Pair[7];
                pairs[0] = new Pair(appName, "transition1");
                pairs[1] = new Pair(welcome, "transition2");
                pairs[2] = new Pair(signIn, "transition3");
                pairs[3] = new Pair(mailInput, "transition4");
                pairs[4] = new Pair(passwordInput, "transition5");
                pairs[5] = new Pair(signinButton, "transition6");
                pairs[6] = new Pair(createNewAcc, "transition7");
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options =  ActivityOptions.makeSceneTransitionAnimation(LoginScreen.this, pairs);
                    startActivity(intent, options.toBundle());
                }
            }
        });

        // Sign in
        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                startActivity(intent);


//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
//                startActivity(intent);

//                Intent intent = new Intent(getApplicationContext(), CheckoutScreen.class);
//                startActivity(intent);
            }
        });


        // Forgot password
        TextView forgotPassword = findViewById(R.id.forgotpassword);
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ShowStatistics.class);
                startActivity(intent);
            }
        });

    }
    
    // Stop going to previous screen
    @Override
    public void onBackPressed(){}
}



// Temporary place :)

//android:backgroundTintMode="add"   --> At Material Button