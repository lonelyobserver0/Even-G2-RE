package e2;

import Xa.o;
import Z9.q;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.stub.StubApp;
import d2.InterfaceC0798a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: e2.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0839c implements InterfaceC0798a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f13580a;

    /* renamed from: b, reason: collision with root package name */
    public final q f13581b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f13582c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f13583d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f13584e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f13585f;

    public C0839c(WindowLayoutComponent component, q consumerAdapter) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(consumerAdapter, "consumerAdapter");
        this.f13580a = component;
        this.f13581b = consumerAdapter;
        this.f13582c = new ReentrantLock();
        this.f13583d = new LinkedHashMap();
        this.f13584e = new LinkedHashMap();
        this.f13585f = new LinkedHashMap();
    }

    @Override // d2.InterfaceC0798a
    public final void a(Context context, G1.c executor, o callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.f13582c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f13583d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f13584e;
            if (fVar != null) {
                fVar.b(callback);
                linkedHashMap2.put(callback, context);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(callback, context);
                fVar2.b(callback);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(CollectionsKt.emptyList()));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f13585f.put(fVar2, this.f13581b.h(this.f13580a, Reflection.getOrCreateKotlinClass(WindowLayoutInfo.class), (Activity) context, new C0838b(1, fVar2, f.class, StubApp.getString2("8452"), StubApp.getString2("17263"), 0)));
                }
            }
            Unit unit2 = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // d2.InterfaceC0798a
    public final void b(o listener) {
        Intrinsics.checkNotNullParameter(listener, "callback");
        ReentrantLock reentrantLock = this.f13582c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f13584e;
        try {
            Context context = (Context) linkedHashMap.get(listener);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f13583d;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                reentrantLock.unlock();
                return;
            }
            Intrinsics.checkNotNullParameter(listener, "listener");
            ReentrantLock reentrantLock2 = fVar.f13591b;
            reentrantLock2.lock();
            LinkedHashSet linkedHashSet = fVar.f13593d;
            try {
                linkedHashSet.remove(listener);
                reentrantLock2.unlock();
                linkedHashMap.remove(listener);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap2.remove(context);
                    Z1.d dVar = (Z1.d) this.f13585f.remove(fVar);
                    if (dVar != null) {
                        dVar.f8951a.invoke(dVar.f8952b, dVar.f8953c);
                    }
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
