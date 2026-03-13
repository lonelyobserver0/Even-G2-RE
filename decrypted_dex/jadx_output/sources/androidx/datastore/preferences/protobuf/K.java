package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.F1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f9714a;

    static {
        char[] cArr = new char[80];
        f9714a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i3) {
        while (i3 > 0) {
            int i10 = 80;
            if (i3 <= 80) {
                i10 = i3;
            }
            sb2.append(f9714a, 0, i10);
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
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            C0407g c0407g = C0407g.f9780c;
            sb2.append(F1.n(new C0407g(((String) obj).getBytes(AbstractC0422w.f9852a))));
            sb2.append(Typography.quote);
            return;
        }
        if (obj instanceof C0407g) {
            sb2.append(": \"");
            sb2.append(F1.n((C0407g) obj));
            sb2.append(Typography.quote);
            return;
        }
        if (obj instanceof AbstractC0420u) {
            sb2.append(" {");
            c((AbstractC0420u) obj, sb2, i3 + 2);
            sb2.append("\n");
            a(sb2, i3);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i11 = i3 + 2;
        b(sb2, i11, "key", entry.getKey());
        b(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        a(sb2, i3);
        sb2.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x019a, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019c, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01af, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c5, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(androidx.datastore.preferences.protobuf.AbstractC0420u r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.K.c(androidx.datastore.preferences.protobuf.u, java.lang.StringBuilder, int):void");
    }
}
