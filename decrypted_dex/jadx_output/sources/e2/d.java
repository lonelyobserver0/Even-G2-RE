package e2;

import Xa.o;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import d2.InterfaceC0798a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d implements InterfaceC0798a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f13586a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f13587b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f13588c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f13589d;

    public d(WindowLayoutComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f13586a = component;
        this.f13587b = new ReentrantLock();
        this.f13588c = new LinkedHashMap();
        this.f13589d = new LinkedHashMap();
    }

    @Override // d2.InterfaceC0798a
    public final void a(Context context, G1.c executor, o callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.f13587b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f13588c;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f13589d;
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
                this.f13586a.addWindowLayoutInfoListener(context, fVar2);
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
        ReentrantLock reentrantLock = this.f13587b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f13589d;
        try {
            Context context = (Context) linkedHashMap.get(listener);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f13588c;
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
                    this.f13586a.removeWindowLayoutInfoListener(fVar);
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
