package com.example.navigationbar.Contacts;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.navigationbar.R;

import static com.example.navigationbar.R.*;

public class MyAlert  extends DialogFragment {
    public  String title;
    public int img_id;
    public MyAlert(){}
    @SuppressLint("ValidFragment")
    public MyAlert(String title, int img_id){
        this.title = title;
        this.img_id=img_id;

    }

    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        LayoutInflater inflater=getActivity().getLayoutInflater();
        View view=inflater.inflate(layout.dialog_item,null);
        ImageView imageView = (ImageView)view.findViewById(id.imageView);
        imageView.setImageResource(img_id);

        builder.setView(view);
        builder.setTitle(""+title);

        builder.setNegativeButton("call", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),"negative button was clicked",Toast.LENGTH_SHORT).show();
            }
        });

        builder.setPositiveButton("mail", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),"positive button was clicked",Toast.LENGTH_SHORT).show();
            }
        });


        Dialog dialog=builder.create();

        return dialog;
    }


}

