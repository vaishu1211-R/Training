class Missing{
    public static void main(String[] args) {
        int a[] = {5, 3, -1, 2, 1, 8};
        int b[] = {6, 1, 0, 2, 9, 5, 6, 3, 7, 4};

        System.out.println(findMissing(a));
        System.out.println(findMissing(b));
    }

    static int findMissing(int arr[]) {
        for (int i = 1; i <= arr.length + 1; i++) {
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return i;
            }
        }
        return -1;
    }
}