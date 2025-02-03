
class Ques2 {

    public static void main(String args[]) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        int even = 0, odd = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                even++; 
            }else {
                odd++;
            }
        }
        System.out.println("Number of even elements: " + even);
        System.out.println("Number of odd elements: " + odd);
    }
}