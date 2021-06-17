package com.example.bookstore.domain;

public class BookStore {
    private Integer id;
    private String status;
    private Integer num;

    @Override
    public String toString() {
        return "BookStore{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", num=" + num +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
