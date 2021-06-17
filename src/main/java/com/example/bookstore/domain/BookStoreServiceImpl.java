package com.example.bookstore.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class BookStoreServiceImpl implements BookStoreService {
    @Autowired
    BookStoreMapper bookStoreMapper;

    @Override
    public List<BookStore> showAll() {
        return bookStoreMapper.showAll();
    }

    @Override
    public void input(int id, int add) {
        BookStore bookStore = bookStoreMapper.selectById(id);
        int num = add + bookStore.getNum();
        bookStoreMapper.update(id, num);
    }

    @Transactional
    @Override
    public void sellOut(int id, int out) {
        BookStore bookStore = bookStoreMapper.selectById(id);
        int num = bookStore.getNum() + out;
        bookStoreMapper.update(id, num);
//        int i = 1 / 0;
        input(1, -out);

    }
}