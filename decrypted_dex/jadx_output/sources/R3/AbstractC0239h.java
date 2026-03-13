package R3;

import a0.C0379a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.stub.StubApp;
import d0.C0771a;
import d0.C0791v;
import d0.M;
import i.AbstractActivityC1027h;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: R3.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0239h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6137a;

    public AbstractC0239h(InterfaceC0240i interfaceC0240i) {
        this.f6137a = interfaceC0240i;
    }

    public static InterfaceC0240i b(Activity activity) {
        J j;
        K k3;
        S3.D.i(activity, StubApp.getString2(5639));
        if (!(activity instanceof AbstractActivityC1027h)) {
            String string2 = StubApp.getString2(5642);
            WeakHashMap weakHashMap = J.f6106b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (j = (J) weakReference.get()) != null) {
                return j;
            }
            try {
                J j3 = (J) activity.getFragmentManager().findFragmentByTag(string2);
                if (j3 == null || j3.isRemoving()) {
                    j3 = new J();
                    activity.getFragmentManager().beginTransaction().add(j3, string2).commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(j3));
                return j3;
            } catch (ClassCastException e10) {
                throw new IllegalStateException(StubApp.getString2(5643), e10);
            }
        }
        AbstractActivityC1027h abstractActivityC1027h = (AbstractActivityC1027h) activity;
        C0379a c0379a = abstractActivityC1027h.f14605w;
        String string22 = StubApp.getString2(5640);
        WeakHashMap weakHashMap2 = K.f6108p0;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(abstractActivityC1027h);
        if (weakReference2 != null && (k3 = (K) weakReference2.get()) != null) {
            return k3;
        }
        try {
            K k4 = (K) ((C0791v) c0379a.f9233b).f13394d.C(string22);
            if (k4 == null || k4.f13376m) {
                k4 = new K();
                M m4 = ((C0791v) c0379a.f9233b).f13394d;
                m4.getClass();
                C0771a c0771a = new C0771a(m4);
                c0771a.e(0, k4, string22, 1);
                c0771a.d(true);
            }
            weakHashMap2.put(abstractActivityC1027h, new WeakReference(k4));
            return k4;
        } catch (ClassCastException e11) {
            throw new IllegalStateException(StubApp.getString2(5641), e11);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R3.i, java.lang.Object] */
    public final Activity a() {
        Activity c10 = this.f6137a.c();
        S3.D.h(c10);
        return c10;
    }

    public void c(int i3, int i10, Intent intent) {
    }

    public void d(Bundle bundle) {
    }

    public void e() {
    }

    public void f() {
    }

    public void g(Bundle bundle) {
    }

    public void h() {
    }

    public abstract void i();
}
