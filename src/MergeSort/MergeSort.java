package MergeSort;

class MergeSort {

    private static void printArray(int[] array) {

        for (int i=0; i<array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    private static int[] MergeSort(int[] array){

        if (array.length <= 1) return array;

        int midpoint = array.length / 2;

        int[] lSide = new int[midpoint];
        int[] rSide;

        if (array.length % 2 == 0) rSide = new int[midpoint];

        else rSide = new int[midpoint+1];

        for (int i=0; i<midpoint; i++){
            lSide[i] = array[i];
        }

        for (int j=0; j<rSide.length; j++){
            rSide[j] = array[midpoint+j];
        }

        int[] res;
        res = new int[array.length];

        lSide = MergeSort(lSide);
        rSide = MergeSort(rSide);

        res = merge(lSide, rSide);

        return res;
    }

    private static int[] merge(int[] lSide, int[] rSide){
        int[] res = new int[lSide.length + rSide.length];

        int lPointer, rPointer, resPointer;
        lPointer = rPointer = resPointer = 0;

        while (lPointer < lSide.length || rPointer < rSide.length){

            if (lPointer < lSide.length && rPointer < rSide.length){

                if (lSide[lPointer] < rSide[rPointer]){
                    res[resPointer] = lSide[lPointer];
                } else{
                    res[resPointer] = rSide[rPointer++];
                }

                lPointer++;
                rPointer++;
                resPointer++;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] array = {5, 4, 3, 2, 1};
        System.out.println("initial: ");
        printArray(array);

        array = MergeSort(array);
        System.out.println("sorted: ");
        printArray(array);
    }
}
