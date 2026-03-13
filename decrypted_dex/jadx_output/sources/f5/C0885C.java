package f5;

import com.stub.StubApp;
import java.util.List;
import org.bouncycastle.math.ec.Tnaf;

/* renamed from: f5.C, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0885C {

    /* renamed from: a, reason: collision with root package name */
    public int f13820a;

    /* renamed from: b, reason: collision with root package name */
    public String f13821b;

    /* renamed from: c, reason: collision with root package name */
    public int f13822c;

    /* renamed from: d, reason: collision with root package name */
    public int f13823d;

    /* renamed from: e, reason: collision with root package name */
    public long f13824e;

    /* renamed from: f, reason: collision with root package name */
    public long f13825f;

    /* renamed from: g, reason: collision with root package name */
    public long f13826g;

    /* renamed from: h, reason: collision with root package name */
    public String f13827h;

    /* renamed from: i, reason: collision with root package name */
    public List f13828i;
    public byte j;

    public final C0886D a() {
        String str;
        if (this.j == 63 && (str = this.f13821b) != null) {
            return new C0886D(this.f13820a, str, this.f13822c, this.f13823d, this.f13824e, this.f13825f, this.f13826g, this.f13827h, this.f13828i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb2.append(StubApp.getString2(17525));
        }
        if (this.f13821b == null) {
            sb2.append(StubApp.getString2(17526));
        }
        if ((this.j & 2) == 0) {
            sb2.append(StubApp.getString2(17527));
        }
        if ((this.j & 4) == 0) {
            sb2.append(StubApp.getString2(17528));
        }
        if ((this.j & 8) == 0) {
            sb2.append(StubApp.getString2(17529));
        }
        if ((this.j & Tnaf.POW_2_WIDTH) == 0) {
            sb2.append(StubApp.getString2(17530));
        }
        if ((this.j & 32) == 0) {
            sb2.append(StubApp.getString2(17531));
        }
        throw new IllegalStateException(Xa.h.r(sb2, StubApp.getString2(555)));
    }
}
