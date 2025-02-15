package org.example.Day23;

public class CustomArrayListObject {
    private static Object[] objects=new Object[30];
    public int index=0;
    public void add(Object object){
        objects[index]=object;
        index++;
    }
    public void remove(Object object){
        for(int i=0;i<index;i++){
            if(objects[i].equals(object)){
                for(int j=i;j<index-1;j++){
                    objects[j]=objects[j+1];
                }
                index--;
                break;
            }
        }
    }
    public void display(){
        for(int i=0;i<index;i++){
            System.out.println(objects[i]);
        }
    }
    public Object getObjectByIndex(int index){
        return objects[index];
    }

}
