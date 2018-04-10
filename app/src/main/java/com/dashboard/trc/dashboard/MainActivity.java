package com.dashboard.trc.dashboard;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.dashboard.trc.AngleBean;
import com.dashboard.trc.DashBoardManager;
import com.dashboard.trc.DashboardView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DashboardView dashboardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dashboardView = this.findViewById(R.id.dashboardView);
        dashboardView.setSmallSliceRadius(90);
        dashboardView.setBigSliceRadius(120);
        /**设置字体颜色*/
        dashboardView.setTextColor(Color.BLACK);
        /***/

        dashboardView.setBigSliceCount(10);
        /***/
        dashboardView.setStripeWidth(20);
        /***/
        dashboardView.setHeaderRadius(40);
        /***/
        dashboardView.setHeaderTextSize(15);
        /***/
        dashboardView.setPointerRadius(60);
        /***/
        dashboardView.setStripeMode(DashboardView.StripeMode.NORMAL);
        /**设置*/
        dashboardView.setArcColor(Color.WHITE);
        /**设置*/
        dashboardView.setNumMeaRadius(10);
        dashboardView.setRealTimeValue(10);
        /**设置最大最下值*/
        dashboardView.setMaxValue(100);
        dashboardView.setMinValue(0);
        /**设置仪表盘的色带颜色*/
        List<AngleBean> data = new ArrayList<>();
        data.add(new AngleBean(0,100,"#14b38a"));
        dashboardView.setStripeHighlightColorAndRange(DashBoardManager.calibration2Angle(data, dashboardView));
    }
}
