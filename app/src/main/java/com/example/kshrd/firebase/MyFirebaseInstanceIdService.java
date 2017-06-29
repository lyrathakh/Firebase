package com.example.kshrd.firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by kshrd on 6/23/17.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        String refresh = FirebaseInstanceId.getInstance().getToken();
        Log.e("oooo",refresh);


    }
}
