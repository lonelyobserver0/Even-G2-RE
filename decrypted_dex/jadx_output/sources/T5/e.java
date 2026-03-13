package T5;

import N5.i;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f7195e = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final N5.g f7196a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7197b = f7195e;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f7198c = new int[32];

    /* renamed from: d, reason: collision with root package name */
    public b f7199d;

    public e(N5.g gVar) {
        this.f7196a = gVar;
    }

    public static int a(int[] iArr) {
        int length = iArr.length;
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i13 > i3) {
                i11 = i12;
                i3 = i13;
            }
            if (i13 > i10) {
                i10 = i13;
            }
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            int i17 = i16 - i11;
            int i18 = iArr[i16] * i17 * i17;
            if (i18 > i15) {
                i14 = i16;
                i15 = i18;
            }
        }
        if (i11 <= i14) {
            int i19 = i11;
            i11 = i14;
            i14 = i19;
        }
        if (i11 - i14 <= length / 16) {
            throw i.a();
        }
        int i20 = i11 - 1;
        int i21 = -1;
        int i22 = i20;
        while (i20 > i14) {
            int i23 = i20 - i14;
            int i24 = (i10 - iArr[i20]) * (i11 - i20) * i23 * i23;
            if (i24 > i21) {
                i22 = i20;
                i21 = i24;
            }
            i20--;
        }
        return i22 << 3;
    }
}
