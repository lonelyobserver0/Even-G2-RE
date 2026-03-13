package S3;

import java.util.Arrays;

/* renamed from: S3.q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0283q implements Q3.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0283q f6556c = new C0283q(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f6557b;

    public /* synthetic */ C0283q(String str) {
        this.f6557b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0283q) {
            return D.k(this.f6557b, ((C0283q) obj).f6557b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6557b});
    }
}
