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


public class FragmentC extends Fragment {

    private final String TAG="FragmentC";
    public FragmentC() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.v(TAG," FragmentC: OnCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false);
    }


    @Override
    public void onPause() {
        Log.v(TAG," FragmentC: OnPause");
        super.onPause();
    }

    @Override
    public void onResume() {
        Log.v(TAG," FragmentC: OnResume");
        super.onResume();
    }

    @Override
    public void onDestroy() {
        Log.v(TAG," FragmentC: OnDestroy");
        super.onDestroy();
    }

    @Override
    public void onStop() {
        Log.v(TAG," FragmentC: OnStop");
        super.onStop();
    }

    @Override
    public void onStart() {
        Log.v(TAG," FragmentC: OnStart");
        super.onStart();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.v(TAG," FragmentC: OnCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        Log.v(TAG," FragmentC: OnAttach");
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        Log.v(TAG," FragmentC: OnDetach");
        super.onDetach();
    }

    @Override
    public void onDestroyView() {
        Log.v(TAG," FragmentC: OnDestroyView");
        super.onDestroyView();
    }
}