package T0;

import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final int f6937a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6938b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6939c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6940d;

    public G(int i3, byte[] bArr, int i10, int i11) {
        this.f6937a = i3;
        this.f6938b = bArr;
        this.f6939c = i10;
        this.f6940d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G.class == obj.getClass()) {
            G g10 = (G) obj;
            if (this.f6937a == g10.f6937a && this.f6939c == g10.f6939c && this.f6940d == g10.f6940d && Arrays.equals(this.f6938b, g10.f6938b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f6938b) + (this.f6937a * 31)) * 31) + this.f6939c) * 31) + this.f6940d;
    }
}
