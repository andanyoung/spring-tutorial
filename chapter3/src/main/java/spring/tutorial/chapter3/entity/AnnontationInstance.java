package spring.tutorial.chapter3.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import spring.tutorial.chapter3.air.IAir;

import javax.annotation.Resource;

@Component
public class AnnontationInstance {
    @Value("abc")
    private String name;


    public void setName(String name) {
        this.name = name;
    }

    //@Resource与@Autowired两者选其一
    //	@Autowired
    //	@Qualifier(value="cleanAir")
    private IAir air;
    @Resource(name="cleanAir")
    public void setAir(IAir air) {
        this.air = air;
    }

    public void Breath()
    {
        System.out.println("Name:"+this.name+";Air:"+this.air.toString());
    }
}