package ru.netology.sqr.counter;

public class SQRService {

    public int calcSQRService(int x, int y){
        int count = 0;
        for (int i = 10; i <= 99; i++){
            if ((i * i >= x) & (i * i <= y)){
                count++;
            }

        }
        return count;
    }
}
