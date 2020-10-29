package sample;
class Main {
    public static void main(String[] args) throws IllegalArgumentException{
            System.out.print("Array №" + ": { ");
            int first = (int) ((Math.random() * 5) + 7);
            byte[] array = new byte[first];
            fillArray(array);
            System.out.print("}\n");
            InsertionSortStrategy(array);
    }
    
    public static void fillArray(byte array[]) {
        for (int i = 0; i < array.length; i++) {
                array[i] = (byte) ((int) (Math.random() * 255) - 128);
                System.out.print(array[i] + " ");
        }
    }
    
    // Insertion sort
    public static void sort(byte arr[])
    {
        int n = arr.length;

        // Поочередное перемещение границы несортированного подмассива
        for (byte i = 0; i < n-1; i++)
        {
            // Находим минимальный элемент в несортированном массиве
            byte min_idx = i;
            for (byte j = (byte) (i+1); j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Поменяем местами найденный минимальный элемент с первым элементом
            byte temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Sorted array: { ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
    }
}
