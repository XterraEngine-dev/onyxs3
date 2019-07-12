package com.xterraengine.onyxs3;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.mobile.client.AWSMobileClient;
import com.amazonaws.services.s3.AmazonS3Client;

import java.io.ByteArrayOutputStream;



public class S3Cert {


    public AmazonS3Client onyxCert(Context context, String SECRET, String KEY){
        AWSMobileClient.getInstance().initialize(context).execute();
        BasicAWSCredentials credentials = new BasicAWSCredentials(KEY, SECRET);
        return new AmazonS3Client(credentials);
    }
    @Deprecated
    public Uri getImageUri(Context inContext, Bitmap inImage) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        inImage.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(inContext.getContentResolver(), inImage, "Title", null);
        return Uri.parse(path);
    }

}
