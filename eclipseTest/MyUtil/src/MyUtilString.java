public class MyUtilString {

    public static void main(String[] args) {
        
        String[] strlist = "hjhjhjh.java kkjkkkkk.java kjlfjljlj.java".split(" ");

        
        strChange(strlist);
        
    }
    
    public static void strChange(String[] strlist) {
        
        for(String str : strlist) {
            
             System.out.println(str.replaceAll(".java", ".class") + ",");
          
             
             
             System.out.println(str.replaceAll(".java", ".class") + ",");
             
             
             
             
             
             
             
             
             
             System.out.println(str.replaceAll(".java", ".class") + ",");
        }
    }

}
