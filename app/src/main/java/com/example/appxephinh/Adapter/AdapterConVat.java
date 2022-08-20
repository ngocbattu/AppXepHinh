package com.example.appxephinh.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.appxephinh.Model.ConVat;
import com.example.appxephinh.R;
import com.example.appxephinh.SuKienInterface.ItemClick;

import java.util.List;

public class AdapterConVat extends RecyclerView.Adapter<AdapterConVat.ViewHodelConVat>{
    private Context context;
    private List<ConVat> list;
    ItemClick itemClick;

    public AdapterConVat(Context context, List<ConVat> list, ItemClick itemClick) {
        this.context = context;
        this.list = list;
        this.itemClick = itemClick;
    }

    @NonNull
    @Override
    public ViewHodelConVat onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recy_view_danh_sach_con_vat,null);
        return new ViewHodelConVat(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull ViewHodelConVat holder, int position) {
        ConVat conVat = list.get(position);
        Glide.with(context).load(conVat.getImageConVat()).into(holder.imageConVat);
        holder.click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position){
                    case 0 :
                        itemClick.clickDog();
                        break;
                    case 1 :
                        itemClick.clickCat();
                        break;
                    case 2 :
                        itemClick.clickRong();
                        break;
                    case 3 :
                        itemClick.clickHeo();
                        break;
                    case 4 :
                        itemClick.clickSuTu();
                        break;
                    case 5 :
                        itemClick.clickDaiBang();
                        break;
                    case 6 :
                        itemClick.clickCaVang();
                        break;
                    case 7 :
                        itemClick.clickBoSua();
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHodelConVat extends RecyclerView.ViewHolder{

    ImageView imageConVat;
    ConstraintLayout click;
        public ViewHodelConVat(@NonNull View itemView) {
            super(itemView);
            imageConVat = itemView.findViewById(R.id.image_con_vat);
            click = itemView.findViewById(R.id._contrain_con_vat);
        }
    }
}
