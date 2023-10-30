class gitResistorColor {
    String[] colors = {"black", "brown", "red","orange","yellow","green","blue","violet","grey","white"};
    int colorCode(String color) {
        int result=0;
        for(int i=0;i<=9;i++){
            if(color.equals(colors[i])){
                result=i;
                break;
                }
        }
        return result;
    }

    String[] colors() {
        return colors;
    }
}
