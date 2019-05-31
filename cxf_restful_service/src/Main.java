import com.restful.pojo.User;
import com.restful.service.Service;
import com.restful.service.Serviecimpl;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class Main {

    /**
     *JaxWsServerFactoryBean:发布soap
     *JAXRSServerFactoryBean：发布rest
     */
    public static void main(String[] args) {

        JAXRSServerFactoryBean service = new JAXRSServerFactoryBean();

        //设置实体类
        service.setResourceClasses(User.class );

        //设置服务实现
        service.setServiceBean(new Serviecimpl ());

        //设置地址
        service.setAddress("http://127.0.0.1:12345/restful");

        //发布服务
        service.create();

    }
}
