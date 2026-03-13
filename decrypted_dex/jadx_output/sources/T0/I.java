package T0;

import com.stub.StubApp;
import kotlin.UByte;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6941a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f6942b;

    /* renamed from: c, reason: collision with root package name */
    public int f6943c;

    /* renamed from: d, reason: collision with root package name */
    public long f6944d;

    /* renamed from: e, reason: collision with root package name */
    public int f6945e;

    /* renamed from: f, reason: collision with root package name */
    public int f6946f;

    /* renamed from: g, reason: collision with root package name */
    public int f6947g;

    public final void a(H h2, G g10) {
        if (this.f6943c > 0) {
            h2.c(this.f6944d, this.f6945e, this.f6946f, this.f6947g, g10);
            this.f6943c = 0;
        }
    }

    public final void b(H h2, long j, int i3, int i10, int i11, G g10) {
        AbstractC1550k.f(StubApp.getString2(6093), this.f6947g <= i10 + i11);
        if (this.f6942b) {
            int i12 = this.f6943c;
            int i13 = i12 + 1;
            this.f6943c = i13;
            if (i12 == 0) {
                this.f6944d = j;
                this.f6945e = i3;
                this.f6946f = 0;
            }
            this.f6946f += i10;
            this.f6947g = i11;
            if (i13 >= 16) {
                a(h2, g10);
            }
        }
    }

    public final void c(p pVar) {
        if (this.f6942b) {
            return;
        }
        byte[] bArr = this.f6941a;
        int i3 = 0;
        pVar.b(0, 10, bArr);
        pVar.t();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                i3 = 40 << ((bArr[(b2 & UByte.MAX_VALUE) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i3 == 0) {
            return;
        }
        this.f6942b = true;
    }
}
