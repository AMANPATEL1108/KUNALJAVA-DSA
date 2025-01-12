import java.util.ArrayList;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String str="G()(al)";
        System.out.println(interpret(str));
    }
    public static String interpret(String command) {
        String newstr="";

        ArrayList<Character> arrayList=new ArrayList();

        for(int i=0;i< command.length();i++){
            arrayList.add(command.charAt(i));
        }

        for(int i=0;i<command.length();i++){
            if (arrayList.get(i) == '(' && arrayList.get(i+1)== ')' ){
                    newstr+='o';
            }else if(arrayList.get(i) != '(' && arrayList.get(i) != ')'){
                    newstr+=arrayList.get(i);
            }


        }


        return newstr;
    }
}
