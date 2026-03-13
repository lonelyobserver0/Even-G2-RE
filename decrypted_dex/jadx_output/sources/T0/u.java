package T0;

import com.stub.StubApp;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;
import l4.E0;
import o0.AbstractC1405B;
import o0.C1404A;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f7047a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7048b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7049c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7050d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7051e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7052f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7053g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7054h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7055i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final E0 f7056k;

    /* renamed from: l, reason: collision with root package name */
    public final C1404A f7057l;

    public u(byte[] bArr, int i3) {
        J j = new J(bArr, bArr.length);
        j.q(i3 * 8);
        this.f7047a = j.i(16);
        this.f7048b = j.i(16);
        this.f7049c = j.i(24);
        this.f7050d = j.i(24);
        int i10 = j.i(20);
        this.f7051e = i10;
        this.f7052f = d(i10);
        this.f7053g = j.i(3) + 1;
        int i11 = j.i(5) + 1;
        this.f7054h = i11;
        this.f7055i = a(i11);
        this.j = j.k(36);
        this.f7056k = null;
        this.f7057l = null;
    }

    public static int a(int i3) {
        if (i3 == 8) {
            return 1;
        }
        if (i3 == 12) {
            return 2;
        }
        if (i3 == 16) {
            return 4;
        }
        if (i3 != 20) {
            return i3 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i3) {
        switch (i3) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f7051e;
    }

    public final C1438m c(byte[] bArr, C1404A c1404a) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        int i3 = this.f7050d;
        if (i3 <= 0) {
            i3 = -1;
        }
        C1404A c1404a2 = this.f7057l;
        if (c1404a2 != null) {
            c1404a = c1404a2.e(c1404a);
        }
        C1437l c1437l = new C1437l();
        c1437l.f18177m = AbstractC1405B.m(StubApp.getString2(1627));
        c1437l.f18178n = i3;
        c1437l.f18156B = this.f7053g;
        c1437l.f18157C = this.f7051e;
        c1437l.f18158D = AbstractC1560u.y(this.f7054h);
        c1437l.f18180p = Collections.singletonList(bArr);
        c1437l.f18175k = c1404a;
        return new C1438m(c1437l);
    }

    public u(int i3, int i10, int i11, int i12, int i13, int i14, int i15, long j, E0 e02, C1404A c1404a) {
        this.f7047a = i3;
        this.f7048b = i10;
        this.f7049c = i11;
        this.f7050d = i12;
        this.f7051e = i13;
        this.f7052f = d(i13);
        this.f7053g = i14;
        this.f7054h = i15;
        this.f7055i = a(i15);
        this.j = j;
        this.f7056k = e02;
        this.f7057l = c1404a;
    }
}
