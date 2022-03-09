package id.ac.uin.latihan1.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class IndexController {
    @GetMapping("/hellow")
    public String hellow(){
        return "selamat belajar string boot";
    }
}
