package module4.task5;
/*
Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса
 */

public class Counter {
       private int lowValue; //нижняя граница диапазона
       private int upValue;  //верхняя граница диапазона

    public void setLowValue(int lowValue) {
        this.lowValue = lowValue;
    }


    public void setUpValue(int upValue) {
        this.upValue = upValue;
    }



    public void countUp() throws InterruptedException { //счетчик со значениями по умолчанию

      int returnValue = lowValue-1;
      for (int i = lowValue; i <= upValue; i++){
        returnValue++;
          getPrintln(returnValue);
          Thread.sleep(1000);
      }
  }
    public void countUp(int x) throws InterruptedException { //счетчик со значениями
        int returnValue = x-1;
        for (int i = x; i <= upValue; i++){
            returnValue++;
            getPrintln(returnValue);
            Thread.sleep(1000);
        }
    }
    public void countDown() throws InterruptedException { //счетчик down со значениями по умолчанию
        int returnValue = upValue+1;
        for (int i = upValue; i >= lowValue; i--){
            returnValue--;
            getPrintln(returnValue);
            Thread.sleep(1000);
        }
    }
    public void countDown(int x) throws InterruptedException { //счетчик down со значениями
        int returnValue = x+1;
        for (int i = x; i >= lowValue; i--){
            returnValue--;
            getPrintln(returnValue);
            Thread.sleep(1000);
        }
    }

    private void getPrintln(int returnValue) {
        System.out.println(returnValue);
    }


}
