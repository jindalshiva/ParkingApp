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

public class Bottom_Sheet extends BottomSheetDialogFragment  {

    private BottomSheetListner mListner;
    Button buttonSlot1,buttonSlot2,buttonSlot3,buttonSlot4,buttonSlot5,buttonSlot6,buttonSlot7,buttonSlot8,buttonSlot9,buttonSlot10,
            buttonSlot11,buttonSlot12,buttonSlot13,buttonSlot14,buttonSlot15,buttonSlot16,buttonSlot17,buttonSlot18,buttonSlot19,buttonSlot20,
            buttonSlot21,buttonSlot22,buttonSlot23,buttonSlot24,buttonSlot25,buttonSlot26,buttonSlot27,buttonSlot28,buttonSlot29,buttonSlot30,
            buttonSlot31,buttonSlot32,buttonSlot33,buttonSlot34,buttonSlot35,buttonSlot36,buttonSlot37,buttonSlot38,buttonSlot39,buttonSlot40,
            buttonSlot41,buttonSlot42,buttonSlot43,buttonSlot44,buttonSlot45,buttonSlot46,buttonSlot47,buttonSlot48,buttonSlot49,buttonSlot50,
            buttonSlot51,buttonSlot52,buttonSlot53,buttonSlot54,buttonSlot55,buttonSlot56,buttonSlot57,buttonSlot58,buttonSlot59,buttonSlot60,
            buttonSlot61,buttonSlot62,buttonSlot63,buttonSlot64,buttonSlot65,buttonSlot66,buttonSlot67,buttonSlot68,buttonSlot69,buttonSlot70,
            buttonSlot71,buttonSlot72,buttonSlot73,buttonSlot74,buttonSlot75,buttonSlot76,buttonSlot77,buttonSlot78,buttonSlot79,buttonSlot80,
            buttonSlot81,buttonSlot82,buttonSlot83,buttonSlot84,buttonSlot85,buttonSlot86,buttonSlot87,buttonSlot88,buttonSlot89,buttonSlot90,
            buttonSlot91,buttonSlot92,buttonSlot93,buttonSlot94,buttonSlot95,buttonSlot96,buttonSlot97,buttonSlot98,buttonSlot99,buttonSlot100;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bottom_slots,container, false);

        buttonSlot1 = (Button) v.findViewById(R.id.buttonSlo1);
        buttonSlot2 = (Button) v.findViewById(R.id.buttonSlot2);
        buttonSlot3 = (Button) v.findViewById(R.id.buttonSlot3);
        buttonSlot4 = (Button) v.findViewById(R.id.buttonSlot4);
        buttonSlot5 = (Button) v.findViewById(R.id.buttonSlo5);
        buttonSlot6 = (Button) v.findViewById(R.id.buttonSlot6);
        buttonSlot7 = (Button) v.findViewById(R.id.buttonSlot7);
        buttonSlot8 = (Button) v.findViewById(R.id.buttonSlot8);
        buttonSlot9 = (Button) v.findViewById(R.id.buttonSlo9);
        buttonSlot10 = (Button) v.findViewById(R.id.buttonSlot10);
        buttonSlot11 = (Button) v.findViewById(R.id.buttonSlot11);
        buttonSlot12 = (Button) v.findViewById(R.id.buttonSlot12);
        buttonSlot13 = (Button) v.findViewById(R.id.buttonSlo13);
        buttonSlot14 = (Button) v.findViewById(R.id.buttonSlot14);
        buttonSlot15 = (Button) v.findViewById(R.id.buttonSlot15);
        buttonSlot16 = (Button) v.findViewById(R.id.buttonSlot16);
        buttonSlot17 = (Button) v.findViewById(R.id.buttonSlo17);
        buttonSlot18 = (Button) v.findViewById(R.id.buttonSlot18);
        buttonSlot19 = (Button) v.findViewById(R.id.buttonSlot19);
        buttonSlot20 = (Button) v.findViewById(R.id.buttonSlot20);
        buttonSlot21 = (Button) v.findViewById(R.id.buttonSlo21);
        buttonSlot22 = (Button) v.findViewById(R.id.buttonSlot22);
        buttonSlot23 = (Button) v.findViewById(R.id.buttonSlot23);
        buttonSlot24 = (Button) v.findViewById(R.id.buttonSlot24);
        buttonSlot25 = (Button) v.findViewById(R.id.buttonSlo25);
        buttonSlot26 = (Button) v.findViewById(R.id.buttonSlot26);
        buttonSlot27 = (Button) v.findViewById(R.id.buttonSlot27);
        buttonSlot28 = (Button) v.findViewById(R.id.buttonSlot28);
        buttonSlot29 = (Button) v.findViewById(R.id.buttonSlo29);
        buttonSlot30 = (Button) v.findViewById(R.id.buttonSlot30);
        buttonSlot31 = (Button) v.findViewById(R.id.buttonSlot31);
        buttonSlot32 = (Button) v.findViewById(R.id.buttonSlot32);
        buttonSlot33 = (Button) v.findViewById(R.id.buttonSlo33);
        buttonSlot34 = (Button) v.findViewById(R.id.buttonSlot34);
        buttonSlot35 = (Button) v.findViewById(R.id.buttonSlot35);
        buttonSlot36 = (Button) v.findViewById(R.id.buttonSlot36);
        buttonSlot37 = (Button) v.findViewById(R.id.buttonSlo37);
        buttonSlot38 = (Button) v.findViewById(R.id.buttonSlot38);
        buttonSlot39 = (Button) v.findViewById(R.id.buttonSlot39);
        buttonSlot40 = (Button) v.findViewById(R.id.buttonSlot40);
        buttonSlot41 = (Button) v.findViewById(R.id.buttonSlo41);
        buttonSlot42 = (Button) v.findViewById(R.id.buttonSlot42);
        buttonSlot43 = (Button) v.findViewById(R.id.buttonSlot43);
        buttonSlot44 = (Button) v.findViewById(R.id.buttonSlot44);
        buttonSlot45 = (Button) v.findViewById(R.id.buttonSlo45);
        buttonSlot46 = (Button) v.findViewById(R.id.buttonSlot46);
        buttonSlot47 = (Button) v.findViewById(R.id.buttonSlot47);
        buttonSlot48 = (Button) v.findViewById(R.id.buttonSlot48);
        buttonSlot49 = (Button) v.findViewById(R.id.buttonSlo49);
        buttonSlot50 = (Button) v.findViewById(R.id.buttonSlot50);
        buttonSlot51 = (Button) v.findViewById(R.id.buttonSlot51);
        buttonSlot52 = (Button) v.findViewById(R.id.buttonSlot52);
        buttonSlot53 = (Button) v.findViewById(R.id.buttonSlo53);
        buttonSlot54 = (Button) v.findViewById(R.id.buttonSlot54);
        buttonSlot55 = (Button) v.findViewById(R.id.buttonSlot55);
        buttonSlot56 = (Button) v.findViewById(R.id.buttonSlot56);
        buttonSlot57 = (Button) v.findViewById(R.id.buttonSlo57);
        buttonSlot58 = (Button) v.findViewById(R.id.buttonSlot58);
        buttonSlot59 = (Button) v.findViewById(R.id.buttonSlot59);
        buttonSlot60 = (Button) v.findViewById(R.id.buttonSlot60);
        buttonSlot61 = (Button) v.findViewById(R.id.buttonSlo61);
        buttonSlot62 = (Button) v.findViewById(R.id.buttonSlot62);
        buttonSlot63 = (Button) v.findViewById(R.id.buttonSlot63);
        buttonSlot64 = (Button) v.findViewById(R.id.buttonSlot64);
        buttonSlot65 = (Button) v.findViewById(R.id.buttonSlo65);
        buttonSlot66 = (Button) v.findViewById(R.id.buttonSlot66);
        buttonSlot67 = (Button) v.findViewById(R.id.buttonSlot67);
        buttonSlot68 = (Button) v.findViewById(R.id.buttonSlot68);
        buttonSlot69 = (Button) v.findViewById(R.id.buttonSlo69);
        buttonSlot70 = (Button) v.findViewById(R.id.buttonSlot70);
        buttonSlot71 = (Button) v.findViewById(R.id.buttonSlot71);
        buttonSlot72 = (Button) v.findViewById(R.id.buttonSlot72);
        buttonSlot73 = (Button) v.findViewById(R.id.buttonSlo73);
        buttonSlot74 = (Button) v.findViewById(R.id.buttonSlot74);
        buttonSlot75 = (Button) v.findViewById(R.id.buttonSlot75);
        buttonSlot76 = (Button) v.findViewById(R.id.buttonSlot76);
        buttonSlot77 = (Button) v.findViewById(R.id.buttonSlo77);
        buttonSlot78 = (Button) v.findViewById(R.id.buttonSlot78);
        buttonSlot79 = (Button) v.findViewById(R.id.buttonSlot79);
        buttonSlot80 = (Button) v.findViewById(R.id.buttonSlot80);
        buttonSlot81 = (Button) v.findViewById(R.id.buttonSlo81);
        buttonSlot82 = (Button) v.findViewById(R.id.buttonSlot82);
        buttonSlot83 = (Button) v.findViewById(R.id.buttonSlot83);
        buttonSlot84 = (Button) v.findViewById(R.id.buttonSlot84);
        buttonSlot85 = (Button) v.findViewById(R.id.buttonSlo85);
        buttonSlot86 = (Button) v.findViewById(R.id.buttonSlot86);
        buttonSlot87 = (Button) v.findViewById(R.id.buttonSlot87);
        buttonSlot88 = (Button) v.findViewById(R.id.buttonSlot88);
        buttonSlot89 = (Button) v.findViewById(R.id.buttonSlo89);
        buttonSlot90 = (Button) v.findViewById(R.id.buttonSlot90);
        buttonSlot91 = (Button) v.findViewById(R.id.buttonSlot91);
        buttonSlot92 = (Button) v.findViewById(R.id.buttonSlot92);
        buttonSlot93 = (Button) v.findViewById(R.id.buttonSlo93);
        buttonSlot94 = (Button) v.findViewById(R.id.buttonSlot94);
        buttonSlot95 = (Button) v.findViewById(R.id.buttonSlot95);
        buttonSlot96 = (Button) v.findViewById(R.id.buttonSlot96);
        buttonSlot97 = (Button) v.findViewById(R.id.buttonSlo97);
        buttonSlot98 = (Button) v.findViewById(R.id.buttonSlot98);
        buttonSlot99 = (Button) v.findViewById(R.id.buttonSlot99);
        buttonSlot100 = (Button) v.findViewById(R.id.buttonSlot100);

        buttonSlot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 1");
                buttonSlot1.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 2");
                buttonSlot2.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 3");
                buttonSlot3.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 4");
                buttonSlot4.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 5");
                buttonSlot5.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 6");
                buttonSlot6.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 7");
                buttonSlot7.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 8");
                buttonSlot8.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 9");
                buttonSlot9.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 10");
                buttonSlot10.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 11");
                buttonSlot11.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 12");
                buttonSlot12.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 13");
                buttonSlot13.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 14");
                buttonSlot14.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 15");
                buttonSlot15.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 16");
                buttonSlot16.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 17");
                buttonSlot17.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 18");
                buttonSlot18.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 19");
                buttonSlot19.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 20");
                buttonSlot20.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 21");
                buttonSlot21.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 22");
                buttonSlot22.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 23");
                buttonSlot23.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 24");
                buttonSlot24.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 25");
                buttonSlot25.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 26");
                buttonSlot26.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 27");
                buttonSlot27.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 28");
                buttonSlot28.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 29");
                buttonSlot29.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 30");
                buttonSlot30.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 31");
                buttonSlot31.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 32");
                buttonSlot32.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 33");
                buttonSlot33.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 34");
                buttonSlot34.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 35");
                buttonSlot35.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 36");
                buttonSlot36.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 37");
                buttonSlot37.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 38");
                buttonSlot38.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 39");
                buttonSlot39.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 40");
                buttonSlot40.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 41");
                buttonSlot41.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 42");
                buttonSlot42.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 43");
                buttonSlot43.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 44");
                buttonSlot44.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 45");
                buttonSlot45.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 46");
                buttonSlot46.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 47");
                buttonSlot47.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 48");
                buttonSlot48.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 49");
                buttonSlot49.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 50");
                buttonSlot50.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 51");
                buttonSlot51.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 52");
                buttonSlot52.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 53");
                buttonSlot53.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 54");
                buttonSlot54.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 55");
                buttonSlot55.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 56");
                buttonSlot56.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 57");
                buttonSlot57.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 58");
                buttonSlot58.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 59");
                buttonSlot59.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 60");
                buttonSlot60.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 61");
                buttonSlot61.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 62");
                buttonSlot62.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 63");
                buttonSlot63.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 64");
                buttonSlot64.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 65");
                buttonSlot65.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 66");
                buttonSlot66.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 67");
                buttonSlot67.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 68");
                buttonSlot68.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 69");
                buttonSlot69.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 70");
                buttonSlot70.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 71");
                buttonSlot71.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 72");
                buttonSlot72.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 73");
                buttonSlot73.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 74");
                buttonSlot74.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 75");
                buttonSlot75.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 76");
                buttonSlot76.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 77");
                buttonSlot77.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 78");
                buttonSlot78.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 79");
                buttonSlot79.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 80");
                buttonSlot80.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 81");
                buttonSlot81.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 82");
                buttonSlot82.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 83");
                buttonSlot83.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 84");
                buttonSlot84.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 85");
                buttonSlot85.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 86");
                buttonSlot86.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 87");
                buttonSlot87.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 88");
                buttonSlot88.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 89");
                buttonSlot89.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 90");
                buttonSlot90.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 91");
                buttonSlot91.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 92");
                buttonSlot92.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 93");
                buttonSlot93.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 94");
                buttonSlot94.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 95");
                buttonSlot95.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 96");
                buttonSlot96.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 97");
                buttonSlot97.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 98");
                buttonSlot98.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 99");
                buttonSlot99.setBackgroundColor(Color.MAGENTA); }});
        buttonSlot100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.onButtonClicked("Slot 100");
                buttonSlot100.setBackgroundColor(Color.MAGENTA); }});








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
