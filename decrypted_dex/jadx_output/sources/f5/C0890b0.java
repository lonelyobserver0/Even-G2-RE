package f5;

import com.stub.StubApp;
import org.bouncycastle.math.ec.Tnaf;

/* renamed from: f5.b0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0890b0 {

    /* renamed from: a, reason: collision with root package name */
    public Double f13968a;

    /* renamed from: b, reason: collision with root package name */
    public int f13969b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13970c;

    /* renamed from: d, reason: collision with root package name */
    public int f13971d;

    /* renamed from: e, reason: collision with root package name */
    public long f13972e;

    /* renamed from: f, reason: collision with root package name */
    public long f13973f;

    /* renamed from: g, reason: collision with root package name */
    public byte f13974g;

    public final C0892c0 a() {
        if (this.f13974g == 31) {
            return new C0892c0(this.f13968a, this.f13969b, this.f13970c, this.f13971d, this.f13972e, this.f13973f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f13974g & 1) == 0) {
            sb2.append(StubApp.getString2(17607));
        }
        if ((this.f13974g & 2) == 0) {
            sb2.append(StubApp.getString2(17608));
        }
        if ((this.f13974g & 4) == 0) {
            sb2.append(StubApp.getString2(17609));
        }
        if ((this.f13974g & 8) == 0) {
            sb2.append(StubApp.getString2(17610));
        }
        if ((this.f13974g & Tnaf.POW_2_WIDTH) == 0) {
            sb2.append(StubApp.getString2(17611));
        }
        throw new IllegalStateException(Xa.h.r(sb2, StubApp.getString2(555)));
    }
}
