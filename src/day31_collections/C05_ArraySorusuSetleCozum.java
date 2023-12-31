package day31_collections;

import java.util.*;

public class C05_ArraySorusuSetleCozum {
    public static void main(String[] args) {


        // verilen array'den tekrar eden elementleri silip
        // array'i her bir elementin unique oldugu hali ile kaydedin

        int[] arr = {2,4,6,4,1,2,5,7,9,4,5,7,2,6,8,2,1};

        Set<Integer> tekrarsizSet = new TreeSet<>();

        // set unique elementlerden olustugu icin
        // array'deki elementleri set'e eklersek
        // tekrar edenler yok olur

        for (Integer each: arr
        ) {
            tekrarsizSet.add(each);
        }

        System.out.println("Set : " + tekrarsizSet); // Set : [1, 2, 4, 5, 6, 7, 8, 9]

        // Set index kullanmadigi icin for-loop kullanamayiz
        // for-each loop kullanmaliyiz

        arr = new int[tekrarsizSet.size()];

        // for-each loop ile yapacagimiz icin arr'in index'ini biz takip etmeliyiz

        int index=0;
        for (Integer each : tekrarsizSet
        ) {
            arr[index] = each;
            index++;
        }

        System.out.println("Array'in son hali : " + Arrays.toString(arr));

        //iterator ile çözüm

        // tekrarsiz elementleri saklayan Set olusturdum
        //hashSet'le de yapabilirdik fark etmez
        Set<Integer> tekrarsiz=new TreeSet<>();
        // Arrayi set'e ekledim
        for (int element : arr) {
            tekrarsiz.add(element);
        }
        //ıterator olusturdum
        Iterator<Integer> iterator = tekrarsiz.iterator();
        // Iterator kullanarak tekrarsız elemanları yazdirdim
        while (iterator.hasNext()) {//yaninda eleman oldukca donguyu devam ettirdim
            System.out.print(iterator.next()+" ");
        }
    }









}



