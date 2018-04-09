package ru.startandroid.book_case;

import android.app.Activity;
import android.os.Bundle;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Bookshelf extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int numRow = 4;
        int numCol = 8;
        TableLayout tblLayout = (TableLayout) findViewById(R.id.tblLayout);
        for (int i = 0; i < numRow; i++) {
            HorizontalScrollView HSV = new HorizontalScrollView(this);
            HSV.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.FILL_PARENT));
            TableRow tblRow = new TableRow(this);
            tblRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
            tblRow.setBackgroundResource(R.drawable.bookshelf);
            tblRow.setPadding(1,1,1,1);
            for (int j = 0; j < numCol; j++) {
                ImageView imageView = new ImageView(this);
                imageView.setPadding(5,3,3,5);

                imageView.setImageResource(R.drawable.book);
                TextView textView = new TextView(this);
                textView.setText("Java Tester");
                textView.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));
                tblRow.addView(imageView, j);
            }
            HSV.addView(tblRow);
            tblLayout.addView(HSV, i);
        }
    }
}