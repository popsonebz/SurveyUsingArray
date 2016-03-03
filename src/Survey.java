// Created by popoola
public class Survey {
    public static void main(String[] args){
        int[] responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,1};
        int[] frequency = new int[6];
        for (int i=0;i<responses.length;i++){
            ++frequency[responses[i]];

        }
        System.out.printf("%8s   %8s\n","Response","frequency");
        for (int i=1;i<frequency.length;i++){

            System.out.printf("%7d%7d\n",i,frequency[i]);
        }
    }
}
