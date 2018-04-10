# Android DashBoard 仪表盘

## 效果图：

<img src="readme_resources/gif.gif" width="280" height="466"/>


<img src="readme_resources/1.png" width="280" height="466"/> <img src="readme_resources/2.png" width="280" height="466"/> <img src="readme_resources/s3.png" width="280" height="466"/>

## 使用方法：
### Gradle
#### 1：In the project root directory build.gradle

        repositories {
          　　//Rely on the warehouse
        　　　maven { url 'https://jitpack.io' }
        　　}
        }

#### 2：The project directory build.gradle relies on the DashBoard framework

        implementation 'com.github.trc1993:dashboard:1.0.0'


### 在xml您可以这样使用它


    <com.dashboard.trc.DashboardView
        android:id="@+id/dashboardView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:layout_marginLeft="100dp"
        android:layout_marginTop="150dp"
        android:foregroundGravity="center"
        app:bigSliceCount="6"
        app:headerRadius="20dp"
        app:headerTitle="km/h"
        app:maxValue="240"
        app:measureTextSize="12sp"
        app:radius="100dp"
        app:startAngle="135"
        app:stripeMode="inner"
        app:stripeWidth="16dp"
        app:sweepAngle="270" />


### 当然你也可以在代码中[使用](app/src/main/java/com/dashboard/trc/dashboard/MainActivity.java)


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


## Attributes

[attr.xml](dashboardview/src/main/res/values/attrs.xml)

有任何问题请联系我QQ:1129440815,持续跟新...


