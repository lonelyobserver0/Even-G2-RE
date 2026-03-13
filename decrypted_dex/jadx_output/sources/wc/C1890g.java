package wc;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wc.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1890g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String a3 = (String) obj;
        String b2 = (String) obj2;
        Intrinsics.checkNotNullParameter(a3, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        int min = Math.min(a3.length(), b2.length());
        for (int i3 = 4; i3 < min; i3++) {
            char charAt = a3.charAt(i3);
            char charAt2 = b2.charAt(i3);
            if (charAt != charAt2) {
                return Intrinsics.compare((int) charAt, (int) charAt2) < 0 ? -1 : 1;
            }
        }
        int length = a3.length();
        int length2 = b2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
