package pratic11;

import java.util.*;

public class Main11 {
    public static  void main(String[] args) {

        int[] numAleatory = new  int[10];

        Random random = new Random();
        for (int i = 0; i < numAleatory.length; i++){
            numAleatory[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(numAleatory));

        Arrays.sort(numAleatory);
        System.out.println(Arrays.toString(numAleatory));

        var num1 = new ListNumInt(9);
        var num2 = new ListNumInt(3);
        var num3 = new ListNumInt(87);
        var num4 = new ListNumInt(2);
        var num5 = new ListNumInt(230);
        var num6 = new ListNumInt(6);

        List<ListNumInt> list = new LinkedList<>();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);
        list.add(num6);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        var title1 = new Title("A pequena Sereia");
        var title2 = new Title("Hércules");
        var title3 = new Title("O Rei Leão");
        var title4 = new Title("Os 101 Dálmatas");
        var title5 = new Title("Mulan 2");

        List<Title> stringList = new LinkedList<>();

        stringList.add(title1);
        stringList.add(title2);
        stringList.add(title3);
        stringList.add(title4);
        stringList.add(title5);
        System.out.println(stringList);

        Collections.sort(stringList);
        System.out.println(stringList);




    }
}
