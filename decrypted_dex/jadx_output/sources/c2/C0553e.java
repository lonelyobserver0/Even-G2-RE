package c2;

import Z9.q;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import q8.AbstractC1526a;

/* renamed from: c2.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0553e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f10792a;

    /* renamed from: b, reason: collision with root package name */
    public final q f10793b;

    /* renamed from: c, reason: collision with root package name */
    public final s2.d f10794c;

    public C0553e(ClassLoader loader, q consumerAdapter) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(consumerAdapter, "consumerAdapter");
        this.f10792a = loader;
        this.f10793b = consumerAdapter;
        this.f10794c = new s2.d(loader);
    }

    public final WindowLayoutComponent a() {
        s2.d dVar = this.f10794c;
        dVar.getClass();
        Y1.a classLoader = new Y1.a(dVar, 0);
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        boolean z2 = false;
        try {
            classLoader.invoke();
            if (AbstractC1526a.O(StubApp.getString2(9394), new Y1.a(dVar, 1))) {
                if (AbstractC1526a.O(StubApp.getString2(9395), new C0552d(this, 3))) {
                    if (AbstractC1526a.O(StubApp.getString2(9396), new C0552d(this, 0))) {
                        int a3 = Z1.e.a();
                        if (a3 == 1) {
                            z2 = b();
                        } else if (2 <= a3 && a3 <= Integer.MAX_VALUE && b() && AbstractC1526a.O(Xa.h.k(Context.class, new StringBuilder(StubApp.getString2(9397)), StubApp.getString2(9398)), new C0552d(this, 2))) {
                            z2 = true;
                        }
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z2) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return AbstractC1526a.O(Xa.h.k(Activity.class, new StringBuilder(StubApp.getString2(9397)), StubApp.getString2(9399)), new C0552d(this, 1));
    }
}
