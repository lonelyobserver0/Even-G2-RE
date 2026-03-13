package com.google.protobuf;

import com.stub.StubApp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

/* renamed from: com.google.protobuf.k0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0736k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f12168a;

    static {
        char[] cArr = new char[80];
        f12168a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i3) {
        while (i3 > 0) {
            int i10 = 80;
            if (i3 <= 80) {
                i10 = i3;
            }
            sb2.append(f12168a, 0, i10);
            i3 -= i10;
        }
    }

    public static void b(StringBuilder sb2, int i3, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i3, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(sb2, i3);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (Character.isUpperCase(charAt)) {
                    sb3.append(StubApp.getString2(4956));
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        boolean z2 = obj instanceof String;
        String string2 = StubApp.getString2(11621);
        if (z2) {
            sb2.append(string2);
            sb2.append(Ec.l.k(AbstractC0733j.d((String) obj)));
            sb2.append(Typography.quote);
            return;
        }
        if (obj instanceof AbstractC0733j) {
            sb2.append(string2);
            sb2.append(Ec.l.k((AbstractC0733j) obj));
            sb2.append(Typography.quote);
            return;
        }
        boolean z10 = obj instanceof F;
        String string22 = StubApp.getString2(265);
        String string23 = StubApp.getString2(3692);
        String string24 = StubApp.getString2(11622);
        if (z10) {
            sb2.append(string24);
            c((F) obj, sb2, i3 + 2);
            sb2.append(string23);
            a(sb2, i3);
            sb2.append(string22);
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(StubApp.getString2(994));
            sb2.append(obj);
            return;
        }
        sb2.append(string24);
        Map.Entry entry = (Map.Entry) obj;
        int i11 = i3 + 2;
        b(sb2, i11, StubApp.getString2(728), entry.getKey());
        b(sb2, i11, StubApp.getString2(1061), entry.getValue());
        sb2.append(string23);
        a(sb2, i3);
        sb2.append(string22);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bd, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bf, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d2, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e8, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.google.protobuf.F r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC0736k0.c(com.google.protobuf.F, java.lang.StringBuilder, int):void");
    }
}
