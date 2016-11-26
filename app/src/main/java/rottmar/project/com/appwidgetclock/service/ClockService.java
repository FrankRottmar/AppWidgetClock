package rottmar.project.com.appwidgetclock.service;

import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.RemoteViews;

import rottmar.project.com.appwidgetclock.R;
import rottmar.project.com.appwidgetclock.provider.ClockWidget;
import rottmar.project.com.appwidgetclock.util.DateUtil;

/**
 * Created by john on 26.11.2016.
 */

public class ClockService extends Service {
    @Override
    public void onCreate()
    {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        buildUpdate();
        return super.onStartCommand(intent, flags, startId);
    }

    private void buildUpdate()
    {
        RemoteViews view = new RemoteViews(getPackageName(), R.layout.clock_widget);
        view.setTextViewText(R.id.appwidget_text, new DateUtil().getTime());

        // Push update for this widget to the Clock screen
        ComponentName thisWidget = new ComponentName(this, ClockWidget.class);
        AppWidgetManager manager = AppWidgetManager.getInstance(this);
        manager.updateAppWidget(thisWidget, view);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
