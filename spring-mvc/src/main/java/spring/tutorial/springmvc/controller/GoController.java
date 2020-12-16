package spring.tutorial.springmvc.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GoController implements EnvironmentAware {

  private final Log logger = LogFactory.getLog(GoController.class);
  private Environment environment = null;

  @RequestMapping(
      value = {"/"},
      method = {RequestMethod.HEAD})
  public String head() {
    return "go.jsp";
  }

  @RequestMapping(
      value = {"/index", "/"},
      method = {RequestMethod.GET})
  public String index(Model model) throws Exception {

    logger.info("======processed by index=======");
    // 这里设置断点
    model.addAttribute("msg", "Go Go Go!");
    return "go.jsp";
  }

  @Override
  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }
}
