package lesson3;

/*реализация функции поиска элемента ряда Фибоначчи с использованием типа int*/
public class Sequence {

  public static int sequenceFind(int a, int b, int i){

      System.out.print(a + " ");

      int c = a + b;
      a = b;
      b = c;
      --i;
      if(i <= 0){
          System.out.println(a + " " + b);
          return(i);}
      sequenceFind(a, b, i);
      return c;
    }
}

