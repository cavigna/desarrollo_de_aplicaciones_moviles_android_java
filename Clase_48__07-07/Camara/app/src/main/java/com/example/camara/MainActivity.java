package com.example.camara;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView foto;
    private ImageButton btnCam;
    private Button btn2;
    private static int CAMERA_PERMISSION_CODE = 1;
    private static int CAMERA =2;
    private static int CAMERA_REQUEST_CODE = 2;
    static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foto = findViewById(R.id.foto);
        btnCam = findViewById(R.id.btnCamara);




    }

    private void picIntent(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
    }


}


//        btn.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        registerForActivityResult(intent,100 );
//        }
//        });

//
//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
//                != PackageManager.PERMISSION_GRANTED) {
//                ActivityCompat.requestPermissions(this, new String[]{
//                }, 100);
//                }


//    private void dispatchTakePictureIntent() {
//        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        try {
//            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
//        } catch (ActivityNotFoundException e) {
//            // display error state to the user
//        }
//
//
//    }


//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
//                != PackageManager.PERMISSION_GRANTED) {
//                ActivityCompat.requestPermissions(this, new String[]{
//                }, 100);
//                }
//
//                btn.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        //startActivityForResult(intent, 100);
//
//        startActivity(intent);
//        }
//        });
//
//
//
//
//        }
//@Override
//protected void onActivityResult(int requestCode, int resultCode, @Nullable  Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == 100) {
//        Bundle extras = data.getExtras();
//        Bitmap imageBitmap = (Bitmap) extras.get("data");
//        foto.setImageBitmap(imageBitmap);
//        }
//        }




//        btnCam.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//        abrirCam();
//        }
//        });





    //    public void abrirCam() {
    //        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    //        if (intent.resolveActivity(getPackageManager())!=null){
    //            startActivityForResult(intent, Camera);
    //        }Toast.makeText(this, "No funca", Toast.LENGTH_LONG).show();
    //    }
    //
    //    @Override
    //    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
    //        super.onActivityResult(requestCode, resultCode, data);
    //        if (requestCode == 1 && resultCode == RESULT_OK) {
    //            Bundle extras = data.getExtras();
    //            Bitmap imageBitmap = (Bitmap) extras.get("data");
    //            foto.setImageBitmap(imageBitmap);
    //        }
    //        Toast.makeText(MainActivity.this, "No funca", Toast.LENGTH_LONG).show();
    //
    //    }