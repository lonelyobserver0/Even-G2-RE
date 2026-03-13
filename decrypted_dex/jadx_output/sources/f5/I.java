package f5;

import com.stub.StubApp;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public String f13847a;

    /* renamed from: b, reason: collision with root package name */
    public String f13848b;

    /* renamed from: c, reason: collision with root package name */
    public String f13849c;

    /* renamed from: d, reason: collision with root package name */
    public long f13850d;

    /* renamed from: e, reason: collision with root package name */
    public Long f13851e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13852f;

    /* renamed from: g, reason: collision with root package name */
    public K f13853g;

    /* renamed from: h, reason: collision with root package name */
    public C0908k0 f13854h;

    /* renamed from: i, reason: collision with root package name */
    public C0906j0 f13855i;
    public N j;

    /* renamed from: k, reason: collision with root package name */
    public List f13856k;

    /* renamed from: l, reason: collision with root package name */
    public int f13857l;

    /* renamed from: m, reason: collision with root package name */
    public byte f13858m;

    public final J a() {
        String str;
        String str2;
        K k3;
        if (this.f13858m == 7 && (str = this.f13847a) != null && (str2 = this.f13848b) != null && (k3 = this.f13853g) != null) {
            return new J(str, str2, this.f13849c, this.f13850d, this.f13851e, this.f13852f, k3, this.f13854h, this.f13855i, this.j, this.f13856k, this.f13857l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f13847a == null) {
            sb2.append(StubApp.getString2(17546));
        }
        if (this.f13848b == null) {
            sb2.append(StubApp.getString2(17547));
        }
        if ((this.f13858m & 1) == 0) {
            sb2.append(StubApp.getString2(17548));
        }
        if ((this.f13858m & 2) == 0) {
            sb2.append(StubApp.getString2(17549));
        }
        if (this.f13853g == null) {
            sb2.append(StubApp.getString2(17550));
        }
        if ((this.f13858m & 4) == 0) {
            sb2.append(StubApp.getString2(17551));
        }
        throw new IllegalStateException(Xa.h.r(sb2, StubApp.getString2(555)));
    }
}
