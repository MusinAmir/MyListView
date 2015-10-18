package android.itis.mylistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Амир on 18.10.2015.
 */
public class MySimpleAdapter  extends BaseAdapter {
    Context context;
    ArrayList<Information> objects;
    MySimpleAdapter(Context mContext, ArrayList<Information> informations){
        context=mContext;
        objects=informations;
    }
    @Override
    public int getCount() {

        return objects.size();
    }


    @Override
    public Object getItem(int position) {

        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
          View view = inflater.inflate(R.layout.item, parent, false);

          TextView tvInfo = (TextView) view.findViewById(R.id.tvInfo);
           TextView tvDate = (TextView) view.findViewById(R.id.tvDate);
          TextView tvHeadline = (TextView) view.findViewById(R.id.tvHeadline);


        Information information=objects.get(position);

        tvInfo.setText(information.getInfo());
        tvDate.setText(information.getDate());
        tvHeadline.setText(information.getHeadline());

        return view;
    }
}
