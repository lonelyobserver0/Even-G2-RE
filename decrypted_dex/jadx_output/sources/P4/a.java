package P4;

import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5532c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f5533a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5534b;

    static {
        new a(new int[0]);
    }

    public a(int[] iArr) {
        int length = iArr.length;
        this.f5533a = iArr;
        this.f5534b = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int i3 = aVar.f5534b;
            int i10 = this.f5534b;
            if (i10 == i3) {
                for (int i11 = 0; i11 < i10; i11++) {
                    hc.b.i(i11, i10);
                    int i12 = this.f5533a[i11];
                    hc.b.i(i11, aVar.f5534b);
                    if (i12 == aVar.f5533a[i11]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.f5534b; i10++) {
            i3 = (i3 * 31) + this.f5533a[i10];
        }
        return i3;
    }

    public final String toString() {
        int i3 = this.f5534b;
        if (i3 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i3 * 5);
        sb2.append('[');
        int[] iArr = this.f5533a;
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < i3; i10++) {
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
