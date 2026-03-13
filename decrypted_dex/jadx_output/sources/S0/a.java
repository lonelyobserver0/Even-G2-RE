package S0;

import com.stub.StubApp;
import java.nio.ByteBuffer;
import o0.C1438m;
import r0.AbstractC1560u;
import r0.C1553n;
import u0.e;
import v0.AbstractC1810e;
import v0.C1803F;
import v0.C1828x;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends AbstractC1810e {

    /* renamed from: t, reason: collision with root package name */
    public final e f6445t;

    /* renamed from: v, reason: collision with root package name */
    public final C1553n f6446v;

    /* renamed from: w, reason: collision with root package name */
    public C1828x f6447w;

    /* renamed from: x, reason: collision with root package name */
    public long f6448x;

    public a() {
        super(6);
        this.f6445t = new e(1);
        this.f6446v = new C1553n();
    }

    @Override // v0.AbstractC1810e
    public final int B(C1438m c1438m) {
        return StubApp.getString2(5923).equals(c1438m.f18216n) ? AbstractC1810e.f(4, 0, 0, 0) : AbstractC1810e.f(0, 0, 0, 0);
    }

    @Override // v0.AbstractC1810e, v0.Y
    public final void d(int i3, Object obj) {
        if (i3 == 8) {
            this.f6447w = (C1828x) obj;
        }
    }

    @Override // v0.AbstractC1810e
    public final String j() {
        return StubApp.getString2(5924);
    }

    @Override // v0.AbstractC1810e
    public final boolean l() {
        return k();
    }

    @Override // v0.AbstractC1810e
    public final boolean n() {
        return true;
    }

    @Override // v0.AbstractC1810e
    public final void o() {
        C1828x c1828x = this.f6447w;
        if (c1828x != null) {
            c1828x.b();
        }
    }

    @Override // v0.AbstractC1810e
    public final void q(long j, boolean z2) {
        this.f6448x = Long.MIN_VALUE;
        C1828x c1828x = this.f6447w;
        if (c1828x != null) {
            c1828x.b();
        }
    }

    @Override // v0.AbstractC1810e
    public final void x(long j, long j3) {
        float[] fArr;
        while (!k() && this.f6448x < 100000 + j) {
            e eVar = this.f6445t;
            eVar.s();
            C1803F c1803f = this.f21718c;
            c1803f.c();
            if (w(c1803f, eVar, 0) != -4 || eVar.k(4)) {
                return;
            }
            long j10 = eVar.f21398g;
            this.f6448x = j10;
            boolean z2 = j10 < this.f21726m;
            if (this.f6447w != null && !z2) {
                eVar.v();
                ByteBuffer byteBuffer = eVar.f21396e;
                int i3 = AbstractC1560u.f20190a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    C1553n c1553n = this.f6446v;
                    c1553n.E(limit, array);
                    c1553n.G(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i10 = 0; i10 < 3; i10++) {
                        fArr2[i10] = Float.intBitsToFloat(c1553n.j());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f6447w.a();
                }
            }
        }
    }
}
