package L0;

import java.util.Arrays;
import java.util.Random;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Random f4049a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4050b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f4051c;

    public c0() {
        this(new Random());
    }

    public final c0 a(int i3) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i3];
        int[] iArr3 = new int[i3];
        int i10 = 0;
        while (true) {
            random = this.f4049a;
            iArr = this.f4050b;
            if (i10 >= i3) {
                break;
            }
            iArr2[i10] = random.nextInt(iArr.length + 1);
            int i11 = i10 + 1;
            int nextInt = random.nextInt(i11);
            iArr3[i10] = iArr3[nextInt];
            iArr3[nextInt] = i10;
            i10 = i11;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i3];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length + i3; i14++) {
            if (i12 >= i3 || i13 != iArr2[i12]) {
                int i15 = i13 + 1;
                int i16 = iArr[i13];
                iArr4[i14] = i16;
                if (i16 >= 0) {
                    iArr4[i14] = i16 + i3;
                }
                i13 = i15;
            } else {
                iArr4[i14] = iArr3[i12];
                i12++;
            }
        }
        return new c0(iArr4, new Random(random.nextLong()));
    }

    public c0(int[] iArr, Random random) {
        this.f4050b = iArr;
        this.f4049a = random;
        this.f4051c = new int[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f4051c[iArr[i3]] = i3;
        }
    }

    public c0(Random random) {
        this(new int[0], random);
    }
}
