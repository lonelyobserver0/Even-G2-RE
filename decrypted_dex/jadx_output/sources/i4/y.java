package i4;

import S3.D;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.d f14829a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.common.d f14830b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.common.d[] f14831c;

    static {
        com.google.android.gms.common.d dVar = new com.google.android.gms.common.d(StubApp.getString2(18535), 1L);
        com.google.android.gms.common.d dVar2 = new com.google.android.gms.common.d(StubApp.getString2(18536), 1L);
        f14829a = dVar2;
        com.google.android.gms.common.d dVar3 = new com.google.android.gms.common.d(StubApp.getString2(18537), 1L);
        com.google.android.gms.common.d dVar4 = new com.google.android.gms.common.d(StubApp.getString2(18538), 1L);
        com.google.android.gms.common.d dVar5 = new com.google.android.gms.common.d(StubApp.getString2(6602), 2L);
        com.google.android.gms.common.d dVar6 = new com.google.android.gms.common.d(StubApp.getString2(17501), 1L);
        f14830b = dVar6;
        f14831c = new com.google.android.gms.common.d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, new com.google.android.gms.common.d(StubApp.getString2(9430), 1L), new com.google.android.gms.common.d(StubApp.getString2(8316), 1L), new com.google.android.gms.common.d(StubApp.getString2(18539), 1L), new com.google.android.gms.common.d(StubApp.getString2(6601), 1L), new com.google.android.gms.common.d(StubApp.getString2(18540), 1L), new com.google.android.gms.common.d(StubApp.getString2(18541), 1L), new com.google.android.gms.common.d(StubApp.getString2(18542), 1L), new com.google.android.gms.common.d(StubApp.getString2(18543), 1L), new com.google.android.gms.common.d(StubApp.getString2(18544), 1L)};
    }

    public static void a(int i3) {
        boolean z2 = true;
        if (i3 != 100 && i3 != 102 && i3 != 104) {
            if (i3 == 105) {
                i3 = 105;
            } else {
                z2 = false;
            }
        }
        D.c(z2, StubApp.getString2(18545), Integer.valueOf(i3));
    }

    public static String b(int i3) {
        if (i3 == 100) {
            return StubApp.getString2(18548);
        }
        if (i3 == 102) {
            return StubApp.getString2(18547);
        }
        if (i3 == 104) {
            return StubApp.getString2(18546);
        }
        if (i3 == 105) {
            return StubApp.getString2(2770);
        }
        throw new IllegalArgumentException();
    }

    public static String c(int i3) {
        if (i3 == 0) {
            return StubApp.getString2(18551);
        }
        if (i3 == 1) {
            return StubApp.getString2(18550);
        }
        if (i3 == 2) {
            return StubApp.getString2(18549);
        }
        throw new IllegalArgumentException();
    }
}
