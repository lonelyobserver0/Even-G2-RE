package e0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.stub.StubApp;
import d0.AbstractComponentCallbacksC0789t;
import d0.M;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e0.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC0831d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0830c f13570a = C0830c.f13567c;

    public static C0830c a(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        while (abstractComponentCallbacksC0789t != null) {
            if (abstractComponentCallbacksC0789t.f13385w != null && abstractComponentCallbacksC0789t.f13374l) {
                Intrinsics.checkNotNullExpressionValue(abstractComponentCallbacksC0789t.o(), "declaringFragment.parentFragmentManager");
            }
            abstractComponentCallbacksC0789t = abstractComponentCallbacksC0789t.f13387y;
        }
        return f13570a;
    }

    public static void b(C0830c c0830c, AbstractC0833f abstractC0833f) {
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = abstractC0833f.f13571a;
        String name = abstractComponentCallbacksC0789t.getClass().getName();
        EnumC0829b enumC0829b = EnumC0829b.f13560a;
        Set set = c0830c.f13568a;
        if (set.contains(enumC0829b)) {
            Log.d(StubApp.getString2(10103), StubApp.getString2(17254).concat(name), abstractC0833f);
        }
        if (set.contains(EnumC0829b.f13561b)) {
            com.even.translate.a aVar = new com.even.translate.a(10, name, abstractC0833f);
            if (abstractComponentCallbacksC0789t.f13385w == null || !abstractComponentCallbacksC0789t.f13374l) {
                aVar.run();
                throw null;
            }
            Handler handler = abstractComponentCallbacksC0789t.o().f13179w.f13393c;
            if (Intrinsics.areEqual(handler.getLooper(), Looper.myLooper())) {
                aVar.run();
                throw null;
            }
            handler.post(aVar);
        }
    }

    public static void c(AbstractC0833f abstractC0833f) {
        if (M.J(3)) {
            Log.d(StubApp.getString2(49), StubApp.getString2(17255).concat(abstractC0833f.f13571a.getClass().getName()), abstractC0833f);
        }
    }

    public static final void d(AbstractComponentCallbacksC0789t fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        C0828a c0828a = new C0828a(fragment, StubApp.getString2(17256) + fragment + StubApp.getString2(17257) + previousFragmentId);
        c(c0828a);
        C0830c a3 = a(fragment);
        if (a3.f13568a.contains(EnumC0829b.f13562c) && e(a3, fragment.getClass(), C0828a.class)) {
            b(a3, c0828a);
        }
    }

    public static boolean e(C0830c c0830c, Class cls, Class cls2) {
        boolean contains;
        Set set = (Set) c0830c.f13569b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!Intrinsics.areEqual(cls2.getSuperclass(), AbstractC0833f.class)) {
            contains = CollectionsKt___CollectionsKt.contains(set, cls2.getSuperclass());
            if (contains) {
                return false;
            }
        }
        return !set.contains(cls2);
    }
}
