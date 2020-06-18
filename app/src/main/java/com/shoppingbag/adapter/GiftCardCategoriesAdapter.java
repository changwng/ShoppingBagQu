package com.shoppingbag.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shoppingbag.model.giftCardResponse.AddinfoItem;
import com.shoppingbag.retrofit.MvpView;
import com.shoppingbag.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GiftCardCategoriesAdapter extends RecyclerView.Adapter<GiftCardCategoriesAdapter.ViewHolder> {

    private Context mContext;
    private List<AddinfoItem> list;
    private MvpView mvpView;

    public GiftCardCategoriesAdapter(Context context, List<AddinfoItem> list, MvpView mvp) {
        mContext = context;
        this.list = list;
        mvpView = mvp;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_giftcard_categories, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int listPosition) {

        holder.tv_category_name.setText(list.get(listPosition).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_category_name)
        TextView tv_category_name;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            tv_category_name.setOnClickListener(v -> mvpView.getGiftCardCategoryId(list.get(getAdapterPosition()).getId(), list.get(getAdapterPosition()).getName()));
        }
    }


}

