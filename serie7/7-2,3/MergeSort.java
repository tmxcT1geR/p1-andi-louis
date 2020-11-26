// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 7 Aufgabe 7-2

public class MergeSort {
    public static void sort(Comparable[] array){
        Comparable[] sorted = mergeSort(array);
        for(int i=0; i < array.length; i++){
            array[i] = sorted[i];
        }
    }

    private static Comparable[] mergeSort(Comparable[] toSplit){
        int toSplitLen = toSplit.length;
        if (toSplitLen == 1) {
            return toSplit;
        }
        int splitPoint = toSplitLen / 2;
        Comparable[] a = new Comparable[splitPoint];
        Comparable[] b = new Comparable[toSplitLen - splitPoint];
        for(int i = 0; i < toSplitLen; i++)
            if (i < splitPoint) a[i] = toSplit[i];
            else {
                b[i - splitPoint] = toSplit[i];
            }
        return merge(mergeSort(a), mergeSort(b));
    }

    private static Comparable[] merge(Comparable[] a, Comparable[] b){
        int mergedLen = a.length + b.length;
        Comparable[] merged = new Comparable[mergedLen];
        int positionA = 0;
        int positionB = 0;
        for (int i = 0; i < mergedLen; i++){
            if (positionA >= a.length){
                merged[i] = b[positionB];
                positionB++;
            }
            else if (positionB >= b.length){
                merged[i] = a[positionA];
                positionA++;
            }
            else if (b[positionB].compareTo(a[positionA]) < 0) {
                merged[i] = b[positionB];
                positionB++;
            }
            else {
                merged[i] = a[positionA];
                positionA++;
            }
        }
        return merged;
    }
}
