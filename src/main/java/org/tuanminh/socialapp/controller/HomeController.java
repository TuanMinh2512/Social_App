package org.tuanminh.socialapp.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
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

interface Engine {
    public void run();
}

@Component
@Primary
class EngineVN implements Engine {
    @Override
    public void run() {
        System.out.println("Dong co VN");
    }
}

@Component
class EngineChiNa implements Engine{
    @Override
    public void run() {
        System.out.println("Dong co China");
    }
}

@Component
class Car{
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
}