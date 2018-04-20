String[] allLongestStrings(String[] inputArray) {
    int bigger = -1;
    String output = "";
    for(String s : inputArray){
        if(s.length() > bigger) bigger = s.length();
    }
    for(String s : inputArray){
        if(s.length() == bigger) output += s + ",";
    }
    output = output.substring(0, output.length() -1);
    return output.split(",");
}
