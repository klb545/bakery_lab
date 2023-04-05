package enums;

public enum PipingTip {
    PLAIN("plain"),
    STAR("star"),
    CLOUD("cloud");
    private String pipingTipString;
    PipingTip(String pipingTipString){
        this.pipingTipString = pipingTipString;
    }
    public String getPipingTipString() {
        return this.pipingTipString;
    }
}
