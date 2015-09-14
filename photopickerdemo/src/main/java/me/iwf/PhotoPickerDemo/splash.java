package me.iwf.PhotoPickerDemo;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

/*********************************************************************************
 * Project Name  : PhotoPicker
 * Package       : me.iwf.PhotoPickerDemo
 *
 * @AUTHOR by 肖齐
 * 邮箱：xiaoqi262@163.com
 * Created by 2015/8/30 10:31.
 * <p/>
 * <p/>
 * ********************************************************************************
 */
public class splash extends AppCompatActivity {
    private ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        pb = (ProgressBar) findViewById(R.id.progressBar1);
        new MyAsy().execute("", "", "");
    }
    
    public class MyAsy extends AsyncTask<String,String,String>{


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pb.setVisibility(View.VISIBLE);
        }

        @Override
        protected String doInBackground(String... params) {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }


        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            pb.setVisibility(View.INVISIBLE);
            Intent it = new Intent(splash.this,MainActivity.class);
            startActivity(it);
            finish();
        }
    }
    
    
    
    
    
    
}