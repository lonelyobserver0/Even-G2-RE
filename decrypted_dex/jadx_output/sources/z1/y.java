package z1;

import kotlin.UByte;
import r0.AbstractC1560u;
import r0.C1553n;
import r0.C1558s;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24014a;

    /* renamed from: b, reason: collision with root package name */
    public final C1558s f24015b;

    /* renamed from: c, reason: collision with root package name */
    public final C1553n f24016c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24017d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24018e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24019f;

    /* renamed from: g, reason: collision with root package name */
    public long f24020g;

    /* renamed from: h, reason: collision with root package name */
    public long f24021h;

    /* renamed from: i, reason: collision with root package name */
    public long f24022i;

    public y(int i3) {
        this.f24014a = i3;
        switch (i3) {
            case 1:
                this.f24015b = new C1558s(0L);
                this.f24020g = -9223372036854775807L;
                this.f24021h = -9223372036854775807L;
                this.f24022i = -9223372036854775807L;
                this.f24016c = new C1553n();
                break;
            default:
                this.f24015b = new C1558s(0L);
                this.f24020g = -9223372036854775807L;
                this.f24021h = -9223372036854775807L;
                this.f24022i = -9223372036854775807L;
                this.f24016c = new C1553n();
                break;
        }
    }

    public static int b(int i3, byte[] bArr) {
        return (bArr[i3 + 3] & UByte.MAX_VALUE) | ((bArr[i3] & UByte.MAX_VALUE) << 24) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 8);
    }

    public static long c(C1553n c1553n) {
        int i3 = c1553n.f20177b;
        if (c1553n.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c1553n.f(0, 9, bArr);
        c1553n.G(i3);
        byte b2 = bArr[0];
        if ((b2 & 196) == 68) {
            byte b10 = bArr[2];
            if ((b10 & 4) == 4) {
                byte b11 = bArr[4];
                if ((b11 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b2;
                    long j3 = b10;
                    return ((j3 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j3 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b11 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(T0.l lVar) {
        switch (this.f24014a) {
            case 0:
                byte[] bArr = AbstractC1560u.f20195f;
                C1553n c1553n = this.f24016c;
                c1553n.getClass();
                c1553n.E(bArr.length, bArr);
                this.f24017d = true;
                lVar.f7032f = 0;
                break;
            default:
                byte[] bArr2 = AbstractC1560u.f20195f;
                C1553n c1553n2 = this.f24016c;
                c1553n2.getClass();
                c1553n2.E(bArr2.length, bArr2);
                this.f24017d = true;
                lVar.f7032f = 0;
                break;
        }
    }
}
