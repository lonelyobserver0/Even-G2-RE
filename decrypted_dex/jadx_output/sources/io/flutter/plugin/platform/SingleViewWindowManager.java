package io.flutter.plugin.platform;

import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.stub.StubApp;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
abstract class SingleViewWindowManager implements WindowManager {
    private static final String TAG = StubApp.getString2(18768);
    final WindowManager delegate;
    SingleViewFakeWindowViewGroup fakeWindowRootView;

    public SingleViewWindowManager(WindowManager windowManager, SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup) {
        this.delegate = windowManager;
        this.fakeWindowRootView = singleViewFakeWindowViewGroup;
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(Consumer<Boolean> consumer) {
        this.delegate.addCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup = this.fakeWindowRootView;
        if (singleViewFakeWindowViewGroup == null) {
            Log.w(StubApp.getString2(18768), StubApp.getString2(18800));
        } else {
            singleViewFakeWindowViewGroup.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public WindowMetrics getCurrentWindowMetrics() {
        WindowMetrics currentWindowMetrics;
        currentWindowMetrics = this.delegate.getCurrentWindowMetrics();
        return currentWindowMetrics;
    }

    @Override // android.view.WindowManager
    @Deprecated
    public Display getDefaultDisplay() {
        return this.delegate.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public WindowMetrics getMaximumWindowMetrics() {
        WindowMetrics maximumWindowMetrics;
        maximumWindowMetrics = this.delegate.getMaximumWindowMetrics();
        return maximumWindowMetrics;
    }

    @Override // android.view.WindowManager
    public boolean isCrossWindowBlurEnabled() {
        boolean isCrossWindowBlurEnabled;
        isCrossWindowBlurEnabled = this.delegate.isCrossWindowBlurEnabled();
        return isCrossWindowBlurEnabled;
    }

    @Override // android.view.WindowManager
    public void removeCrossWindowBlurEnabledListener(Consumer<Boolean> consumer) {
        this.delegate.removeCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void removeView(View view) {
        SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup = this.fakeWindowRootView;
        if (singleViewFakeWindowViewGroup == null) {
            Log.w(StubApp.getString2(18768), StubApp.getString2(18801));
        } else {
            singleViewFakeWindowViewGroup.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public void removeViewImmediate(View view) {
        if (this.fakeWindowRootView == null) {
            Log.w(StubApp.getString2(18768), StubApp.getString2(18802));
        } else {
            view.clearAnimation();
            this.fakeWindowRootView.removeView(view);
        }
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup = this.fakeWindowRootView;
        if (singleViewFakeWindowViewGroup == null) {
            Log.w(StubApp.getString2(18768), StubApp.getString2(18803));
        } else {
            singleViewFakeWindowViewGroup.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(Executor executor, Consumer<Boolean> consumer) {
        this.delegate.addCrossWindowBlurEnabledListener(executor, consumer);
    }
}
