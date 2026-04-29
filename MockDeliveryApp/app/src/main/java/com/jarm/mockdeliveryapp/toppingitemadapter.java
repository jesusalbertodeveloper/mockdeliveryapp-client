package com.jarm.mockdeliveryapp;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class toppingitemadapter extends RecyclerView.Adapter<toppingitemadapter.MyViewHolder> {
    private List<toppingitem> toppingitemlist;
    private boolean isabuttonheld = false;

    // Constructor
    public toppingitemadapter(List<toppingitem> toppingitemlisttoset) {
        this.toppingitemlist = toppingitemlisttoset;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.toppingitem, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        toppingitem toppingitemm = toppingitemlist.get(position);
        double itemprice = toppingitemm.getitemcost();
        boolean intt = false;
        //holder.pricetextview.setText("$" + Float.toString(itemprice));
        if (itemprice > 99.9) {
            intt = true;
}
        if (intt == false) {
            String itempriceinstring = "$" + Double.toString(itemprice);
            holder.toppingitemcost.setText(itempriceinstring + " " + "each");
        }
        else {
            String itempriceinstring = "$" + Double.toString(itemprice);
            itempriceinstring = itempriceinstring.substring(0,itempriceinstring.indexOf("."));
            holder.toppingitemcost.setText(itempriceinstring + " " + "each");
        }
        holder.toppingitemname.setText(toppingitemm.getitemname());
        //holder.offerimageview.setImageResource(recommendedofferitem.getpictureurl());
        //holder.examPic2.setImageResource(examItem.getImage2());
    }

    @Override
    public int getItemCount() {
        return toppingitemlist.size();
    }

    // ViewHolder class
    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView toppingitemname,toppingitemcost;
        //ImageView offerimageview;
        Button button;
        boolean isabuttonheld = false;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            toppingitemname = itemView.findViewById(R.id.toppingitemname);
            toppingitemcost = itemView.findViewById(R.id.toppingitemcost);
           /* offerdescriptiontextview = itemView.findViewById(R.id.offerdescriptiontextview);
            offerimageview = itemView.findViewById(R.id.offerimageview);
            button = itemView.findViewById(R.id.buttonnn);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(button.getContext(), "TEST" + pricetextview.getText(), Toast.LENGTH_SHORT).show();
                    if (isabuttonheld == true) {
                        //button.setBackgroundColor(R.color.colorforheldbutton);
                        button.setForeground(button.getContext().getDrawable(R.drawable.normalstate));
                        isabuttonheld = false;
                    }
                }
            });
            button.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    isabuttonheld = true;
                    // button.setBackgroundColor(R.color.black);
                    Drawable f = button.getContext().getDrawable(R.drawable.heldstate);
                    button.setForeground(f);
                    //button.setForeground(R.drawable.rippleeffect);
                    //button.setForegroundColor(R.drawable.rippleeffect);
                    return false;
                }
            });*/
            // @Override
            //public boolean onLongClickUseDefaultHapticFeedback(View view) {
            //  button.setForeground(button.getContext().getDrawable(R.drawable.normalstate));
            //return true;
            // }
            //});
//            button.setOnTouchListener(new View.OnTouchListener() {
//
//               @Override
//                public boolean onTouch(View v, MotionEvent event) {
//                 //   if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                        //button.setBackgroundColor(R.color.colorforheldbutton);
//                        //Toast.makeText(button.getContext(), "TEST" + pricetextview.getText(), Toast.LENGTH_SHORT).show();
//                        // change color
//                   // }
//                   if (event.getAction() == MotionEvent.ACTION_UP) {
//                        // set to normal color
//                      //  button.setBackgroundColor(R.color.white);
//                       button.setForeground(button.getContext().getDrawable(R.drawable.normalstate));
//                    }
////return true;
//                    //button.setBackgroundColor(R.color.black);
//                    //return false;
//                   return true;
//                }
//            });

            //}
        }
    }
}
