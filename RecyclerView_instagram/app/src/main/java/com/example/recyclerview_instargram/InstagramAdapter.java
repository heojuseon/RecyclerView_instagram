package com.example.recyclerview_instargram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_instargram.Data.CfData;
import com.example.recyclerview_instargram.Data.InsData;
import com.example.recyclerview_instargram.Item.Cf_Item;
import com.example.recyclerview_instargram.Item.Ins_Item;

import java.util.ArrayList;

public class InstagramAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<Object> items = new ArrayList();

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        //2번째로 onCreateViewHolder 실행
        //리사이클러뷰에 보이는 레이아웃 구성을 설정

        if (viewType == 0) {
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            View itemView = inflater.inflate(R.layout.instagram_item, viewGroup, false);

            return new Ins_Item(itemView);

        } else if (viewType == 1) {
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            View itemView2 = inflater.inflate(R.layout.cf_item, viewGroup, false);

            return new Cf_Item(itemView2);
        }else{
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            View itemView = inflater.inflate(R.layout.instagram_item, viewGroup, false);

            return new Ins_Item(itemView);
        }
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {

        //3번째로 onBindViewHolder 실행
        //생성된 뷰홀더에 데이터를 바인딩 해주는 함수
        //items 데이터가 리스트의 4번째 데이터라면 position으로 4가 들어온다

        Object obj = items.get(position);

        if (obj instanceof InsData){
            InsData ins = (InsData) obj;
            Ins_Item insItem = (Ins_Item) viewHolder;
            insItem.setItem(ins);

        }else if (obj instanceof CfData){
            CfData cf = (CfData) obj;
            Cf_Item cfItem = (Cf_Item) viewHolder;
            cfItem.setItem(cf);

        }

    }

    @Override
    public int getItemCount() { //먼저 실행, ArrayList<InsData> items에 담겨있는 개수 반환(MainActivity에 addItem 총 5개)
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        Object obj = items.get(position);
        if (obj instanceof InsData){
            InsData ins = (InsData) obj;
            return  ins.getType();
        }else if (obj instanceof CfData){
            CfData cf = (CfData) obj;
            return  cf.getType();
        }

        return 0;
    }




    //어댑터가 각가의 아이템을 위한 InsData 객체를 ArrayList 안에 넣어 관리하기 때문에
    //이 어댑터를 사용하는 소스 코드에서 어댑터에 InsData 객체를 넣거나 가져갈 수 있도록
    //addItem( ), setItems( ), getItem( ), setItem( ) 메소드를 추가한다.

    //외부에서 RecyclerView에 데이터를 추가할 때 사용합니다.
    //매개변수로 User 데이터 관리 클래스의 값을 (image, username, likecount, hashtag) 등을 받아오는 역할을 합니다.
    //그 후 Adapter 클래스 안에 포함된 items 데이터 배열에 저장을 하여 추후 사용할 수 있도록 합니다.
    public void addItem(InsData item){
        items.add(item);
    }
    public void addItem2(CfData item){
        items.add(item);
    }

    //지금은 addItem만 사용
    //다른건 아직 안써도 된다.
}

