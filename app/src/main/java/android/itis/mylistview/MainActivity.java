package android.itis.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lView = (ListView) findViewById(R.id.lview);
     //   MyAdapter adapter = new MyAdapter(this, fillData());// с использованием viewholder
        MySimpleAdapter adapter= new MySimpleAdapter(this,fillData()); // обычный адаптер
        lView.setAdapter(adapter);
        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Information info = (Information) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, info.getHeadline(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
    private ArrayList<Information> fillData(){
        ArrayList<Information> list=new ArrayList();
        list.add(new Information(new java.util.Date ().toString (),"Listview practice","Android "));
        list.add(new Information(new java.util.Date ().toString (),"learning adapters","Practice"));
        return list;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
