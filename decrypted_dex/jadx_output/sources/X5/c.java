package X5;

import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final s2.d f8415a;

    public c(int i3) {
        switch (i3) {
            case 1:
                this.f8415a = new s2.d(V5.a.f7752o, 19);
                break;
            default:
                this.f8415a = new s2.d(V5.a.f7750m, 19);
                break;
        }
    }

    public int a(byte[] bArr, int i3, int i10, int i11, int i12) {
        int i13 = i10 + i11;
        int i14 = i12 == 0 ? 1 : 2;
        int[] iArr = new int[i13 / i14];
        for (int i15 = 0; i15 < i13; i15++) {
            if (i12 == 0 || i15 % 2 == i12 - 1) {
                iArr[i15 / i14] = bArr[i15 + i3] & UByte.MAX_VALUE;
            }
        }
        try {
            int b2 = this.f8415a.b(i11 / i14, iArr);
            for (int i16 = 0; i16 < i10; i16++) {
                if (i12 == 0 || i16 % 2 == i12 - 1) {
                    bArr[i16 + i3] = (byte) iArr[i16 / i14];
                }
            }
            return b2;
        } catch (V5.b unused) {
            throw N5.c.a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x072a, code lost:
    
        if (r3.length() <= 0) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x072c, code lost:
    
        r2.A();
        ((java.lang.StringBuilder) r2.f5712c).append((java.lang.CharSequence) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0736, code lost:
    
        if (r11 == false) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x073c, code lost:
    
        if (r8.contains(0) != false) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0747, code lost:
    
        if (r8.contains(4) == false) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x074e, code lost:
    
        if (r8.contains(1) != false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0758, code lost:
    
        if (r8.contains(5) == false) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x075b, code lost:
    
        r26 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0790, code lost:
    
        r21 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x079a, code lost:
    
        if (r6.isEmpty() == false) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x079c, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x079d, code lost:
    
        r19 = new Ac.f(r25, r21, r6, null, -1, -1, r26);
        r19.f327h = java.lang.Integer.valueOf(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x07b2, code lost:
    
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x075e, code lost:
    
        r26 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0761, code lost:
    
        r26 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0768, code lost:
    
        if (r8.contains(0) != false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0774, code lost:
    
        if (r8.contains(4) == false) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x077b, code lost:
    
        if (r8.contains(1) != false) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0785, code lost:
    
        if (r8.contains(5) == false) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0788, code lost:
    
        r26 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x078b, code lost:
    
        r26 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x078e, code lost:
    
        r26 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03ac, code lost:
    
        throw N5.e.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03fd A[LOOP:15: B:115:0x0359->B:130:0x03fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03fb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Ac.f b(T5.b r29) {
        /*
            Method dump skipped, instructions count: 2044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X5.c.b(T5.b):Ac.f");
    }
}
