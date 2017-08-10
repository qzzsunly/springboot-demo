package life.qzz.springboot.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/servlet",loadOnStartup = 0, initParams=@WebInitParam(name = "developer.name", value = "来自servlet config"))
public class MyServlet extends HttpServlet {

    private Logger logger = LoggerFactory.getLogger(MyServlet.class);

    @Value("${name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void init() throws ServletException {
        System.out.println("init servlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.debug("属性：{}",name);
    }
}
