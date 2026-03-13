package c2;

import Z9.q;
import androidx.window.extensions.layout.WindowLayoutComponent;
import e2.C0837a;
import e2.C0839c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: c2.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0554f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0554f f10795a = new C0554f(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WindowLayoutComponent component;
        try {
            ClassLoader loader = InterfaceC0556h.class.getClassLoader();
            C0553e c0553e = loader != null ? new C0553e(loader, new q(loader)) : null;
            if (c0553e != null && (component = c0553e.a()) != null) {
                Intrinsics.checkNotNullExpressionValue(loader, "loader");
                q adapter = new q(loader);
                Intrinsics.checkNotNullParameter(component, "component");
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                int a3 = Z1.e.a();
                return a3 >= 2 ? new e2.d(component) : a3 == 1 ? new C0839c(component, adapter) : new C0837a();
            }
        } catch (Throwable unused) {
            C0555g c0555g = C0555g.f10796a;
        }
        return null;
    }
}
