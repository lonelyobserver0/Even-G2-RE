package com.mapbox.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.mapbox.common.LifecycleMonitorAndroid;
import com.mapbox.common.LifecycleService;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1", "Landroid/content/ServiceConnection;", "onServiceConnected", "", "name", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LifecycleMonitorAndroid$lifecycleServiceConnection$1 implements ServiceConnection {
    final /* synthetic */ LifecycleMonitorAndroid this$0;

    public LifecycleMonitorAndroid$lifecycleServiceConnection$1(LifecycleMonitorAndroid lifecycleMonitorAndroid) {
        this.this$0 = lifecycleMonitorAndroid;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        LifecycleService lifecycleService;
        LifecycleMonitorAndroid$lifecycleServiceCallback$1 lifecycleMonitorAndroid$lifecycleServiceCallback$1;
        if (service instanceof LifecycleService.Binder) {
            this.this$0.lifecycleService = ((LifecycleService.Binder) service).getThis$0();
            lifecycleService = this.this$0.lifecycleService;
            if (lifecycleService != null) {
                lifecycleMonitorAndroid$lifecycleServiceCallback$1 = this.this$0.lifecycleServiceCallback;
                lifecycleService.setCallback(lifecycleMonitorAndroid$lifecycleServiceCallback$1);
            }
            LifecycleMonitorAndroid.updateMonitorState$default(this.this$0, LifecycleMonitorAndroid.MonitorState.STARTED, null, 2, null);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        this.this$0.lifecycleService = null;
        LifecycleMonitorAndroid.updateMonitorState$default(this.this$0, LifecycleMonitorAndroid.MonitorState.STOPPED, null, 2, null);
    }
}
