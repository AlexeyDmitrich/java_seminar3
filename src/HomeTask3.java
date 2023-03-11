import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
public class HomeTask3 {
    public static void main(String[] args) {
        ArrayList usersList = createRandomList();
        System.out.println(usersList);
        int max = findMax(usersList);
        int min = findMin(usersList);
        double middle = findMiddle(usersList);
        double median = findMedian(usersList);
        System.out.printf("Максимальное значение = %d \nМинимальное значение = %d \nСреднее значение = %.2f \nМедианное значение = %.2f", max, min, middle, median);
    }
    public static ArrayList createRandomList (){
        Random rnd = new Random();
        int[] workingArr = new int[rnd.nextInt(41-10)+10];
        fill.RandInt(workingArr, -10,250);
        ArrayList workingList = new ArrayList();
        for (int num:
                workingArr) {
            workingList.add(num);
        }
        return workingList;
    }

    public static int findMax (ArrayList usersList){
        int max = (int) usersList.get(0);
        for (int i = 1; i < usersList.size(); i++) {
            if ((int)(usersList.get(i))>max){
                max = (int)usersList.get(i);
            }
        }
        return max;
    }

    public static int findMin (ArrayList usersList){
        int min = (int)usersList.get(0);
        for (int i = 1; i < usersList.size(); i++) {
            if ((int)usersList.get(i)<min){
                min = (int)usersList.get(i);
            }
        }
        return min;
    }


    public static double findMiddle(ArrayList<Integer> usersList){
        double middle;
        double sumList = 0;
        for (int i = 0; i < usersList.size(); i++) {
            sumList += usersList.get(i);
        }
        middle = sumList/(double) usersList.size();
        return middle;
    }

    public static double findMedian(ArrayList<Integer> usersList){
        usersList.sort(Comparator.naturalOrder());
        System.out.println(usersList);
        int bigHalf = usersList.get(usersList.size()-1);
        int bigVal = usersList.get(usersList.size()-1);;
        int smallHalf = usersList.get(0);
        int smallVal = usersList.get(0);;
        int i = 1;
        int j = usersList.size()-2;
        while (i<j){
            bigVal = usersList.get(j);
            smallVal = usersList.get(i);
            bigHalf += usersList.get(j);
            smallHalf += usersList.get(i);
            if (smallVal < bigVal && smallHalf < bigHalf){
                i++;
            }
            if (smallVal < bigVal && smallHalf < bigHalf){
                j--;
            }

            System.out.println("B : "+ bigVal + "  \t S : " + smallVal + " ");
            System.out.println("BH : "+ bigHalf + "  \t SH : " + smallHalf + " ");
        }

//        System.out.println("B : "+ bigVal + "  \t S : " + smallVal + " ");
//        System.out.println("BH : "+ bigHalf + "  \t SH : " + smallHalf + " ");

        double median = (double)(bigVal+smallVal)/2;
        return median;
    }
}
