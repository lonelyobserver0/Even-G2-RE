package U6;

import a.AbstractC0378a;
import com.mapbox.bindgen.Value;
import com.stub.StubApp;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7460a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7461b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7462c;

    /* renamed from: d, reason: collision with root package name */
    public String f7463d;

    /* renamed from: e, reason: collision with root package name */
    public String f7464e;

    public a(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        this.f7460a = sourceId;
        this.f7461b = new HashMap();
        this.f7462c = new HashMap();
        this.f7464e = "";
    }

    public static void c(a aVar, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter("", StubApp.getString2(2238));
        aVar.f7463d = value;
        aVar.f7464e = "";
    }

    public final c a() {
        Value H2 = AbstractC0378a.H("");
        String string2 = StubApp.getString2(1485);
        this.f7461b.put(string2, new R6.a(string2, H2));
        return new c(this);
    }

    public final void b(boolean z2) {
        Value H2 = AbstractC0378a.H(Boolean.valueOf(z2));
        String string2 = StubApp.getString2(6369);
        this.f7461b.put(string2, new R6.a(string2, H2));
    }
}
