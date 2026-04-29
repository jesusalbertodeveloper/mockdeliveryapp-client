package com.jarm.mockdeliveryapp;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class offeringitemadapter extends RecyclerView.Adapter<offeringitemadapter.MyViewHolder> {
    private List<offeringitem> offeringitemlist;
    private boolean isabuttonheld = false;

    // Constructor
    public offeringitemadapter(List<offeringitem> offeringitemlisttoset) {
        this.offeringitemlist = offeringitemlisttoset;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.offeringitem, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        offeringitem offeringitemobject = offeringitemlist.get(position);
        double offeringprice = offeringitemobject.getofferingprice();
        boolean intt = false;
        //holder.pricetextview.setText("$" + Float.toString(itemprice));
   /*     if (offeringprice > 99.9) {
            intt = true;
}
        if (intt == false) {
            String offeringpriceinstring = "$" + Double.toString(offeringprice);
            holder.pricetextview.setText(offeringpriceinstring);
        }
        else {
            String offeringpriceinstring = "$" + Double.toString(offeringprice);
            offeringpriceinstring = offeringpriceinstring.substring(0,offeringpriceinstring.indexOf("."));
            holder.pricetextview.setText(offeringpriceinstring);
        }*/
        holder.offeringname.setText(offeringitemobject.getofferingname());
        holder.offeringshortlocation.setText(offeringitemobject.getofferingshortlocation());
        holder.restaurantname.setText(offeringitemobject.getrestaurantname());
        holder.offeringpublicationdate.setText(offeringitemobject.getofferingpublicationdate());

    }

    @Override
    public int getItemCount() {
        return offeringitemlist.size();
    }

    // ViewHolder class
    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView offeringname, offeringshortlocation, restaurantname, offeringpublicationdate;
        //ImageView offerimageview;
        //Button button;
        //boolean isabuttonheld = false;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            offeringname = itemView.findViewById(R.id.offeringname);
            offeringshortlocation = itemView.findViewById(R.id.offeringshortlocation);
            restaurantname = itemView.findViewById(R.id.restaurantname);
            offeringpublicationdate = itemView.findViewById(R.id.offeringpublicationdate);
            ImageButton menuButton = itemView.findViewById(R.id.menuButton);
            menuButton.setOnClickListener(v -> {
                PopupMenu popup = new PopupMenu(itemView.getContext(), v);
                popup.getMenuInflater().inflate(R.menu.somemenu, popup.getMenu());

                popup.setOnMenuItemClickListener(item -> {
                    int id = item.getItemId();
                    if (id == R.id.action_edit) {
                        // handle settings
                        Toast.makeText(itemView.getContext(), "Edit", Toast.LENGTH_SHORT).show();
                        return true;
                    } else if (id == R.id.action_delete) {
                        Toast.makeText(itemView.getContext(), "Delete", Toast.LENGTH_SHORT).show();
                        return true;
                    }
                    else if (id == R.id.action_report) {
                        Toast.makeText(itemView.getContext(), "Report", Toast.LENGTH_SHORT).show();
                        return true;
                    }
                    return false;
                });
                popup.show();
            });
            //button = itemView.findViewById(R.id.buttonnn);
            //button.setOnClickListener(new View.OnClickListener() {
            // @Override
            //public void onClick(View view) {
            //  Toast.makeText(button.getContext(), "TEST" + pricetextview.getText(), Toast.LENGTH_SHORT).show();
            //if (isabuttonheld == true) {
            //button.setBackgroundColor(R.color.colorforheldbutton);
            //  button.setForeground(button.getContext().getDrawable(R.drawable.normalstate));
            //isabuttonheld = false;
            //}
            //}
            //});
            //button.setOnLongClickListener(new View.OnLongClickListener() {
            //  @Override
            //public boolean onLongClick(View view) {
            //  isabuttonheld = true;
            // button.setBackgroundColor(R.color.black);
            //Drawable f = button.getContext().getDrawable(R.drawable.heldstate);
            //button.setForeground(f);
            //button.setForeground(R.drawable.rippleeffect);
            //button.setForegroundColor(R.drawable.rippleeffect);
            //    return false;
            //}
            //});
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
            //}
        }
    }
}
