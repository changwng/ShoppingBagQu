package com.shoppingbag.mlm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.shoppingbag.BuildConfig;
import com.shoppingbag.R;
import com.shoppingbag.model.response.mlmDashboardNew.NewsAndInfoItem;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DashBoardNewsInfoAdapter extends RecyclerView.Adapter<DashBoardNewsInfoAdapter.MzViewHolder> {

    private Context context;
    private List<NewsAndInfoItem> newsAndInfoItems;

    public DashBoardNewsInfoAdapter(Context context, List<NewsAndInfoItem> newsAndInfoItems) {
        this.context = context;
        this.newsAndInfoItems = newsAndInfoItems;
    }

    @NotNull
    @Override
    public DashBoardNewsInfoAdapter.MzViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DashBoardNewsInfoAdapter.MzViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.dashboard_banner_item_image, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DashBoardNewsInfoAdapter.MzViewHolder holder, final int position) {
        if (newsAndInfoItems == null || newsAndInfoItems.size() <= 0)
            return;

        Glide.with(context).load(newsAndInfoItems.get(position).getInfoImgUrl().replace("~", BuildConfig.BASE_URL_FORIMAGE))
                .apply(new RequestOptions().placeholder(R.drawable.image_not_available)
                        .error(R.drawable.image_not_available))
                .into(holder.imageView);

//        holder.imageView.setOnClickListener(v -> {
//            Bundle bundle = new Bundle();
//            bundle.putString("from", "Main");
//            bundle.putString("link", newsAndInfoItems.get(position).getInfoLink());
//            ((MainContainerMLM) context).goToActivity((Activity) context, WebViewActivity.class, bundle);
//        });
    }

    @Override
    public int getItemCount() {
        if (newsAndInfoItems != null) {
            return newsAndInfoItems.size();
        }
        return 0;
    }

    class MzViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        MzViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageTimer);
        }
    }

}
