import org.junit.Test;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Time: 2020/7/20
 *
 * @author PZH
 */
public class Terstt {
    public static void main(String[] args) {
        test001();
    }
    public static String test001(){
        try{
            System.out.println("==============");
            System.exit(1);     //使用System.exit(1) 退出虚拟机的方法，会使得finally中的方法不会被执行
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("123456");
        }
        return null;
    }

    @Test
    public void Testt(){
        String[] str = {"张三","李四","王五"};
        List list = Arrays.asList(str);
        List list1 = new ArrayList();
        list1.add("zhangsan ");
        list1.add("lisi ");
        System.out.println(list.get(1));
        System.out.println(list.toString());
        System.out.println(Arrays.toString(list1.toArray()));
        String s = "asdfghjkl";
        int length = s.length();
        String left = s.substring(0, length / 2);
        String right = s.substring(length / 2, length);
        System.out.println(right+left);
    }

    @Test
    public void Tese(){
        List list = new ArrayList();
        String str = "i am god god god";
        String str1 = str.replace(" ","");
        System.out.println(str1);
        int cout=0;
        Set set = new HashSet(str1.length());
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == 'g'){
                cout++;
            }

        }
        System.out.println(cout);
    }

    @Test
    public void test01(){
        Double d = 0.222;
        Map<String , Object> map1 = new HashMap<>();
        map1.put("1",d);
        System.out.println(d.toString());
        System.out.println(map1.get("1").toString());

        Map<String,Object> map = new HashMap<>();
        List<Map<String,Object>> list = new ArrayList<>();
        map.put("1","张三");
        map.put("2",0.222);
        map.put("3",5);
        System.out.println(map.get("5")==null?"":"1");
        list.add(map);
        String s = "张三";
        System.out.println((Object) s);
        System.out.println(String.valueOf(0));
        for(int i = 0; i < list.size() ;i ++){
            Map<String,Object> resultmap = list.get(i);
            System.out.println(resultmap.get("1").toString());
        }
    }

    @Test
    public void test02() throws ParseException {
        Date date = new Date();
        System.out.println(date);

        String s = "2020-01-01";
        System.out.println(new Date(s));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
    }
    @Test
    public void test03(){
        String d = "-1.0E7";
        System.out.println(NumberFormat.getInstance().format(Double.valueOf(d)));
       // System.out.println(new BigDecimal(d).toPlainString());

        List list = new ArrayList();
        Map<String,Object> map = new HashMap<>();
       // list.add(map);
        System.out.println(list.size());
    }
    volatile boolean a = true;
    @Test
    public void test002(){
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(a);
            }).start();
        }
    }


}
