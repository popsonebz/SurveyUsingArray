// Created by popoola
public class Survey {
    public static void main(String[] args){
        int[] responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
        int[] frequency = new int[6];
        for (int i=0;i<responses.length;i++){
            try {
                ++frequency[responses[i]];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("    responses[%d ]= %d%n%n", i,responses[i]);
            }


        }
        System.out.printf("%8s   %8s\n","Response","frequency");
        for (int i=1;i<frequency.length;i++){

            System.out.printf("%7d%7d\n",i,frequency[i]);
        }
        int total = 0;
        for (int resp:
             frequency) {
            total +=resp;
        }
        System.out.printf("The total frequency is %d\n",total);
    }
}
