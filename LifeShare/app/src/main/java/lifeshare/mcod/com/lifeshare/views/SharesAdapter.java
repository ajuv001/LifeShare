package lifeshare.mcod.com.lifeshare.views;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import lifeshare.mcod.com.lifeshare.R;

/**
 * Created by aju.vidyadharan on 13-12-2016.
 */

public class SharesAdapter extends RecyclerView.Adapter<SharesAdapter.SharesViewHolder>{

    private ArrayList<ShareDto> list;

    public SharesAdapter(ArrayList<ShareDto> list){
        this.list = list;
    }

    @Override
    public SharesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_shares_item, parent, false);

        return new SharesViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SharesViewHolder holder, int position) {
        holder.txtTitle.setText(list.get(position).getTitle());
        holder.txtTime.setText(list.get(position).getTime());
        holder.txtQty.setText(list.get(position).getQty());
        if(list.get(position).getCategory() == 0)
        {
            holder.imgCategory.setImageResource(R.mipmap.food_color_ico);
        }
        else if(list.get(position).getCategory() == 1)
        {
            holder.imgCategory.setImageResource(R.mipmap.cloths_color_ico);
        }
        else if(list.get(position).getCategory() == 2)
        {
            holder.imgCategory.setImageResource(R.mipmap.households_color_ico);
        }
        else if(list.get(position).getCategory() == 3)
        {
            holder.imgCategory.setImageResource(R.mipmap.households_color_ico);
        }
        if(list.get(position).getReceivedBy() != null )
            holder.txtReceivedBy.setText(list.get(position).getReceivedBy());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class SharesViewHolder extends RecyclerView.ViewHolder{
        public TextView txtTitle, txtTime, txtQty, txtReceivedBy;
        public ImageView imgCategory;

        public SharesViewHolder(View view){
            super(view);
            txtTitle = (TextView) view.findViewById(R.id.txtTitle);
            txtTime = (TextView) view.findViewById(R.id.txtPostedOn);
            txtQty = (TextView) view.findViewById(R.id.txtQty);
            txtReceivedBy = (TextView) view.findViewById(R.id.txtReceivedBy);
            imgCategory = (ImageView) view.findViewById(R.id.img_cat_image);
        }
    }
}
