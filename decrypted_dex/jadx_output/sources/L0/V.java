package L0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
import r0.AbstractC1560u;
import r0.C1553n;
import s.C1590a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final P0.e f3998a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3999b;

    /* renamed from: c, reason: collision with root package name */
    public final C1553n f4000c;

    /* renamed from: d, reason: collision with root package name */
    public U f4001d;

    /* renamed from: e, reason: collision with root package name */
    public U f4002e;

    /* renamed from: f, reason: collision with root package name */
    public U f4003f;

    /* renamed from: g, reason: collision with root package name */
    public long f4004g;

    public V(P0.e eVar) {
        this.f3998a = eVar;
        int i3 = eVar.f5386b;
        this.f3999b = i3;
        this.f4000c = new C1553n(32);
        U u2 = new U(0L, i3);
        this.f4001d = u2;
        this.f4002e = u2;
        this.f4003f = u2;
    }

    public static U d(U u2, long j, ByteBuffer byteBuffer, int i3) {
        while (j >= u2.f3995b) {
            u2 = (U) u2.f3997d;
        }
        while (i3 > 0) {
            int min = Math.min(i3, (int) (u2.f3995b - j));
            P0.a aVar = (P0.a) u2.f3996c;
            byteBuffer.put(aVar.f5376a, ((int) (j - u2.f3994a)) + aVar.f5377b, min);
            i3 -= min;
            j += min;
            if (j == u2.f3995b) {
                u2 = (U) u2.f3997d;
            }
        }
        return u2;
    }

    public static U e(U u2, long j, byte[] bArr, int i3) {
        while (j >= u2.f3995b) {
            u2 = (U) u2.f3997d;
        }
        int i10 = i3;
        while (i10 > 0) {
            int min = Math.min(i10, (int) (u2.f3995b - j));
            P0.a aVar = (P0.a) u2.f3996c;
            System.arraycopy(aVar.f5376a, ((int) (j - u2.f3994a)) + aVar.f5377b, bArr, i3 - i10, min);
            i10 -= min;
            j += min;
            if (j == u2.f3995b) {
                u2 = (U) u2.f3997d;
            }
        }
        return u2;
    }

    public static U f(U u2, u0.e eVar, D0.g gVar, C1553n c1553n) {
        int i3;
        if (eVar.k(1073741824)) {
            long j = gVar.f1245b;
            c1553n.D(1);
            U e10 = e(u2, j, c1553n.f20176a, 1);
            long j3 = j + 1;
            byte b2 = c1553n.f20176a[0];
            boolean z2 = (b2 & ByteCompanionObject.MIN_VALUE) != 0;
            int i10 = b2 & ByteCompanionObject.MAX_VALUE;
            u0.b bVar = eVar.f21395d;
            byte[] bArr = bVar.f21385a;
            if (bArr == null) {
                bVar.f21385a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            u2 = e(e10, j3, bVar.f21385a, i10);
            long j10 = j3 + i10;
            if (z2) {
                c1553n.D(2);
                u2 = e(u2, j10, c1553n.f20176a, 2);
                j10 += 2;
                i3 = c1553n.A();
            } else {
                i3 = 1;
            }
            int[] iArr = bVar.f21388d;
            if (iArr == null || iArr.length < i3) {
                iArr = new int[i3];
            }
            int[] iArr2 = bVar.f21389e;
            if (iArr2 == null || iArr2.length < i3) {
                iArr2 = new int[i3];
            }
            if (z2) {
                int i11 = i3 * 6;
                c1553n.D(i11);
                u2 = e(u2, j10, c1553n.f20176a, i11);
                j10 += i11;
                c1553n.G(0);
                for (int i12 = 0; i12 < i3; i12++) {
                    iArr[i12] = c1553n.A();
                    iArr2[i12] = c1553n.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = gVar.f1244a - ((int) (j10 - gVar.f1245b));
            }
            T0.G g10 = (T0.G) gVar.f1246c;
            int i13 = AbstractC1560u.f20190a;
            byte[] bArr2 = g10.f6938b;
            byte[] bArr3 = bVar.f21385a;
            bVar.f21390f = i3;
            bVar.f21388d = iArr;
            bVar.f21389e = iArr2;
            bVar.f21386b = bArr2;
            bVar.f21385a = bArr3;
            int i14 = g10.f6937a;
            bVar.f21387c = i14;
            int i15 = g10.f6939c;
            bVar.f21391g = i15;
            int i16 = g10.f6940d;
            bVar.f21392h = i16;
            MediaCodec.CryptoInfo cryptoInfo = bVar.f21393i;
            cryptoInfo.numSubSamples = i3;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (AbstractC1560u.f20190a >= 24) {
                C1590a c1590a = bVar.j;
                c1590a.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) c1590a.f20575b;
                pattern.set(i15, i16);
                ((MediaCodec.CryptoInfo) c1590a.f20574a).setPattern(pattern);
            }
            long j11 = gVar.f1245b;
            int i17 = (int) (j10 - j11);
            gVar.f1245b = j11 + i17;
            gVar.f1244a -= i17;
        }
        if (!eVar.k(268435456)) {
            eVar.u(gVar.f1244a);
            return d(u2, gVar.f1245b, eVar.f21396e, gVar.f1244a);
        }
        c1553n.D(4);
        U e11 = e(u2, gVar.f1245b, c1553n.f20176a, 4);
        int y10 = c1553n.y();
        gVar.f1245b += 4;
        gVar.f1244a -= 4;
        eVar.u(y10);
        U d8 = d(e11, gVar.f1245b, eVar.f21396e, y10);
        gVar.f1245b += y10;
        int i18 = gVar.f1244a - y10;
        gVar.f1244a = i18;
        ByteBuffer byteBuffer = eVar.f21399h;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            eVar.f21399h = ByteBuffer.allocate(i18);
        } else {
            eVar.f21399h.clear();
        }
        return d(d8, gVar.f1245b, eVar.f21399h, gVar.f1244a);
    }

    public final void a(U u2) {
        if (((P0.a) u2.f3996c) == null) {
            return;
        }
        P0.e eVar = this.f3998a;
        synchronized (eVar) {
            U u10 = u2;
            while (u10 != null) {
                try {
                    P0.a[] aVarArr = eVar.f5390f;
                    int i3 = eVar.f5389e;
                    eVar.f5389e = i3 + 1;
                    P0.a aVar = (P0.a) u10.f3996c;
                    aVar.getClass();
                    aVarArr[i3] = aVar;
                    eVar.f5388d--;
                    u10 = (U) u10.f3997d;
                    if (u10 == null || ((P0.a) u10.f3996c) == null) {
                        u10 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            eVar.notifyAll();
        }
        u2.f3996c = null;
        u2.f3997d = null;
    }

    public final void b(long j) {
        U u2;
        if (j == -1) {
            return;
        }
        while (true) {
            u2 = this.f4001d;
            if (j < u2.f3995b) {
                break;
            }
            P0.e eVar = this.f3998a;
            P0.a aVar = (P0.a) u2.f3996c;
            synchronized (eVar) {
                P0.a[] aVarArr = eVar.f5390f;
                int i3 = eVar.f5389e;
                eVar.f5389e = i3 + 1;
                aVarArr[i3] = aVar;
                eVar.f5388d--;
                eVar.notifyAll();
            }
            U u10 = this.f4001d;
            u10.f3996c = null;
            U u11 = (U) u10.f3997d;
            u10.f3997d = null;
            this.f4001d = u11;
        }
        if (this.f4002e.f3994a < u2.f3994a) {
            this.f4002e = u2;
        }
    }

    public final int c(int i3) {
        P0.a aVar;
        U u2 = this.f4003f;
        if (((P0.a) u2.f3996c) == null) {
            P0.e eVar = this.f3998a;
            synchronized (eVar) {
                try {
                    int i10 = eVar.f5388d + 1;
                    eVar.f5388d = i10;
                    int i11 = eVar.f5389e;
                    if (i11 > 0) {
                        P0.a[] aVarArr = eVar.f5390f;
                        int i12 = i11 - 1;
                        eVar.f5389e = i12;
                        aVar = aVarArr[i12];
                        aVar.getClass();
                        eVar.f5390f[eVar.f5389e] = null;
                    } else {
                        P0.a aVar2 = new P0.a(new byte[eVar.f5386b], 0);
                        P0.a[] aVarArr2 = eVar.f5390f;
                        if (i10 > aVarArr2.length) {
                            eVar.f5390f = (P0.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            U u10 = new U(this.f4003f.f3995b, this.f3999b);
            u2.f3996c = aVar;
            u2.f3997d = u10;
        }
        return Math.min(i3, (int) (this.f4003f.f3995b - this.f4004g));
    }
}
