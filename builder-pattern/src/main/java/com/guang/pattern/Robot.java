package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/4 15:07
 */
public class Robot {

    private Hand hand;
    private Body body;
    private Heat heat;
    private Foot foot;

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Heat getHeat() {
        return heat;
    }

    public void setHeat(Heat heat) {
        this.heat = heat;
    }

    public Foot getFoot() {
        return foot;
    }

    public void setFoot(Foot foot) {
        this.foot = foot;
    }
}
