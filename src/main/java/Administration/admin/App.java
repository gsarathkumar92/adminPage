package Administration.admin;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Administration.config.AppConfig;
import Administration.user.bo.UserBo;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Main Method" );
        try{
        ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
      //  System.out.println( "Main Method1" );
        JSONObject obj1=new JSONObject("{fname:alexander,lname:immanuel}");
        JSONObject obj=new JSONObject(obj1);
        String s1= obj1.getString("fname");
        String s2=obj1.getString("lname");
        System.out.println(s1+" "+s2);
         UserBo userBo=(UserBo) ac.getBean("dao");
        
       userBo.save(s1, s2);
        }catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
}
