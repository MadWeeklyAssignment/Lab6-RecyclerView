package com.example.recyclerchallenge;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

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

   import android.view.MenuItem;

import java.util.LinkedList;
import java.util.Objects;

        public class MainActivity extends AppCompatActivity {
            // LinkedList to hold the data
            private final LinkedList<String> mWordList = new LinkedList<>();
            private RecyclerView mRecyclerView;
            private WordListAdapter mAdapter;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                @@ -34,24 +35,24 @@ protected void onCreate(Bundle savedInstanceState) {
                    @Override
                    public void onClick(View view) {
                        int wordListSize = mWordList.size();
                        // Add a new word to the wordList.
                        // add new word to the linked list
                        mWordList.addLast("+ Word " + wordListSize);
                        // Notify the adapter, that the data has changed.
                        mRecyclerView.getAdapter().notifyItemInserted(wordListSize);
                        // Scroll to the bottom.
                        // notify adapter of data change
                        Objects.requireNonNull(mRecyclerView.getAdapter()).notifyItemInserted(wordListSize);
                        // scroll to the bottom of the list
                        mRecyclerView.smoothScrollToPosition(wordListSize);
                    }
                });
                for (int i = 0; i < 20; i++) {
                    mWordList.addLast("Word " + i);

                    // populate the initial data
                    for (int i = 1; i < 21; i++) {
                        mWordList.add("Word " + i);
                    }
                    // Get a handle to the RecyclerView.

                    // set up recyclerView - find view, create and set adapter; set layout manager
                    mRecyclerView = findViewById(R.id.recyclerview);
                    // Create an adapter and supply the data to be displayed.
                    mAdapter = new WordListAdapter(this, mWordList);
                    // Connect the adapter with the RecyclerView.
                    WordListAdapter mAdapter = new WordListAdapter(this, mWordList);
                    mRecyclerView.setAdapter(mAdapter);
                    // Give the RecyclerView a default layout manager.
                    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
                }

                @@ -68,12 +69,15 @@ public boolean onOptionsItemSelected(MenuItem item) {
                    // automatically handle clicks on the Home/Up button, so long
                    // as you specify a parent activity in AndroidManifest.xml.
                    int id = item.getItemId();

                    //noinspection SimplifiableIfStatement
                    if (id == R.id.action_settings) {
                        mWordList.clear();
                        for (int i = 1; i < 21; i++) {
                            mWordList.add("Word " + i);
                        }
                        Objects.requireNonNull(mRecyclerView.getAdapter()).notifyDataSetChanged();
                        return true;
                    }

                    return super.onOptionsItemSelected(item);
                }
            }
 82  RecyclerViewChallenge/app/src/main/java/com/example/recyclerview/WordListAdapter.java
            @@ -11,63 +11,71 @@

                    import java.util.LinkedList;

            public class WordListAdapter extends
                    RecyclerView.Adapter<WordListAdapter.WordViewHolder>  {

                public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
                    private final LinkedList<String> mWordList;
                    private LayoutInflater mInflater;

                    // a ViewHolder class is required to describe a view item and its position within the recycler view
                    // prepare data in a ViewHolder
                    // viewHolder initializes items for the RecyclerView (efficiency)
                    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
                        final TextView wordItemView;

                        final WordListAdapter mAdapter;
                    }
                }
            }