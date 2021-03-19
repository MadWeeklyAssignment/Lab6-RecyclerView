package com.example.recyclerview;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity<WordListAdapter> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    // Get the position of the item that was clicked.
    int mPosition = getLayoutPosition();
    // Use that to access the affected item in mWordList.
    String element = mWordList.get(mPosition);
// Change the word in the mWordList.
mWordList.set(mPosition, "Clicked! " + element);
// Notify the adapter, that the data has changed so it can
// update the RecyclerView to display the data.
mAdapter.notifyDataSetChanged();
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
    import android.view.Menu;
import android.view.MenuItem;

import java.util.LinkedList;
fab.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            int wordListSize = mWordList.size();
            // Add a new word to the wordList.
            mWordList.addLast("+ Word " + wordListSize);
            // Notify the adapter, that the data has changed.
            mRecyclerView.getAdapter().notifyItemInserted(wordListSize);
            // Scroll to the bottom.
            mRecyclerView.smoothScrollToPosition(wordListSize);
        }
        private RecyclerView mRecyclerView;
        private WordListAdapter mAdapter;
        @Override
        public void onClick(View view) {
            int wordListSize = mWordList.size();
            // Add a new word to the wordList.
            mWordList.addLast("+ Word " + wordListSize);
            // Notify the adapter, that the data has changed.
            mRecyclerView.getAdapter().notifyItemInserted(wordListSize);
            // Scroll to the bottom.
            mRecyclerView.smoothScrollToPosition(wordListSize);
        }