package tdm2018.ittepic.edu.tdm2018_u1_115_rv_cardview;


import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jair on 22/02/2018.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private Context mCtx;
    private List<DataProvider> productList;

    public ProductAdapter(Context mCtx, List<DataProvider> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }
    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.card_layout,null);

        ProductViewHolder holder = new ProductViewHolder(view);

        return holder;
    }
    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        DataProvider product = productList.get(position);
        holder.textViewTitle.setText(product.getTitle());
        holder.textViewDesc.setText(product.getShortdesc());
        holder.textViewRating.setText(String.valueOf(product.getRating()));
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
        if (position == 0){
            holder.itemView.setBackgroundColor(Color.parseColor("#00CC00"));
        }
        if (position == 1){
            holder.itemView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        if (position == 2){
            holder.itemView.setBackgroundColor(Color.parseColor("#DD0000"));
        }
        if (position == 3){
            holder.itemView.setBackgroundColor(Color.parseColor("#8b0255"));
            if (position == 4){
                holder.itemView.setBackgroundColor(Color.parseColor("#2a7b7c"));
            }
            if (position == 5){
                holder.itemView.setBackgroundColor(Color.parseColor("#6f056b"));
            }
            if (position == 6){
                holder.itemView.setBackgroundColor(Color.parseColor("#8b0255"));
            }
        }

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textViewTitle,textViewDesc,textViewRating;

        public ProductViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textView1);
            textViewDesc = itemView.findViewById(R.id.textView2);
            textViewRating = itemView.findViewById(R.id.textView3);
        }
    }
}
