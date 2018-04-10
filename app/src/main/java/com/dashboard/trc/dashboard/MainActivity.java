package com.dashboard.trc.dashboard;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

import com.dashboard.trc.AngleBean;
import com.dashboard.trc.DashBoardManager;
import com.dashboard.trc.DashboardView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DashboardView dashboardView;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dashboardView = this.findViewById(R.id.dashboardView);
        seekBar = this.findViewById(R.id.seekbar);

        dashboardView.setSmallSliceRadius(90);
        dashboardView.setBigSliceRadius(120);
        /**设置字体颜色*/
        dashboardView.setTextColor(Color.BLACK);
        dashboardView.setBigSliceCount(10);
        /** 设置色带宽度*/
        dashboardView.setStripeWidth(20);
        /**设置Title位置*/
        dashboardView.setHeaderRadius(40);
        /** 设置Title大小*/
        dashboardView.setHeaderTextSize(15);
        /** 设置指针长度*/
        dashboardView.setPointerRadius(60);
        /**设置色带模式*/
        dashboardView.setStripeMode(DashboardView.StripeMode.INNER);
        /**设置刻度颜色*/
        dashboardView.setArcColor(Color.WHITE);
        /**设置数字弧度*/
        dashboardView.setNumMeaRadius(70);
        dashboardView.setRealValue(0);
        /**设置最大最下值*/
        dashboardView.setMaxValue(100);
        dashboardView.setMinValue(0);
        /**设置仪表盘的色带颜色*/
        List<AngleBean> data = new ArrayList<>();
        data.add(new AngleBean(0, 10, "#EEC591"));
        data.add(new AngleBean(10, 20, "#EEA9B8"));
        data.add(new AngleBean(20, 30, "#EEA2AD"));
        data.add(new AngleBean(30, 40, "#EE6363"));
        data.add(new AngleBean(40, 50, "#EE5C42"));
        data.add(new AngleBean(50, 60, "#EE4000"));
        data.add(new AngleBean(60, 70, "#EE3B3B"));
        data.add(new AngleBean(70, 80, "#63B8FF"));
        data.add(new AngleBean(80, 90, "#5F9EA0"));
        data.add(new AngleBean(90, 100, "#5C5C5C"));
        dashboardView.setStripeHighlightColorAndRange(DashBoardManager.calibration2Angle(data, dashboardView));

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                dashboardView.setRealValue(progress);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
