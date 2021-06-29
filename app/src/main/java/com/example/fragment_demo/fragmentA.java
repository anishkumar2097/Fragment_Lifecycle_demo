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


public class fragmentA extends Fragment {

    private final String TAG="FragmentA";

    public fragmentA() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
            View view =inflater.inflate(R.layout.fragment_a, container, false);
        Log.v(TAG," FragmentA: OnCreateView");
            return view;
    }

    @Override
    public void onPause() {
        Log.v(TAG," FragmentA: OnPause");
        super.onPause();
    }

    

    @Override
    public void onResume() {
        Log.v(TAG," FragmentA: OnResume");
        super.onResume();
    }

    @Override
    public void onDestroy() {
        Log.v(TAG," FragmentA: OnDestroy");
        super.onDestroy();
    }

    @Override
    public void onStop() {
        Log.v(TAG," FragmentA: OnStop");
        super.onStop();
    }

    @Override
    public void onStart() {
        Log.v(TAG," FragmentA: OnStart");
        super.onStart();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.v(TAG," FragmentA: OnCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        Log.v(TAG," FragmentA: OnAttach");
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        Log.v(TAG," FragmentA: OnDetach");
        super.onDetach();
    }

    @Override
    public void onDestroyView() {
        Log.v(TAG," FragmentA: OnDestroyView");
        super.onDestroyView();
    }
}