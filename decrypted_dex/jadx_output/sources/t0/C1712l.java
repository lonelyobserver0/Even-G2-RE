package t0;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: t0.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1712l implements InterfaceC1708h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21085a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21086b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1708h f21087c;

    /* renamed from: d, reason: collision with root package name */
    public C1717q f21088d;

    /* renamed from: e, reason: collision with root package name */
    public C1702b f21089e;

    /* renamed from: f, reason: collision with root package name */
    public C1705e f21090f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1708h f21091g;

    /* renamed from: h, reason: collision with root package name */
    public C1700B f21092h;
    public C1706f j;

    /* renamed from: k, reason: collision with root package name */
    public C1724x f21093k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC1708h f21094l;

    public C1712l(Context context, InterfaceC1708h interfaceC1708h) {
        this.f21085a = StubApp.getOrigApplicationContext(context.getApplicationContext());
        interfaceC1708h.getClass();
        this.f21087c = interfaceC1708h;
        this.f21086b = new ArrayList();
    }

    public static void d(InterfaceC1708h interfaceC1708h, InterfaceC1726z interfaceC1726z) {
        if (interfaceC1708h != null) {
            interfaceC1708h.y(interfaceC1726z);
        }
    }

    public final void a(InterfaceC1708h interfaceC1708h) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f21086b;
            if (i3 >= arrayList.size()) {
                return;
            }
            interfaceC1708h.y((InterfaceC1726z) arrayList.get(i3));
            i3++;
        }
    }

    @Override // t0.InterfaceC1708h
    public final void close() {
        InterfaceC1708h interfaceC1708h = this.f21094l;
        if (interfaceC1708h != null) {
            try {
                interfaceC1708h.close();
            } finally {
                this.f21094l = null;
            }
        }
    }

    @Override // t0.InterfaceC1708h
    public final long n(C1711k c1711k) {
        AbstractC1550k.g(this.f21094l == null);
        String scheme = c1711k.f21077a.getScheme();
        int i3 = AbstractC1560u.f20190a;
        Uri uri = c1711k.f21077a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f21085a;
        if (isEmpty || StubApp.getString2(3105).equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith(StubApp.getString2(23383))) {
                if (this.f21088d == null) {
                    C1717q c1717q = new C1717q(false);
                    this.f21088d = c1717q;
                    a(c1717q);
                }
                this.f21094l = this.f21088d;
            } else {
                if (this.f21089e == null) {
                    C1702b c1702b = new C1702b(context);
                    this.f21089e = c1702b;
                    a(c1702b);
                }
                this.f21094l = this.f21089e;
            }
        } else if (StubApp.getString2(23392).equals(scheme)) {
            if (this.f21089e == null) {
                C1702b c1702b2 = new C1702b(context);
                this.f21089e = c1702b2;
                a(c1702b2);
            }
            this.f21094l = this.f21089e;
        } else if (StubApp.getString2(1248).equals(scheme)) {
            if (this.f21090f == null) {
                C1705e c1705e = new C1705e(context);
                this.f21090f = c1705e;
                a(c1705e);
            }
            this.f21094l = this.f21090f;
        } else {
            boolean equals = StubApp.getString2(23393).equals(scheme);
            InterfaceC1708h interfaceC1708h = this.f21087c;
            if (equals) {
                if (this.f21091g == null) {
                    try {
                        InterfaceC1708h interfaceC1708h2 = (InterfaceC1708h) Class.forName(StubApp.getString2("23394")).getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f21091g = interfaceC1708h2;
                        a(interfaceC1708h2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC1550k.w(StubApp.getString2(23396), StubApp.getString2(23397));
                    } catch (Exception e10) {
                        throw new RuntimeException(StubApp.getString2(23395), e10);
                    }
                    if (this.f21091g == null) {
                        this.f21091g = interfaceC1708h;
                    }
                }
                this.f21094l = this.f21091g;
            } else if (StubApp.getString2(23398).equals(scheme)) {
                if (this.f21092h == null) {
                    C1700B c1700b = new C1700B(8000);
                    this.f21092h = c1700b;
                    a(c1700b);
                }
                this.f21094l = this.f21092h;
            } else if (StubApp.getString2(1485).equals(scheme)) {
                if (this.j == null) {
                    C1706f c1706f = new C1706f(false);
                    this.j = c1706f;
                    a(c1706f);
                }
                this.f21094l = this.j;
            } else if (StubApp.getString2(23399).equals(scheme) || StubApp.getString2(9813).equals(scheme)) {
                if (this.f21093k == null) {
                    C1724x c1724x = new C1724x(context);
                    this.f21093k = c1724x;
                    a(c1724x);
                }
                this.f21094l = this.f21093k;
            } else {
                this.f21094l = interfaceC1708h;
            }
        }
        return this.f21094l.n(c1711k);
    }

    @Override // o0.InterfaceC1432g
    public final int read(byte[] bArr, int i3, int i10) {
        InterfaceC1708h interfaceC1708h = this.f21094l;
        interfaceC1708h.getClass();
        return interfaceC1708h.read(bArr, i3, i10);
    }

    @Override // t0.InterfaceC1708h
    public final Map s() {
        InterfaceC1708h interfaceC1708h = this.f21094l;
        return interfaceC1708h == null ? Collections.EMPTY_MAP : interfaceC1708h.s();
    }

    @Override // t0.InterfaceC1708h
    public final void y(InterfaceC1726z interfaceC1726z) {
        interfaceC1726z.getClass();
        this.f21087c.y(interfaceC1726z);
        this.f21086b.add(interfaceC1726z);
        d(this.f21088d, interfaceC1726z);
        d(this.f21089e, interfaceC1726z);
        d(this.f21090f, interfaceC1726z);
        d(this.f21091g, interfaceC1726z);
        d(this.f21092h, interfaceC1726z);
        d(this.j, interfaceC1726z);
        d(this.f21093k, interfaceC1726z);
    }

    @Override // t0.InterfaceC1708h
    public final Uri z() {
        InterfaceC1708h interfaceC1708h = this.f21094l;
        if (interfaceC1708h == null) {
            return null;
        }
        return interfaceC1708h.z();
    }
}
