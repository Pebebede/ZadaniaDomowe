public class Zadanie {

    public void podajCiag() {
        Integer[] array = new Integer[10];
        wypelnienieTablicy(array);
        for (int i = 0; i < array.length; i++) {
            if (i < 2) {
                System.out.println(i + 1 + " element ciągu ma wartość:" + i);
            } else {
                array[i] = array[i - 1] + array[i - 2];
                System.out.println(i + 1 + " element ciągu ma wartość:" + array[i]);
            }
        }

    }

    private void wypelnienieTablicy(Integer[] array) {
        array[0] = 0;
        array[1] = 1;

    }


}
