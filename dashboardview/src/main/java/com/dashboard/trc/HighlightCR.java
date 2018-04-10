package com.dashboard.trc;

/**
 * Created by trc on 2018/4/10.
 */

public class HighlightCR {

    private float mStartAngle;
    private float mSweepAngle;
    private int mColor;

    public HighlightCR() {

    }

    public HighlightCR(double startAngle, double sweepAngle, int color) {
        this.mStartAngle = (float) startAngle;
        this.mSweepAngle = (float) sweepAngle;
        this.mColor = color;
    }

    public float getStartAngle() {
        return mStartAngle;
    }

    public void setStartAngle(float startAngle) {
        mStartAngle = startAngle;
    }

    public float getSweepAngle() {
        return mSweepAngle;
    }

    public void setSweepAngle(float sweepAngle) {
        mSweepAngle = sweepAngle;
    }

    public int getColor() {
        return mColor;
    }

    public void setColor(int color) {
        this.mColor = color;
    }

}
