package com.dashboard.trc;

import android.graphics.Color;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by trc on 2018/4/10.
 */

public class DashBoardManager {
    private static final String start = "startAngle";
    private static final String end = "endAngle";

    /**
     * 刻度转角度
     *
     * @param k1 刻度  需要绘制的刻度范围
     * @param k2 刻度  一共刻度的范围,max-min
     * @param N  角度  整个仪表盘的角度
     * @return 返回的需要绘制的角度
     * attention 这只是需要绘制的角度,我们需要的是起始 角度和 结束角度
     */
    public int calibration2Angle(int k1, int k2, int N) {
        return k1 / k2 * N;
    }

    public static List<HighlightCR> calibration2Angle(List<AngleBean> data, DashboardView dashboardView) {
        List<HighlightCR> highlight = new ArrayList<>();
        double totalK = (dashboardView.getMaxValue() - dashboardView.getMinValue());
        for (int i = 0; i < data.size(); i++) {
            double ratioK_End = (((data.get(i).getEnd() - data.get(i).getStart()) * dashboardView.getSweepAngle() / totalK));
            double ratioK_Start = (((data.get(i).getStart()) * dashboardView.getSweepAngle() / totalK));
            Log.d("DashBoardManager", "ratioK_Start:" + ratioK_Start);
            Log.d("DashBoardManager", "ratioK_End:" + ratioK_End);
            Log.d("DashBoardManager", "dashboardView.getStartAngle():" + dashboardView.getStartAngle());
            Log.d("DashBoardManager=", data.get(i).getColor());
            highlight.add(new HighlightCR(dashboardView.getStartAngle() + ratioK_Start,
                    ratioK_End,
                    Color.parseColor(data.get(i).getColor())));
        }
        Collections.reverse(highlight);
        for (int i = 0; i < highlight.size(); i++) {
            Log.d("DashBoardManager", "highlight.get(i).getColor():" + highlight.get(i).getColor());
        }
        return highlight;
    }
}
