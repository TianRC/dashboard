package com.dashboard.trc;

/**
 * Created by trc on 2018/4/10.
 */

public class AngleBean implements Comparable<AngleBean>{
    /**
     * start 是其实值
     * end 是量程
     */

    //运算符 0: xiao于 1:等于 2: da于
    private float start, end;
    private String color;
    private float operator;
    private float i;



    public AngleBean(double start, double end, String color) {
        this.start = (float) start;
        this.end = (float) end;
        this.color = color;
    }

    public AngleBean(double start, double end, String color, int operator) {
        this.start = (float) start;
        this.end = (float) end;
        this.color = color;
        this.operator = operator;
    }

    public double getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public float getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public float getEnd() {
        return end;
    }

    public void setEnd(float end) {
        this.end = end;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int compareTo(AngleBean o) {
        if (operator == 0) {
            i = this.getEnd() - o.getEnd();//先按照年龄排序
//            if (i == 0) {
//                return this.index - o.getIndex();//如果年龄相等了再用分数进行排序
//            }
        } else if (operator == 2) {
            i = this.getStart() - o.getStart();
        }
        return (int) i;
    }
}
