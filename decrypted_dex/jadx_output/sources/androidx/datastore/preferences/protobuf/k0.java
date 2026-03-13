package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0624h2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0624h2 f9816a;

    static {
        f9816a = (h0.f9796e && h0.f9795d && !AbstractC0403c.a()) ? new i0(1) : new i0(0);
    }

    public static int a(String str) {
        int length = str.length();
        int i3 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = str.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = str.length();
                while (i10 < length2) {
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new j0(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i3;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }
}
