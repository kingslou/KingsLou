package com.lou.kings.kingslou.adapter.holder;

import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

import com.lou.kings.kingslou.R;

/**
 * Created by YiMuTian on 2016/6/10.
 */
public class BaseViewHolder extends RecyclerView.ViewHolder {

    protected final SparseArray<View> sparseArray;
    protected View mView;

    public BaseViewHolder(View itemView) {
        super(itemView);
        this.mView = itemView;
        sparseArray = new SparseArray<>();
    }

    public <T extends View> T getView(@IdRes int viewId){
        View view  = sparseArray.get(viewId);
        if(view==null){
            view = mView.findViewById(viewId);
            sparseArray.put(viewId,view);
        }
        return (T)view;
    }

    public View getmView(){
        return mView;
    }


}
