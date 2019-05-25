package com.example.parkingapp;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Bottom_Sheet extends BottomSheetDialogFragment {

    private BottomSheetListner mListner;
    Button buttonSlot1,buttonSlot2,buttonSlot3,buttonSlot4,buttonSlot5,buttonSlot6,buttonSlot7,buttonSlot8,buttonSlot9,buttonSlot10;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bottom_slots,container, false);

        buttonSlot1 = (Button) v.findViewById(R.id.buttonSlot1);
        buttonSlot2 = (Button) v.findViewById(R.id.buttonSlot2);
        buttonSlot3 = (Button) v.findViewById(R.id.buttonSlot3);
        buttonSlot4 = (Button) v.findViewById(R.id.buttonSlot4);
        buttonSlot5 = (Button) v.findViewById(R.id.buttonSlot5);
        buttonSlot6 = (Button) v.findViewById(R.id.buttonSlot6);
        buttonSlot7 = (Button) v.findViewById(R.id.buttonSlot7);
        buttonSlot8 = (Button) v.findViewById(R.id.buttonSlot8);
        buttonSlot9 = (Button) v.findViewById(R.id.buttonSlot9);
        buttonSlot10 = (Button) v.findViewById(R.id.buttonSlot10);


        buttonSlot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 1");
                buttonSlot1.setBackgroundColor(Color.MAGENTA);

            }
        });
        buttonSlot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 2");
                buttonSlot1.setBackgroundColor(Color.MAGENTA);



            }
        });
        buttonSlot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 3");
                buttonSlot1.setBackgroundColor(Color.MAGENTA);


            }
        });
        buttonSlot4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 4");
                buttonSlot1.setBackgroundColor(Color.MAGENTA);


            }
        });
        buttonSlot5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 5");
                buttonSlot1.setBackgroundColor(Color.MAGENTA);


            }
        });
        buttonSlot6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 6");
                buttonSlot1.setBackgroundColor(Color.MAGENTA);


            }
        });
        buttonSlot7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 7");
                buttonSlot1.setBackgroundColor(Color.MAGENTA);


            }
        });
        buttonSlot8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 8");
                buttonSlot1.setBackgroundColor(Color.MAGENTA);


            }
        });
        buttonSlot9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 9");
                buttonSlot1.setBackgroundColor(Color.MAGENTA);


            }
        });
        buttonSlot10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 10");
                buttonSlot1.setBackgroundColor(Color.MAGENTA);


            }
        });


        return v;

    }

    public  interface  BottomSheetListner{
        void onButtonClicked(String text);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);


        try{
            mListner =(BottomSheetListner) context;
        }catch (ClassCastException e){
            throw  new ClassCastException(context.toString()+"must implement botttomsheetlistner");
        }

    }
}
