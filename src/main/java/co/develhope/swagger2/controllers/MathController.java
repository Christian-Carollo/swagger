package co.develhope.swagger2.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/MathController")
public class MathController {

    @GetMapping("")
    public String welcome(){
        return "Benvenuto in math";
    }

    @GetMapping("division")
    public int division(@RequestParam int num1, @RequestParam int num2){
        return num1 / num2;
    }

    @GetMapping("multiplication")
    public int multiplication(@RequestParam int num1, @RequestParam int num2){
        return num1 * num2;
    }

    @GetMapping("radice_quadrata")
    public int radice_quadrata(@RequestParam int n){
        return n * n;
    }
}
