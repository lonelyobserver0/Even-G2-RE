package com.mapbox.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.mapbox.common.LifecycleService;
import com.stub.StubApp;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0013\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/mapbox/common/MapboxSDKCommonInitializerImpl;", "LR1/b;", "Lcom/mapbox/common/MapboxSDKCommon;", "<init>", "()V", "Landroid/content/Context;", "context", "", "initTileStoreServiceIfAvailable", "(Landroid/content/Context;)V", "create", "(Landroid/content/Context;)Lcom/mapbox/common/MapboxSDKCommon;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "Lcom/mapbox/common/LifecycleService;", "lifecycleService", "Lcom/mapbox/common/LifecycleService;", "com/mapbox/common/MapboxSDKCommonInitializerImpl$lifecycleServiceConnection$1", "lifecycleServiceConnection", "Lcom/mapbox/common/MapboxSDKCommonInitializerImpl$lifecycleServiceConnection$1;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxSDKCommonInitializerImpl implements R1.b {
    private LifecycleService lifecycleService;
    private final MapboxSDKCommonInitializerImpl$lifecycleServiceConnection$1 lifecycleServiceConnection = new ServiceConnection() { // from class: com.mapbox.common.MapboxSDKCommonInitializerImpl$lifecycleServiceConnection$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            if (service instanceof LifecycleService.Binder) {
                MapboxSDKCommonInitializerImpl.this.lifecycleService = ((LifecycleService.Binder) service).getThis$0();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            MapboxSDKCommonInitializerImpl.this.lifecycleService = null;
        }
    };

    private final void initTileStoreServiceIfAvailable(Context context) {
        Class<?> cls;
        try {
            cls = Class.forName(StubApp.getString2("13374"));
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            Method declaredMethod = cls.getDeclaredMethod(StubApp.getString2(10061), Context.class);
            if (declaredMethod != null) {
                declaredMethod.invoke(null, context);
            }
        }
    }

    @Override // R1.b
    public List<Class<? extends R1.b>> dependencies() {
        return CollectionsKt.listOf(CoreInitializer.class);
    }

    @Override // R1.b
    public MapboxSDKCommon create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        initTileStoreServiceIfAvailable(context);
        context.bindService(new Intent(context, (Class<?>) LifecycleService.class), this.lifecycleServiceConnection, 1);
        return MapboxSDKCommon.INSTANCE;
    }
}
