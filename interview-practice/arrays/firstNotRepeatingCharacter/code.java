char firstNotRepeatingCharacter(String s) {
    while (s.length() >= 1) {
        String aux = s.substring(0,1);
        s = s.substring(1,s.length());
        if(s.contains(aux)){
            s = s.replace(aux, "");
        }else{
            return aux.charAt(0);               
        }
    }
    return '_';
}
