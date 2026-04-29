package com.jarm.mockdeliveryapp;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class recommendedofferadapter extends RecyclerView.Adapter<recommendedofferadapter.MyViewHolder> {
    private List<recommendedoffer> recommendedofferlist;
    private boolean isabuttonheld = false;

    // Constructor
    public recommendedofferadapter(List<recommendedoffer> recommendedofferlisttoset) {
        this.recommendedofferlist = recommendedofferlisttoset;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recommendedoffercard, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        recommendedoffer recommendedofferitem = recommendedofferlist.get(position);
        double itemprice = recommendedofferitem.getprice();
        boolean intt = false;
        //holder.pricetextview.setText("$" + Float.toString(itemprice));
        if (itemprice > 99.9) {
            intt = true;
}
        if (intt == false) {
            String itempriceinstring = "$" + Double.toString(itemprice);
            holder.pricetextview.setText(itempriceinstring);
        }
        else {
            String itempriceinstring = "$" + Double.toString(itemprice);
            itempriceinstring = itempriceinstring.substring(0,itempriceinstring.indexOf("."));
            holder.pricetextview.setText(itempriceinstring);
        }
        holder.businessnametextview.setText(recommendedofferitem.getbusinessname());
        holder.offerdescriptiontextview.setText(recommendedofferitem.getofferdescription());
        //holder.offerimageview.setImageResource(recommendedofferitem.getpictureurl());
        //holder.examPic2.setImageResource(examItem.getImage2());
    }

    @Override
    public int getItemCount() {
        return recommendedofferlist.size();
    }

    // ViewHolder class
    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView pricetextview, businessnametextview, offerdescriptiontextview;
        ImageView offerimageview;
        Button button;
        boolean isabuttonheld = false;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            pricetextview = itemView.findViewById(R.id.pricetextview);
            businessnametextview = itemView.findViewById(R.id.businessnametextview);
            offerdescriptiontextview = itemView.findViewById(R.id.offerdescriptiontextview);
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
            });
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
