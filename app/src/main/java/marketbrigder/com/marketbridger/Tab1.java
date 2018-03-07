package marketbrigder.com.marketbridger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab1 extends Fragment{
    String Product[]={"Ksh 100","Ksh 500"," Ksh 500"};
    String Price[];

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1_buy, container, false);
        return rootView;



    }



    public class   Tab1View{
        protected void onCreate(){

        }

    }

}

