package B3;

import android.content.Context;
import com.stub.StubApp;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import p0.AbstractC1482f;
import y3.C1970c;
import z3.C2005a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static volatile l f655e;

    /* renamed from: a, reason: collision with root package name */
    public final K3.a f656a;

    /* renamed from: b, reason: collision with root package name */
    public final K3.a f657b;

    /* renamed from: c, reason: collision with root package name */
    public final G3.c f658c;

    /* renamed from: d, reason: collision with root package name */
    public final H3.i f659d;

    public t(K3.a aVar, K3.a aVar2, G3.c cVar, H3.i iVar, H3.j jVar) {
        this.f656a = aVar;
        this.f657b = aVar2;
        this.f658c = cVar;
        this.f659d = iVar;
        jVar.getClass();
        jVar.f2733a.execute(new B0.o(jVar, 5));
    }

    public static t a() {
        l lVar = f655e;
        if (lVar != null) {
            return (t) lVar.f637f.get();
        }
        throw new IllegalStateException(StubApp.getString2(635));
    }

    public static void b(Context context) {
        if (f655e == null) {
            synchronized (t.class) {
                try {
                    if (f655e == null) {
                        k kVar = new k();
                        context.getClass();
                        kVar.f631a = context;
                        f655e = kVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final r c(C2005a c2005a) {
        byte[] bytes;
        Set unmodifiableSet = c2005a != null ? Collections.unmodifiableSet(C2005a.f24031d) : Collections.singleton(new C1970c(StubApp.getString2(636)));
        Q2.g a3 = j.a();
        c2005a.getClass();
        a3.f5711b = StubApp.getString2(637);
        String str = c2005a.f24034a;
        String str2 = c2005a.f24035b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = AbstractC1482f.i(StubApp.getString2(638), str, StubApp.getString2(639), str2).getBytes(Charset.forName(StubApp.getString2(640)));
        }
        a3.f5712c = bytes;
        return new r(unmodifiableSet, a3.u(), this);
    }
}
