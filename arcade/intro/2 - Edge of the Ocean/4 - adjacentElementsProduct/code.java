int adjacentElementsProduct(int[] inputArray) {
    int big = Integer.MIN_VALUE;
    for(int i = 0; i < inputArray.length-1; i++){
        if(big < (inputArray[i] * inputArray[i+1])){
            big = (inputArray[i] * inputArray[i+1]);
        } 
    }
    return big;
}
