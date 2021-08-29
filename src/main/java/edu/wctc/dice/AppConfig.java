package edu.wctc.dice;

import edu.wctc.dice.iface.GameInput;
import edu.wctc.dice.iface.GameOutput;
import edu.wctc.dice.iface.DieRoller;
import edu.wctc.dice.impl.PopupInput;
import edu.wctc.dice.impl.PopupOutput;
import edu.wctc.dice.impl.DeeTwenty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.dice")
public class AppConfig {
    @Bean
    public GameOutput gameOutput() {
//        return new ConsoleOutput();
        return new PopupOutput();
    }

    @Bean
    public GameInput gameInput() {
//        return new ConsoleInput();
        return new PopupInput();
    }
    @Bean
    public DieRoller dieRoller() {
        return new DeeTwenty();
        //return new DeeFour();
    }
}
