package S3;

import android.os.Parcel;
import c4.AbstractC0566a;
import e4.AbstractC0841a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A extends AbstractC0566a implements C {
    public final boolean N() {
        Parcel e10 = e(g(), 7);
        int i3 = AbstractC0841a.f13595a;
        boolean z2 = e10.readInt() != 0;
        e10.recycle();
        return z2;
    }
}
