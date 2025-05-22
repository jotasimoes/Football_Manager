package domain;

public enum PreferedFoot {
    LEFT("Left"),
    RIGHT("Right");
    
    private String label;
    
    PreferedFoot(String label){
        this.label = label;
    }

    @Override
    public String toString(){
        return label;
    }
}
