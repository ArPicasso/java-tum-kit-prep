package Tag13_Uberladung;

import java.util.concurrent.Callable;

public class main {
    public static void main(String[] args){
        CreatePerson createPerson = new CreatePerson(14, "Pavel", "123213131");
        CreatePerson createPerson1 = new CreatePerson(13, "Pavel");
        CreatePerson[] array = {createPerson,createPerson1};
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i].alter + array[i].name + array[i].telefon);
        }
        }
}

