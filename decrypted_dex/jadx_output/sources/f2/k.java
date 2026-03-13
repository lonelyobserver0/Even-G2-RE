package f2;

import Xa.o;
import Z9.C0366a;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import c2.C0558j;
import d0.ViewOnAttachStateChangeListenerC0795z;
import d2.InterfaceC0798a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k implements InterfaceC0798a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile k f13730c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f13731d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final i f13732a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f13733b = new CopyOnWriteArrayList();

    public k(i iVar) {
        this.f13732a = iVar;
        if (iVar != null) {
            iVar.d(new C0366a(this, 5));
        }
    }

    @Override // d2.InterfaceC0798a
    public final void a(Context context, G1.c executor, o callback) {
        Object obj;
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Unit unit = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ReentrantLock reentrantLock = f13731d;
            reentrantLock.lock();
            try {
                i iVar = this.f13732a;
                if (iVar == null) {
                    callback.accept(new C0558j(CollectionsKt.emptyList()));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f13733b;
                boolean z2 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (Intrinsics.areEqual(((j) it.next()).f13727a, activity)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                j this$0 = new j(activity, executor, callback);
                copyOnWriteArrayList.add(this$0);
                if (z2) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (Intrinsics.areEqual(activity, ((j) obj).f13727a)) {
                                break;
                            }
                        }
                    }
                    j jVar = (j) obj;
                    C0558j newLayoutInfo = jVar != null ? jVar.f13729c : null;
                    if (newLayoutInfo != null) {
                        Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayoutInfo");
                        this$0.f13729c = newLayoutInfo;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(newLayoutInfo, "$newLayoutInfo");
                        this$0.f13728b.accept(newLayoutInfo);
                    }
                } else {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        iVar.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0795z(iVar, activity));
                    }
                }
                Unit unit2 = Unit.INSTANCE;
                reentrantLock.unlock();
                unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (unit == null) {
            callback.accept(new C0558j(CollectionsKt.emptyList()));
        }
    }

    @Override // d2.InterfaceC0798a
    public final void b(o callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (f13731d) {
            try {
                if (this.f13732a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f13733b.iterator();
                while (it.hasNext()) {
                    j callbackWrapper = (j) it.next();
                    if (callbackWrapper.f13728b == callback) {
                        Intrinsics.checkNotNullExpressionValue(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                this.f13733b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((j) it2.next()).f13727a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f13733b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (Intrinsics.areEqual(((j) it3.next()).f13727a, activity)) {
                                break;
                            }
                        }
                    }
                    i iVar = this.f13732a;
                    if (iVar != null) {
                        iVar.b(activity);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
