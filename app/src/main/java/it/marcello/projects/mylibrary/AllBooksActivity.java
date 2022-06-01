package it.marcello.projects.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {

    private RecyclerView booksRecView;
    private BookRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

        adapter = new BookRecViewAdapter(this);
        booksRecView = findViewById(R.id.booksRecView);

        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1,"Ready Player One", "Ernest Cline", 460, "https://www.ibs.it/images/9788804741831_0_536_0_75.jpg",
                "Engaging Sci-Fi Novel", "Long Description"));
        books.add(new Book(2,"The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 167, "https://images-na.ssl-images-amazon.com/images/I/81XSN3hA5gL.jpg",
                "Comedy Sci-Fi Novel ", "Long Description"));
        adapter.setBooks(books);
    }
}