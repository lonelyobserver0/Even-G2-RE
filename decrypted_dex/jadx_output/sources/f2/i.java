package f2;

import Z9.C0366a;
import a5.c;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import c2.C0558j;
import com.stub.StubApp;
import f2.f;
import f2.i;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final SidecarInterface f13722a;

    /* renamed from: b, reason: collision with root package name */
    public final f f13723b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f13724c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f13725d;

    /* renamed from: e, reason: collision with root package name */
    public a5.c f13726e;

    public i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SidecarInterface a3 = h.a(context);
        Z1.h verificationMode = Z1.h.f8962a;
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        f sidecarAdapter = new f();
        Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
        this.f13722a = a3;
        this.f13723b = sidecarAdapter;
        this.f13724c = new LinkedHashMap();
        this.f13725d = new LinkedHashMap();
    }

    public final C0558j a(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return new C0558j(CollectionsKt.emptyList());
        }
        SidecarInterface sidecarInterface = this.f13722a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinder) : null;
        SidecarInterface sidecarInterface2 = this.f13722a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f13723b.c(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Activity activity) {
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f13722a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        LinkedHashMap linkedHashMap = this.f13725d;
        M.a aVar = (M.a) linkedHashMap.get(activity);
        if (aVar != null) {
            if (activity instanceof D.d) {
                ((D.d) activity).c(aVar);
            }
            linkedHashMap.remove(activity);
        }
        a5.c cVar = this.f13726e;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReentrantLock reentrantLock = (ReentrantLock) cVar.f9283c;
            reentrantLock.lock();
            try {
                ((WeakHashMap) cVar.f9284d).put(activity, null);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
        LinkedHashMap linkedHashMap2 = this.f13724c;
        boolean z2 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinder);
        if (!z2 || (sidecarInterface = this.f13722a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(IBinder windowToken, final Activity activity) {
        SidecarInterface sidecarInterface;
        Intrinsics.checkNotNullParameter(windowToken, "windowToken");
        Intrinsics.checkNotNullParameter(activity, "activity");
        LinkedHashMap linkedHashMap = this.f13724c;
        linkedHashMap.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.f13722a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f13722a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        a5.c cVar = this.f13726e;
        if (cVar != null) {
            cVar.F(activity, a(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f13725d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof D.d)) {
            M.a aVar = new M.a() { // from class: f2.g
                @Override // M.a
                public final void accept(Object obj) {
                    String string2 = StubApp.getString2(392);
                    i iVar = i.this;
                    Intrinsics.checkNotNullParameter(iVar, string2);
                    String string22 = StubApp.getString2(17418);
                    Activity activity2 = activity;
                    Intrinsics.checkNotNullParameter(activity2, string22);
                    a5.c cVar2 = iVar.f13726e;
                    if (cVar2 != null) {
                        cVar2.F(activity2, iVar.a(activity2));
                    }
                }
            };
            linkedHashMap2.put(activity, aVar);
            ((D.d) activity).b(aVar);
        }
    }

    public final void d(C0366a extensionCallback) {
        Intrinsics.checkNotNullParameter(extensionCallback, "extensionCallback");
        this.f13726e = new a5.c(extensionCallback);
        SidecarInterface sidecarInterface = this.f13722a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f13723b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
                    SidecarInterface sidecarInterface2;
                    Window window;
                    WindowManager.LayoutParams attributes;
                    Intrinsics.checkNotNullParameter(newDeviceState, "newDeviceState");
                    Collection<Activity> values = i.this.f13724c.values();
                    i iVar = i.this;
                    for (Activity activity : values) {
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                        if (iBinder != null && (sidecarInterface2 = iVar.f13722a) != null) {
                            sidecarWindowLayoutInfo = sidecarInterface2.getWindowLayoutInfo(iBinder);
                        }
                        c cVar = iVar.f13726e;
                        if (cVar != null) {
                            cVar.F(activity, iVar.f13723b.c(sidecarWindowLayoutInfo, newDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
                    SidecarDeviceState sidecarDeviceState;
                    Intrinsics.checkNotNullParameter(windowToken, "windowToken");
                    Intrinsics.checkNotNullParameter(newLayout, "newLayout");
                    Activity activity = (Activity) i.this.f13724c.get(windowToken);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    i iVar = i.this;
                    f fVar = iVar.f13723b;
                    SidecarInterface sidecarInterface2 = iVar.f13722a;
                    if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    C0558j c10 = fVar.c(newLayout, sidecarDeviceState);
                    c cVar = i.this.f13726e;
                    if (cVar != null) {
                        cVar.F(activity, c10);
                    }
                }
            }));
        }
    }

    public final boolean e() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        String string2 = StubApp.getString2(17419);
        String string22 = StubApp.getString2(17420);
        String string23 = StubApp.getString2(17421);
        String string24 = StubApp.getString2(17422);
        try {
            SidecarInterface sidecarInterface = this.f13722a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod(StubApp.getString2("17423"), SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!Intrinsics.areEqual(returnType, cls5)) {
                throw new NoSuchMethodException(string24 + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f13722a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f13722a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f13722a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod(StubApp.getString2("17424"), IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!Intrinsics.areEqual(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException(string23 + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f13722a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod(StubApp.getString2("17425"), IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!Intrinsics.areEqual(returnType3, cls5)) {
                throw new NoSuchMethodException(string22 + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f13722a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod(StubApp.getString2("17426"), IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!Intrinsics.areEqual(returnType4, cls5)) {
                throw new NoSuchMethodException(string2 + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod(StubApp.getString2("17413"), Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object invoke = SidecarDeviceState.class.getMethod(StubApp.getString2("17411"), new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) invoke).intValue() != 3) {
                    throw new Exception(StubApp.getString2("17429"));
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            Intrinsics.checkNotNullExpressionValue(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod(StubApp.getString2("17427"), List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod(StubApp.getString2("17412"), new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                Intrinsics.checkNotNull(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (!Intrinsics.areEqual(arrayList, (List) invoke2)) {
                    throw new Exception(StubApp.getString2("17428"));
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }
}
