package com.example.bookstore.domain;

import java.util.List;

public interface BookStoreService {
    public List<BookStore> showAll();

    public void input(int id, int add);

    public void sellOut(int id, int out);
}
