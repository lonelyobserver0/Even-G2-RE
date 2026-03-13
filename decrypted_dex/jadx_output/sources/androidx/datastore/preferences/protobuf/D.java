package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class D {

    /* renamed from: b, reason: collision with root package name */
    public static final r f9704b = new r(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f9705a;

    public D(C0411k c0411k) {
        AbstractC0422w.a(c0411k, "output");
        this.f9705a = c0411k;
        c0411k.f9811b = this;
    }

    public void a(int i3, Object obj, U u2) {
        C0411k c0411k = (C0411k) this.f9705a;
        c0411k.j0(i3, 3);
        u2.e((AbstractC0401a) obj, c0411k.f9811b);
        c0411k.j0(i3, 4);
    }

    public D() {
        Q q10 = Q.f9734c;
        Object obj = f9704b;
        try {
            obj = (J) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
        J[] jArr = {r.f9848b, obj};
        C c10 = new C();
        c10.f9703a = jArr;
        Charset charset = AbstractC0422w.f9852a;
        this.f9705a = c10;
    }
}
