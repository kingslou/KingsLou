package com.lou.kings.kingslou.adapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.lou.kings.kingslou.adapter.holder.BaseViewHolder;
import com.lou.kings.kingslou.interfaces.OnItemClick;

/**
 * 通用Adapter基础类
 * Created by YiMuTian on 2016/6/10.
 */
public abstract class BaseAdapter extends RecyclerView.Adapter<BaseViewHolder>{

    private OnItemClick onItemClick;

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BaseViewHolder(LayoutInflater.from(parent.getContext()).inflate(viewType,parent,false));
    }

    @Override
    public void onBindViewHolder(final BaseViewHolder holder, int position) {
        if(onItemClick==null){
            holder.getmView().setClickable(true);
            holder.getmView().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClick.onItemClick(holder.getAdapterPosition());
                }
            });
        }
        onBindViewHolder(holder,holder.getAdapterPosition());
    }

    protected abstract void onBindView(BaseViewHolder holder,int position);

    protected abstract int getLayoutId(int position);

    @Override
    public int getItemViewType(int position) {
        return getLayoutId(position);
    }

    public void setOnItemClick(OnItemClick onItemClick){
        this.onItemClick = onItemClick;
    }
}
