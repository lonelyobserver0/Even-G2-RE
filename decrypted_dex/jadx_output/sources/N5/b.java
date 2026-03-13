package N5;

import java.lang.reflect.Array;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final T5.e f4880a;

    /* renamed from: b, reason: collision with root package name */
    public T5.b f4881b;

    public b(T5.e eVar) {
        this.f4880a = eVar;
    }

    public final T5.b a() {
        int[] iArr;
        if (this.f4881b == null) {
            T5.e eVar = this.f4880a;
            T5.b bVar = eVar.f7199d;
            if (bVar == null) {
                g gVar = eVar.f7196a;
                int i3 = gVar.f4897a;
                int i10 = 0;
                boolean z2 = true;
                int i11 = gVar.f4898b;
                if (i3 < 40 || i11 < 40) {
                    T5.b bVar2 = new T5.b(i3, i11);
                    if (eVar.f7197b.length < i3) {
                        eVar.f7197b = new byte[i3];
                    }
                    int i12 = 0;
                    while (true) {
                        iArr = eVar.f7198c;
                        if (i12 >= 32) {
                            break;
                        }
                        iArr[i12] = 0;
                        i12++;
                    }
                    for (int i13 = 1; i13 < 5; i13++) {
                        byte[] b2 = gVar.b((i11 * i13) / 5, eVar.f7197b);
                        int i14 = (i3 * 4) / 5;
                        for (int i15 = i3 / 5; i15 < i14; i15++) {
                            int i16 = (b2[i15] & UByte.MAX_VALUE) >> 3;
                            iArr[i16] = iArr[i16] + 1;
                        }
                    }
                    int a3 = T5.e.a(iArr);
                    byte[] a9 = gVar.a();
                    for (int i17 = 0; i17 < i11; i17++) {
                        int i18 = i17 * i3;
                        for (int i19 = 0; i19 < i3; i19++) {
                            if ((a9[i18 + i19] & UByte.MAX_VALUE) < a3) {
                                bVar2.h(i19, i17);
                            }
                        }
                    }
                    eVar.f7199d = bVar2;
                } else {
                    byte[] a10 = gVar.a();
                    int i20 = i3 >> 3;
                    if ((i3 & 7) != 0) {
                        i20++;
                    }
                    int i21 = i11 >> 3;
                    if ((i11 & 7) != 0) {
                        i21++;
                    }
                    int i22 = i11 - 8;
                    int i23 = i3 - 8;
                    int i24 = 2;
                    int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i21, i20);
                    int i25 = 0;
                    while (true) {
                        int i26 = 8;
                        if (i25 >= i21) {
                            break;
                        }
                        int i27 = i10;
                        int i28 = i25 << 3;
                        if (i28 > i22) {
                            i28 = i22;
                        }
                        boolean z10 = z2;
                        int i29 = i27;
                        while (i29 < i20) {
                            int i30 = i24;
                            int i31 = i29 << 3;
                            if (i31 > i23) {
                                i31 = i23;
                            }
                            int i32 = (i28 * i3) + i31;
                            int i33 = i27;
                            int i34 = i33;
                            int i35 = i34;
                            int i36 = 255;
                            while (i33 < i26) {
                                byte[] bArr = a10;
                                int i37 = i28;
                                int i38 = i27;
                                int i39 = i35;
                                int i40 = i36;
                                while (i38 < i26) {
                                    int i41 = i38;
                                    int i42 = bArr[i32 + i38] & UByte.MAX_VALUE;
                                    i34 += i42;
                                    if (i42 < i40) {
                                        i40 = i42;
                                    }
                                    if (i42 > i39) {
                                        i39 = i42;
                                    }
                                    i38 = i41 + 1;
                                    i26 = 8;
                                }
                                if (i39 - i40 > 24) {
                                    while (true) {
                                        i33++;
                                        i32 += i3;
                                        if (i33 < 8) {
                                            int i43 = i27;
                                            for (int i44 = 8; i43 < i44; i44 = 8) {
                                                i34 += bArr[i32 + i43] & UByte.MAX_VALUE;
                                                i43++;
                                                i40 = i40;
                                            }
                                        }
                                    }
                                }
                                i33++;
                                i32 += i3;
                                i36 = i40;
                                a10 = bArr;
                                i28 = i37;
                                i26 = 8;
                                i35 = i39;
                            }
                            byte[] bArr2 = a10;
                            int i45 = i28;
                            int i46 = i34 >> 6;
                            int i47 = i36;
                            if (i35 - i47 <= 24) {
                                i46 = i47 / 2;
                                if (i25 > 0 && i29 > 0) {
                                    int[] iArr3 = iArr2[i25 - 1];
                                    int i48 = i29 - 1;
                                    int i49 = (((iArr2[i25][i48] * 2) + iArr3[i29]) + iArr3[i48]) / 4;
                                    if (i47 < i49) {
                                        i46 = i49;
                                    }
                                }
                            }
                            iArr2[i25][i29] = i46;
                            i29++;
                            i24 = i30;
                            a10 = bArr2;
                            i28 = i45;
                            i26 = 8;
                        }
                        i25++;
                        i10 = i27;
                        z2 = z10;
                    }
                    byte[] bArr3 = a10;
                    int i50 = i10;
                    int i51 = i24;
                    T5.b bVar3 = new T5.b(i3, i11);
                    int i52 = i50;
                    while (i52 < i21) {
                        int i53 = i52 << 3;
                        if (i53 > i22) {
                            i53 = i22;
                        }
                        int min = i52 < i51 ? 2 : Math.min(i52, i21 - 3);
                        int i54 = i50;
                        while (i54 < i20) {
                            int i55 = i54 << 3;
                            if (i55 > i23) {
                                i55 = i23;
                            }
                            int min2 = i54 < 2 ? 2 : Math.min(i54, i20 - 3);
                            int i56 = i52;
                            int i57 = -2;
                            int i58 = i50;
                            for (int i59 = 2; i57 <= i59; i59 = 2) {
                                int[] iArr4 = iArr2[min + i57];
                                i58 = iArr4[min2 - 2] + iArr4[min2 - 1] + iArr4[min2] + iArr4[min2 + 1] + iArr4[min2 + 2] + i58;
                                i57++;
                            }
                            int i60 = i58 / 25;
                            int i61 = (i53 * i3) + i55;
                            int i62 = i53;
                            int i63 = i50;
                            while (true) {
                                if (i63 < 8) {
                                    int i64 = i63;
                                    int i65 = i50;
                                    for (int i66 = 8; i65 < i66; i66 = 8) {
                                        int i67 = i65;
                                        if ((bArr3[i61 + i65] & UByte.MAX_VALUE) <= i60) {
                                            bVar3.h(i55 + i67, i62 + i64);
                                        }
                                        i65 = i67 + 1;
                                    }
                                    i63 = i64 + 1;
                                    i61 += i3;
                                }
                            }
                            i54++;
                            i53 = i62;
                            i52 = i56;
                        }
                        i51 = 2;
                        i52++;
                    }
                    eVar.f7199d = bVar3;
                }
                bVar = eVar.f7199d;
            }
            this.f4881b = bVar;
        }
        return this.f4881b;
    }

    public final T5.a b(T5.a aVar, int i3) {
        int[] iArr;
        T5.e eVar = this.f4880a;
        g gVar = eVar.f7196a;
        int i10 = gVar.f4897a;
        if (aVar.f7182b < i10) {
            aVar = new T5.a(i10);
        } else {
            int length = aVar.f7181a.length;
            for (int i11 = 0; i11 < length; i11++) {
                aVar.f7181a[i11] = 0;
            }
        }
        if (eVar.f7197b.length < i10) {
            eVar.f7197b = new byte[i10];
        }
        int i12 = 0;
        while (true) {
            iArr = eVar.f7198c;
            if (i12 >= 32) {
                break;
            }
            iArr[i12] = 0;
            i12++;
        }
        byte[] b2 = gVar.b(i3, eVar.f7197b);
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = (b2[i13] & UByte.MAX_VALUE) >> 3;
            iArr[i14] = iArr[i14] + 1;
        }
        int a3 = T5.e.a(iArr);
        if (i10 < 3) {
            for (int i15 = 0; i15 < i10; i15++) {
                if ((b2[i15] & UByte.MAX_VALUE) < a3) {
                    aVar.f(i15);
                }
            }
        } else {
            int i16 = b2[0] & UByte.MAX_VALUE;
            int i17 = b2[1] & UByte.MAX_VALUE;
            int i18 = 1;
            while (i18 < i10 - 1) {
                int i19 = i18 + 1;
                int i20 = b2[i19] & UByte.MAX_VALUE;
                if ((((i17 * 4) - i16) - i20) / 2 < a3) {
                    aVar.f(i18);
                }
                i16 = i17;
                i18 = i19;
                i17 = i20;
            }
        }
        return aVar;
    }

    public final String toString() {
        try {
            return a().toString();
        } catch (i unused) {
            return "";
        }
    }
}
