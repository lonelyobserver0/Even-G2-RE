package M4;

import java.util.Comparator;

/* renamed from: M4.x, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0152x extends AbstractC0154z {
    public static AbstractC0154z f(int i3) {
        return i3 < 0 ? AbstractC0154z.f4668b : i3 > 0 ? AbstractC0154z.f4669c : AbstractC0154z.f4667a;
    }

    @Override // M4.AbstractC0154z
    public final AbstractC0154z a(int i3, int i10) {
        return f(Integer.compare(i3, i10));
    }

    @Override // M4.AbstractC0154z
    public final AbstractC0154z b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // M4.AbstractC0154z
    public final AbstractC0154z c(boolean z2, boolean z10) {
        return f(Boolean.compare(z2, z10));
    }

    @Override // M4.AbstractC0154z
    public final AbstractC0154z d(boolean z2, boolean z10) {
        return f(Boolean.compare(z10, z2));
    }

    @Override // M4.AbstractC0154z
    public final int e() {
        return 0;
    }
}
