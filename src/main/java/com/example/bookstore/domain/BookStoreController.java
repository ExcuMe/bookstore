package com.example.bookstore.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookStoreController {
    @Autowired
    BookStoreService bookStoreService;

    @RequestMapping("/")
    public String hello(ModelAndView mv, Model model){
        List<BookStore> bookStores = bookStoreService.showAll();
        model.addAttribute("bookStores",bookStores);
        return "bookstore";
    }

    @RequestMapping("/input")
    public String input(int id, int add){
        bookStoreService.input(id, add);
        return "redirect:/";
    }

    @RequestMapping("/sellOut")
    public String sellOut(int id, int out) {
        bookStoreService.sellOut(id,out);
        return "redirect:/";
    }

}
