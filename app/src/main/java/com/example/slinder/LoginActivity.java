package com.example.slinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.biometric.BiometricPrompt;
import android.os.Bundle;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import androidx.fragment.app.FragmentActivity;

import android.util.Log;
import android.view.View;
import android.content.Intent;
//import android.support.annotation.Nullable;
//import android.support.v/.app.AppCompatActivity;

import androidx.annotation.NonNull;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = LoginActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//Create a thread pool with a single thread//

        Executor newExecutor = Executors.newSingleThreadExecutor();

        FragmentActivity activity = this;

//Start listening for authentication events//

        final BiometricPrompt myBiometricPrompt = new BiometricPrompt(activity, newExecutor, new BiometricPrompt.AuthenticationCallback() {
            @Override

//onAuthenticationError is called when a fatal error occurrs//

            public void onAuthenticationError(int errorCode, @NonNull CharSequence errString) {
                super.onAuthenticationError(errorCode, errString);
                if (errorCode == BiometricPrompt.ERROR_NEGATIVE_BUTTON) {
                } else {

//Print a message to Logcat//

                    Log.d(TAG, "An unrecoverable error occurred");
                }
            }

//onAuthenticationSucceeded is called when a fingerprint is matched successfully//

            @Override
            public void onAuthenticationSucceeded(@NonNull BiometricPrompt.AuthenticationResult result) {
                super.onAuthenticationSucceeded(result);

//Print a message to Logcat//

                Log.d(TAG, "Fingerprint recognised successfully");

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);

            }

//onAuthenticationFailed is called when the fingerprint doesn’t match//

            @Override
            public void onAuthenticationFailed() {
                super.onAuthenticationFailed();

//Print a message to Logcat//

                Log.d(TAG, "Fingerprint not recognised");
            }
        });

//Create the BiometricPrompt instance//

        String title = "Biometric login to enter";
        String subtitle = "Log in using your biometric credential";

        final BiometricPrompt.PromptInfo promptInfo = new BiometricPrompt.PromptInfo.Builder()

//Add some text to the dialog//

                .setTitle(title)
                .setSubtitle(subtitle)
                .setNegativeButtonText("Cancel")
                .setDeviceCredentialAllowed(true)

//Build the dialog//

                .build();


//Assign an onClickListener to the app’s “Authentication” button//

        findViewById(R.id.fingerprint).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myBiometricPrompt.authenticate(promptInfo);
            }
        });

    }

}
