package Z9;

import java.util.Arrays;

/* renamed from: Z9.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0376k {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f9130a;

    public C0376k(int i3) {
        this(new int[]{i3});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0376k) {
            return Arrays.equals(this.f9130a, ((C0376k) obj).f9130a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9130a);
    }

    public final String toString() {
        return Arrays.toString(this.f9130a);
    }

    public C0376k(int i3, int i10) {
        this(new int[]{i3, i10});
    }

    public C0376k(int[] iArr) {
        this.f9130a = iArr;
    }
}
