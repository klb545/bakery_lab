package org.example;

import enums.PipingTip;

public abstract class Sponge extends BakedGood{
    private String icingColour;
    private PipingTip pipingTip;
    public Sponge(String name, String baseFlavour, double cost, double sellPrice, String icingColour){
        super(name, baseFlavour, cost, sellPrice);
        this.icingColour = icingColour;
        this.pipingTip = PipingTip.PLAIN;
    }

    public String getIcingColour() {
        return this.icingColour;
    }

    public void setIcingColour(String newIcingColour) {
        this.icingColour = newIcingColour;
    }

    public String getPipingTip() {
        return this.pipingTip.getPipingTipString();
    }

    public void setPipingTip(PipingTip newPipingTip) {
        this.pipingTip = newPipingTip;
    }

//    CUSTOM METHOD
    public void customisePipingTip(PipingTip newPipingTip){
        this.pipingTip = newPipingTip;
    }



}
