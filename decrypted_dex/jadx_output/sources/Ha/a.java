package Ha;

import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.util.WeakHashMap;
import ka.AbstractC1121b;
import la.C1249a;
import ta.C1747g;
import xa.C1936d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class a extends AbstractC1121b {

    /* renamed from: l, reason: collision with root package name */
    public static final C1936d f2955l;

    /* renamed from: h, reason: collision with root package name */
    public int f2956h;

    /* renamed from: i, reason: collision with root package name */
    public C1747g f2957i;
    public Ia.b j;

    /* renamed from: k, reason: collision with root package name */
    public final WeakHashMap f2958k = new WeakHashMap();

    static {
        try {
            InputStream k3 = AbstractC0624h2.o() ? AbstractC0624h2.k(StubApp.getString2(2715)) : C1936d.class.getResourceAsStream(StubApp.getString2("2716"));
            f2955l = new C1936d(C1936d.f23119d, k3);
            k3.close();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public a() {
        a(new C1249a(6));
        a(new C1249a(1));
        a(new C1249a(0));
        a(new C1249a(7));
        a(new C1249a(4));
        a(new C1249a(3));
        a(new C1249a(2));
        a(new C1249a(10));
        a(new C1249a(11));
        a(new C1249a(8));
        a(new C1249a(9));
        a(new C1249a(12));
        a(new C1249a(18));
        a(new C1249a(19));
        a(new C1249a(14));
        a(new C1249a(5));
        a(new C1249a(15));
        a(new C1249a(16));
        a(new C1249a(17));
        a(new C1249a(13));
        a(new C1249a(20));
        a(new C1249a(21));
    }
}
