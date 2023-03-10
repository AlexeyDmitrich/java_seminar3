import java.util.ArrayList;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class HomeTask2 {
    public static void main(String[] args) {
        ArrayList <Integer> usersList = createRandomList();
        System.out.println(usersList);
        System.out.println(cleanList(usersList));
    }

    public static ArrayList<Integer> createRandomList (){
        Random rnd = new Random();
        int[] workingArr = new int[rnd.nextInt(21-10)+10];
        fill.RandInt(workingArr, -10,10);
        ArrayList <Integer> workingList = new ArrayList<Integer>();
        for (int num:
             workingArr) {
            workingList.add(num);
        }
        return workingList;
    }

    public static ArrayList<Integer> cleanList(ArrayList<Integer> usersArray){
        for (int i = usersArray.size()-1; i >= 0 ; i--) {
            if (usersArray.get(i)%2==0) {
                usersArray.remove(i);
            }
        }
        return usersArray;
    }

}
