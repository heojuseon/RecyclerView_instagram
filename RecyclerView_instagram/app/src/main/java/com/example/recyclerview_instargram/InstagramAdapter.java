package com.example.recyclerview_instargram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class InstagramAdapter extends RecyclerView.Adapter<InstagramAdapter.ViewHolder> {

    ArrayList<Instagram> items = new ArrayList<Instagram>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.instagram_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        Instagram item = items.get(position);
        viewHolder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;

        TextView name;
        TextView like;
        TextView tag;

        public ViewHolder(View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            imageView2 = itemView.findViewById(R.id.imageView2);
            imageView3 = itemView.findViewById(R.id.imageView3);
            imageView4 = itemView.findViewById(R.id.imageView4);
            imageView5 = itemView.findViewById(R.id.imageView5);

            name = itemView.findViewById(R.id.name);
            like = itemView.findViewById(R.id.like);
            tag = itemView.findViewById(R.id.tag);

        }

        public void setItem(Instagram item) {
            imageView.setImageResource(item.getImage());
            imageView2.setImageResource(item.getImage2());
            imageView3.setImageResource(item.getImage3());
            imageView4.setImageResource(item.getImage4());
            imageView5.setImageResource(item.getImage5());
        }
    }
    //어댑터가 각가의 아이템을 위한 Instagram 객체를 ArrayList 안에 넣어 관리하기 때문에
    //이 어댑터를 사용하는 소스 코드에서 어댑터에 Instagram 객체를 넣거나 가져갈 수 있도록
    //addItem( ), setItems( ), getItem( ), setItem( ) 메소드를 추가한다.

    //외부에서 RecyclerView에 데이터를 추가할 때 사용합니다.
    //매개변수로 User 데이터 관리 클래스의 값을 (image, username, likecount, hashtag) 등을 받아오는 역할을 합니다.
    //그 후 Adapter 클래스 안에 포함된 items 데이터 배열에 저장을 하여 추후 사용할 수 있도록 합니다.
    public void addItem(Instagram item){
        items.add(item);
    }
    public void setItems(ArrayList<Instagram> items){
        this.items = items;
    }
    public Instagram getItem(int position){
        return items.get(position);
    }
    public void setItem(int position, Instagram item){
        items.set(position, item);
    }
    //지금은 addItem만 사용
    //다른건 아직 안써도 된다.
}

