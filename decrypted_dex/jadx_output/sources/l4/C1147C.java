package l4;

import cb.C0585c;
import com.stub.StubApp;

/* renamed from: l4.C, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1147C {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f15914f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f15915a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1217w f15916b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15917c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15918d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f15919e = null;

    public /* synthetic */ C1147C(String str, Object obj, InterfaceC1217w interfaceC1217w) {
        this.f15915a = str;
        this.f15917c = obj;
        this.f15916b = interfaceC1217w;
    }

    public final Object a(Object obj) {
        synchronized (this.f15918d) {
        }
        if (obj != null) {
            return obj;
        }
        if (A0.f15908k == null) {
            return this.f15917c;
        }
        synchronized (f15914f) {
            try {
                if (C0585c.g()) {
                    return this.f15919e == null ? this.f15917c : this.f15919e;
                }
                try {
                    for (C1147C c1147c : AbstractC1148D.f15973a) {
                        if (C0585c.g()) {
                            throw new IllegalStateException(StubApp.getString2("19605"));
                        }
                        Object obj2 = null;
                        try {
                            InterfaceC1217w interfaceC1217w = c1147c.f15916b;
                            if (interfaceC1217w != null) {
                                obj2 = interfaceC1217w.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f15914f) {
                            c1147c.f15919e = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC1217w interfaceC1217w2 = this.f15916b;
                if (interfaceC1217w2 != null) {
                    try {
                        return interfaceC1217w2.a();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f15917c;
            } finally {
            }
        }
    }
}
