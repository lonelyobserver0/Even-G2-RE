package H0;

import android.net.Uri;
import android.util.Base64;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final m f2656a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f2657b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0881  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x(H0.p r45, H0.C0060c r46, android.net.Uri r47) {
        /*
            Method dump skipped, instructions count: 2510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.x.<init>(H0.p, H0.c, android.net.Uri):void");
    }

    public static byte[] a(String str) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length + 4];
        System.arraycopy(s0.n.f20647a, 0, bArr, 0, 4);
        System.arraycopy(decode, 0, bArr, 4, decode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (this.f2656a.equals(xVar.f2656a) && this.f2657b.equals(xVar.f2657b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2657b.hashCode() + ((this.f2656a.hashCode() + 217) * 31);
    }
}
