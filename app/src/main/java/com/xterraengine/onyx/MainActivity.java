package com.xterraengine.onyx;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.xterraengine.onyxs3.Onyxamazon;
import com.xterraengine.onyxs3.S3Cert;


public class MainActivity extends AppCompatActivity {


    private static final int RC_PHOTO_PICKER = 2;
    private static final String TAG = "example-onyx";
    private static final String SECRET = "YOUR_SECRET";
    private static final String KEY_VAL = "YOUR_KEY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button seleccionar = findViewById(R.id.button_select);


        seleccionar.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                Intent photoPickerIntent = new Intent(Intent.ACTION_GET_CONTENT);
                photoPickerIntent.setType("image/*");
                photoPickerIntent.putExtra(Intent.EXTRA_LOCAL_ONLY, false);
                startActivityForResult(Intent.createChooser(photoPickerIntent, "Complete Action Using"), RC_PHOTO_PICKER);
            }

        });


    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RC_PHOTO_PICKER && resultCode == RESULT_OK && data != null) {
            Uri pickedImage = data.getData();


            Toast.makeText(this, "Imagen cargada", Toast.LENGTH_SHORT).show();
            Log.i(TAG, "Uri Image ->" + pickedImage);


            new Onyxamazon(this, new S3Cert().onyxCert(this, SECRET, KEY_VAL), pickedImage)
                    .uploadImage("LIB", "MASTER", "PR", "99999", "99999");
        }
    }
}
