package com.pw.paphat.testcustomlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by paphat on 2/1/2016 AD.
 */
public class CustomAdapter extends BaseAdapter {
    Context mContext;
    String[] strName;
    int[] resId;

    public CustomAdapter(Context context, String[] strName, int[] resId) {
        this.mContext = context;
        this.strName = strName;
        this.resId = resId;
    }

    @Override
    public int getCount() {
        return strName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = mInflater.inflate(R.layout.listview_row, parent, false);

        TextView textView = (TextView) view.findViewById(R.id.textView1);
        textView.setText(strName[position]);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView1);
        imageView.setBackgroundResource(resId[position]);
        return view;
    }
}
