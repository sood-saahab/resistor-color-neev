class ResistorColor {
    int colorCode(String color) {
        String[] colors = {"black", "brown", "red","orange","yellow","green","blue","violet","grey","white"};
        int i=0;
        for(i=0;i<=9;i++){
            if(color.equals(colors[i]))
                break;
        }
        return i;
    }

    String[] colors() {
        String[] colors = {"black", "brown", "red","orange","yellow","green","blue","violet","grey","white"};
        return colors;
    }
}
