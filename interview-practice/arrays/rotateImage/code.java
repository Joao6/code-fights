int[][] rotateImage(int[][] a) {
    int[][] newImage = new int[a[0].length][a[0].length];
    for (int i = 0; i < a[0].length; i++) {
        int index = 0;
        for (int j = a[0].length-1; j >= 0; j--) {
            newImage[i][index++] = a[j][i];                
        }
    }
    return newImage;
}