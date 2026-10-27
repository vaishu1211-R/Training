class Move{
    public static void main(String[] args) {

        int a[] = {0,6,5,7,0,6,8};
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }

        while (j < a.length) {
            a[j] = 0;
            j++;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}