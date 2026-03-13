package da;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class L extends H {

    /* renamed from: f, reason: collision with root package name */
    public int[] f13484f;

    /* renamed from: g, reason: collision with root package name */
    public short[] f13485g;

    /* renamed from: h, reason: collision with root package name */
    public short[] f13486h;

    /* renamed from: i, reason: collision with root package name */
    public int f13487i;

    @Override // da.H
    public final void a(J j, F f10) {
        int i3;
        K k3 = (K) j.C(StubApp.getString2(17138));
        if (k3 == null) {
            throw new IOException(StubApp.getString2(17159));
        }
        this.f13487i = k3.f13483f;
        int A4 = j.A();
        int i10 = this.f13487i;
        this.f13484f = new int[i10];
        this.f13485g = new short[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i3 = this.f13487i;
            if (i11 >= i3) {
                break;
            }
            this.f13484f[i11] = f10.G();
            this.f13485g[i11] = f10.A();
            i12 += 4;
            i11++;
        }
        if (i12 < this.f13471c) {
            int i13 = A4 - i3;
            if (i13 >= 0) {
                A4 = i13;
            }
            this.f13486h = new short[A4];
            for (int i14 = 0; i14 < A4; i14++) {
                if (i12 < this.f13471c) {
                    this.f13486h[i14] = f10.A();
                    i12 += 2;
                }
            }
        }
        this.f13472d = true;
    }
}
