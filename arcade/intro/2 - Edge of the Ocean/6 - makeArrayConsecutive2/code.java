int makeArrayConsecutive2(int[] statues) {
    int needed = 0;
    Arrays.sort(statues);
    for(int i = 0; i < statues.length -1; i++){
        if(statues[i+1] - statues[i] > 1){
            needed += (statues[i+1] - statues[i]) -1;
        }
    }
    return needed;
}
