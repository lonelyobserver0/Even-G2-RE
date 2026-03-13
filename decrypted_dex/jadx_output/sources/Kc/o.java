package Kc;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final t f3837a;

    static {
        t tVar;
        try {
            Class.forName(StubApp.getString2("25374"));
            tVar = new u();
        } catch (ClassNotFoundException unused) {
            tVar = new t();
        }
        f3837a = tVar;
        String str = y.f3858b;
        String property = System.getProperty(StubApp.getString2(15716));
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        C2.i.v(property, false);
        ClassLoader classLoader = Lc.g.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        new Lc.g(classLoader);
    }

    public final boolean a(y path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return b(path) != null;
    }

    public abstract n b(y yVar);
}
