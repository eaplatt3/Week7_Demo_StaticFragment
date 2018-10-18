import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.sickl.week7_demo_staticfragment.R;

public class fragment2 extends Fragment {

    Button clickbtn;
    TextView tv1;

    public fragment2() {


    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_2, container, false);

        clickbtn = v.findViewById(R.id.btn);
        tv1 = v.findViewById(R.id.fd_tv1);

        clickbtn.setOnClickListener(this::doSomething);


        return v;
    }

    public void doSomething(View v){
        tv1.setText("New Text");
    }

}
