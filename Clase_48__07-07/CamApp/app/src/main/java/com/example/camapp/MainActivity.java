package com.example.camapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button btnCamara;
    ImageView imgView;
    String rutaImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCamara = findViewById(R.id.btnCamara);
        imgView = findViewById(R.id.imageView);

        btnCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirCamara();
            }
        });
    }

    private void abrirCamara(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        //if (intent.resolveActivity(getPackageManager())!=null){

        File imagenArchivo =null;
        try{
            imagenArchivo = crearImagen();

        }catch(IOException ex){
            Log.e("Error", ex.toString());
        }

        if (imagenArchivo != null){
            Uri fotoUri = FileProvider.getUriForFile(this,
                    "com.example.camapp.fileprovider", imagenArchivo);
            intent.putExtra(MediaStore.EXTRA_OUTPUT, fotoUri);
            startActivityForResult(intent, 1 );
        }

        startActivityForResult(intent, 1);
        //}
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode ==1 && resultCode==RESULT_OK){
            //Bundle extras = data.getExtras();
            //Bitmap imageBitmap = (Bitmap) extras.get("data");
            Bitmap imageBitmap = BitmapFactory.decodeFile(rutaImagen);
            imgView.setImageBitmap(imageBitmap);
        }
    }

    private File crearImagen() throws IOException {
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String nombreImagen = "foto_" + timeStamp + "_";
            File directorio = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            File imagen = File.createTempFile(nombreImagen, ".jpg", directorio );

            rutaImagen = imagen.getAbsolutePath();
            return imagen;
    }
}

//    private File crearImagen() throws IOException {
//        String nombreImagen = "foto_";
//        File directorio = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
//        File imagen = File.createTempFile(nombreImagen, ".jpg", directorio );
//
//        rutaImagen = imagen.getAbsolutePath();
//        return imagen;
//    }