package com.example.fragment_demo;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class fragmentB extends Fragment {

    private final String TAG="FragmentB";

    public fragmentB() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_b, container, false);
        Log.v(TAG," FragmentB: OnCreateView");
        return view;
    }


    @Override
    public void onPause() {
        Log.v(TAG," FragmentB: OnPause");
        super.onPause();
    }

    @Override
    public void onResume() {
        Log.v(TAG," FragmentB: OnResume");
        super.onResume();
    }

    @Override
    public void onDestroy() {
        Log.v(TAG," FragmentB: OnDestroy");
        super.onDestroy();
    }

    @Override
    public void onStop() {
        Log.v(TAG," FragmentB: OnStop");
        super.onStop();
    }

    @Override
    public void onStart() {
        Log.v(TAG," FragmentB: OnStart");
        super.onStart();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.v(TAG," FragmentB: OnCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        Log.v(TAG," FragmentB: OnAttach");
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        Log.v(TAG," FragmentB: OnDetach");
        super.onDetach();
    }

    @Override
    public void onDestroyView() {
        Log.v(TAG," FragmentB: OnDestroyView");
        super.onDestroyView();
    }
}