package com.example.appxephinh.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.appxephinh.Adapter.AdapterConVat;
import com.example.appxephinh.Model.ConVat;
import com.example.appxephinh.R;
import com.example.appxephinh.SuKienInterface.ItemClick;

import java.util.ArrayList;

public class TrangChuActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    ArrayList<ConVat> arrayList;
    AdapterConVat adapterConVat ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        mRecyclerView = findViewById(R.id.recy_danh_sach_dong_vat);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
       arrayList = new ArrayList<>();
        arrayList.add(new ConVat(1,R.drawable.dog));
        arrayList.add(new ConVat(2,R.drawable.cat));
        arrayList.add(new ConVat(3,R.drawable.rong));
        arrayList.add(new ConVat(4,R.drawable.lon));
        arrayList.add(new ConVat(5,R.drawable.sutu));
        arrayList.add(new ConVat(6,R.drawable.daibang));
        arrayList.add(new ConVat(6,R.drawable.cavang));
        arrayList.add(new ConVat(6,R.drawable.bo));
        adapterConVat = new AdapterConVat(this, arrayList, new ItemClick() {
            @Override
            public void clickDog() {
                startActivity(new Intent(TrangChuActivity.this,DogActivity.class));
            }

            @Override
            public void clickCat() {
                startActivity(new Intent(TrangChuActivity.this,CatActivity.class));
            }

            @Override
            public void clickRong() {
                startActivity(new Intent(TrangChuActivity.this,RongActivity.class));
            }

            @Override
            public void clickHeo() {
                startActivity(new Intent(TrangChuActivity.this,HeoActivity.class));
            }

            @Override
            public void clickSuTu() {
                startActivity(new Intent(TrangChuActivity.this,SuTuActivity.class));
            }

            @Override
            public void clickDaiBang() {
                startActivity(new Intent(TrangChuActivity.this,DaiBangActivity.class));
            }

            @Override
            public void clickCaVang() {
                startActivity(new Intent(TrangChuActivity.this,CatActivity.class));
            }

            @Override
            public void clickBoSua() {
                startActivity(new Intent(TrangChuActivity.this,BoSuaActivity.class));
            }
        });
        mRecyclerView.setAdapter(adapterConVat);

    }
}