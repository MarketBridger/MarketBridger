package marketbrigder.com.marketbridger;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by COLLINSB on 3/5/2018.
 */

public class MyAdapter extends ArrayAdapter<String> {
    String [] Product;
    String [] Price;

    Context context;
    public MyAdapter(Context context, String[] Product,String [] Price) {
        super(context,R.layout.activity_list);
        this.Product=Product;
        this.Price=Price;
        this.context=context;
    }

    @Override
    public int getCount() {

        return Product.length;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mview=new ViewHolder();
        if (convertView==null){
            LayoutInflater mFlater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=mFlater.inflate(R.layout.activity_list,parent,false);
            mview.txt_Product=(TextView) convertView.findViewById(R.id.txt_Product);
            mview.txt_Price=(TextView) convertView.findViewById(R.id.txt_Price);
          mview.image1=(ImageButton) convertView.findViewById(R.id.image);
            convertView.setTag(mview);
        }
        else{
            mview=(ViewHolder) convertView.getTag();
        }
        mview.txt_Price.setText(Price[position]);
        mview.txt_Product.setText(Product[position]);
        mview.image1.setImageResource(R.drawable.applogo);

        return convertView;
    }
    static class ViewHolder{
        TextView txt_Price;
        TextView txt_Product;
        ImageButton image1;
    }
}