package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/math")
public class MathController{

    ArithmeticOperation division = new ArithmeticOperation("Division",2,"num1 diviso num2 = risultato",new String[]{"['num1','num2','risultato']"});

    @GetMapping("division-info")
    public String infoDivision(){
        return division.getDescription();
    }
    @GetMapping("moltiplicazione")
    public int moltiplicated(int num1, int num2){
        return num1*num2;
    }
    @GetMapping("square/{n}")
    public int square(@PathVariable int n){
        return n*n;
    }

}