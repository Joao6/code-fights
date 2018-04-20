int matrixElementsSum(int[][] matrix) {
    int totalSum = 0;
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if(i == 0 && matrix[i][j] != 0){
                totalSum += matrix[i][j];
            }else if(matrix[i][j] != 0 && matrix[i-1][j] != 0){
                totalSum += matrix[i][j];
            }else{
                matrix[i][j] = 0;
            }

        }
    }
    return totalSum;
}
