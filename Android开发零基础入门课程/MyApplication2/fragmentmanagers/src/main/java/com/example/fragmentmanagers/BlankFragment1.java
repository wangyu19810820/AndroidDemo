package com.example.fragmentmanagers;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class BlankFragment1 extends Fragment {

    private static String TAG = "wy";
    private IFragmentCallback iFragmentCallback;
    private View rootView;

    public BlankFragment1() {
        // Required empty public constructor
    }

    public void setiFragmentCallback(IFragmentCallback iFragmentCallback) {
        this.iFragmentCallback = iFragmentCallback;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach:");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        String string = bundle.getString("message");
        Log.e(TAG, "onCreate:" + string);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_blank1, container, false);
        }
        Button button = rootView.findViewById(R.id.btn3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (iFragmentCallback != null) {
//                    iFragmentCallback.sendMsgToActivity("Hi, I am from fragment.");
                    String msg = iFragmentCallback.getMsgFromActivity("null");
                    Toast.makeText(BlankFragment1.this.getContext(), msg, Toast.LENGTH_SHORT).show();
                }
            }
        });
        Log.d(TAG, "onCreateView:");
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated:");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart:");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume:");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause:");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop:");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView:");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy:");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach:");
    }
}