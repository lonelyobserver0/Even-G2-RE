package da;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r extends H {

    /* renamed from: f, reason: collision with root package name */
    public int[] f13528f;

    /* renamed from: g, reason: collision with root package name */
    public short[] f13529g;

    /* renamed from: h, reason: collision with root package name */
    public short[] f13530h;

    /* renamed from: i, reason: collision with root package name */
    public int f13531i;

    @Override // da.H
    public final void a(J j, F f10) {
        int i3;
        q qVar = (q) j.C(StubApp.getString2(17131));
        if (qVar == null) {
            throw new IOException(StubApp.getString2(17223));
        }
        this.f13531i = qVar.f13527f;
        int A4 = j.A();
        int i10 = this.f13531i;
        this.f13528f = new int[i10];
        this.f13529g = new short[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i3 = this.f13531i;
            if (i11 >= i3) {
                break;
            }
            this.f13528f[i11] = f10.G();
            this.f13529g[i11] = f10.A();
            i12 += 4;
            i11++;
        }
        int i13 = A4 - i3;
        if (i13 >= 0) {
            A4 = i13;
        }
        this.f13530h = new short[A4];
        if (i12 < this.f13471c) {
            for (int i14 = 0; i14 < A4; i14++) {
                if (i12 < this.f13471c) {
                    this.f13530h[i14] = f10.A();
                    i12 += 2;
                }
            }
        }
        this.f13472d = true;
    }
}
