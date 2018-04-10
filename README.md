# dashboard
Android 仪表盘，可以设置仪表盘的背景颜色数组，设置告警，为工业设置告警量身打造。


使用方法：
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
        dashboardView.setStripeMode(DashboardView.StripeMode.INNER);
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
        data.add(new AngleBean(0,30,"#14b38a"));
        data.add(new AngleBean(30,70,"#14b38a"));
        data.add(new AngleBean(70,100,"#14b38a"));
        dashboardView.setStripeHighlightColorAndRange(DashBoardManager.calibration2Angle(data, dashboardView));
