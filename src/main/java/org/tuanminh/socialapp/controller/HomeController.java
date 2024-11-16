package org.tuanminh.socialapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Chỉ định HomeController là Controller
@Controller
public class HomeController {

    // khi user truy cập vào endpoint / thì homepage() được gọi
    @GetMapping("/")
    public String homepage() {
        return "index"; // trả về index.html
    }

    // Có thể mapping thêm các endpoint khác nữa...
}
