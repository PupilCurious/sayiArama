public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {12,3,5,1,34,5,2,23,0,9};
        int findingNumber = 78;
        boolean isFind = false;

        for(int number:numbers){
            if(number == findingNumber){
                isFind = true;
                        break;
            }
        }
        if(isFind){
            System.out.println("aranan sayı " + findingNumber + " dizide var");
        }
        else{
            System.out.println("aranan sayı " + findingNumber + " dizide yok");
        }



        /*for(int number:numbers){
            if(findingNumber==number) {
                System.out.println("tutulan sayı " + number);
                return;
            }
        }

        System.out.println("tutulan sayı dizide yoktur");*/
    }
}