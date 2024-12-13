package org.example.Day13;

public class DeleteDuplicate {
    public static void main(String[] args) {
        String text="is is this is is a duble is is is a is";
        String[] words=text.split(" ");
        for(String word : words){
            int[] indexs=checker(words, word);
            deleteWithArrayIndex(words,indexs );
        }
       for(String word : words){
           if(word!=null){
               System.out.print(word+" ");
           }
       }
    }
    public static void deleteWithArrayIndex(String[] words,int[] indexs) {
        for (int index : indexs) {
            if(index!=-1){
                words[index] = null;
            }

        }
    }
    public static int[] checker(String[] words,String checkValue){
        int[] result = new int[words.length];
        boolean flag=false;
        int count=0;
        for(int i = 0; i < words.length; i++) {
            if(words[i]!=null && words[i].equals(checkValue)){
               if(flag){
                   result[count] =i ;
                   count++;
               }
                flag = true;
            }
                result[i]=-1;


        }
        return result;
    }
}
