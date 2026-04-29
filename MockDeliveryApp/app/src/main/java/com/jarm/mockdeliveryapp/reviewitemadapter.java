package com.jarm.mockdeliveryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class reviewitemadapter extends RecyclerView.Adapter<reviewitemadapter.MyViewHolder> {
    private List<reviewitem> reviewitemlist;
    private boolean isabuttonheld = false;

    // Constructor
    public reviewitemadapter(List<reviewitem> reviewitemlisttoset) {
        this.reviewitemlist = reviewitemlisttoset;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.reviewitem, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        reviewitem reviewitemm = reviewitemlist.get(position);

        holder.reviewername.setText(reviewitemm.getreviewername());
        holder.reviewdate.setText(reviewitemm.getreviewdate());
        holder.reviewtext.setText(reviewitemm.getreviewtext());

    }

    @Override
    public int getItemCount() {
        return reviewitemlist.size();
    }

    // ViewHolder class
    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView reviewername,reviewdate,reviewtext;
        //ImageView offerimageview;
        //Button button;
      //  boolean isabuttonheld = false;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            reviewername = itemView.findViewById(R.id.reviewername);
            reviewdate = itemView.findViewById(R.id.reviewdate);
            reviewtext = itemView.findViewById(R.id.reviewtext);

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
