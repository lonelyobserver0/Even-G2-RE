package f2;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.stub.StubApp;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC0872a {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
        try {
            return sidecarDeviceState.posture;
        } catch (NoSuchFieldError unused) {
            try {
                Object invoke = SidecarDeviceState.class.getMethod(StubApp.getString2("17411"), new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) invoke).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
        int a3 = a(sidecarDeviceState);
        if (a3 < 0 || a3 > 4) {
            return 0;
        }
        return a3;
    }

    public static List c(SidecarWindowLayoutInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        try {
            try {
                List list = info.displayFeatures;
                return list == null ? CollectionsKt.emptyList() : list;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return CollectionsKt.emptyList();
            }
        } catch (NoSuchFieldError unused2) {
            Object invoke = SidecarWindowLayoutInfo.class.getMethod(StubApp.getString2("17412"), new Class[0]).invoke(info, new Object[0]);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            return (List) invoke;
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i3) {
        Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                sidecarDeviceState.posture = i3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod(StubApp.getString2("17413"), Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i3));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
    }
}
