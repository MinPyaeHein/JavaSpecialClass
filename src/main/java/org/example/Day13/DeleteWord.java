package org.example.Day13;

public class DeleteWord {
    public static void main(String[] args) {
        String text="this is a cat is a cute cat";
        String delete="is";

        String result=deleteWork(text.split(" "), delete);
        System.out.println("Text after deleting '"+delete+"': "+result.trim());

    }
    public static String deleteWork(String[] words, String delete){
        String result="";
        for(String word: words){
            if(!word.equals(delete)){
                result+=word+" ";
            }
        }
        return result;
    }
}
