package kr.tjeit.a20181229_01_spinnertest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

public abstract class  BaseActivity extends AppCompatActivity{

    public Context mContext = this;

    public abstract void setupEvents();
    public abstract void setvalues();
    public abstract void bindviews
            ();

}
