package android.itis.mylistview;

import android.content.Context;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Амир on 18.10.2015.
 */
public class MyAdapter extends BaseAdapter{
    Context context;
    ArrayList<Information> objects;
    MyAdapter(Context mContext, ArrayList<Information> informations){
        context=mContext;
        objects=informations;
    }
    @Override
    public int getCount() {

        return objects.size();
    }
    static class ViewHolder {
        TextView tvInfo;
        TextView tvDate;
        TextView tvHeadline;
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

        View view=convertView;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item, parent, false);
          ViewHolder  viewHolder = new ViewHolder();
            viewHolder.tvInfo = (TextView) view.findViewById(R.id.tvInfo);
            viewHolder.tvDate = (TextView) view.findViewById(R.id.tvDate);
            viewHolder.tvHeadline = (TextView) view.findViewById(R.id.tvHeadline);
            view.setTag(viewHolder);
        }
        ViewHolder holder=(ViewHolder) view.getTag();

        Information information=objects.get(position);

               holder.tvInfo.setText(information.getInfo());
                holder.tvDate.setText(information.getDate());
                holder.tvHeadline.setText(information.getHeadline());


        return view;
    }
}
