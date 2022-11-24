package com.codeonce.controller;

import com.codeonce.pojo.Books;
import com.codeonce.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    // controller 调用 service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    // 查询全部的书籍,并且返回到一书籍展示的页面
    @RequestMapping("/allBook")
    public String queryAll(Model model) {
        List<Books> booksList = bookService.queryAllBook();
        model.addAttribute("booksList", booksList);
        return "allBook";
    }

    // 跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddBookPaper() {
        return "addBook";
    }

    // 添加书籍的请求
    @RequestMapping("/addBook")
    public String insertBook(Books books) {
        System.out.println("addBook=>" + books);
        int result = bookService.insertBook(books);
        if (result > 0) {
            System.out.println("添加数据成功" + books);
        }
        return "redirect:/book/allBook";
    }

    // 跳转到修改书籍页面
    @RequestMapping("/toUpdateBook/{bookID}")
    public String toUpdateBookPaper(@PathVariable("bookID") int id, Model model) {
        Books books = bookService.queryBookById(id);
        model.addAttribute("books", books);
        return "updateBook";
    }

    // 修改书籍请求
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        System.out.println("updateBook=>" + books);
        int result = bookService.updateBook(books);
        if (result > 0) {
            System.out.println("修改数据成功" + books);
        }
        return "redirect:/book/allBook";
    }

    // 删除书籍请求
    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id) {
        int result = bookService.deleteBook(id);
        if (result > 0) {
            System.out.println("删除数据成功" + id);
        }
        return "redirect:/book/allBook";
    }

}
