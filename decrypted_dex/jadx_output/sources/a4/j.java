package a4;

import android.os.Parcel;
import c4.AbstractC0566a;
import e4.AbstractC0841a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends AbstractC0566a {
    public final Z3.a N(Z3.b bVar, String str, int i3, Z3.b bVar2) {
        Parcel g10 = g();
        AbstractC0841a.c(g10, bVar);
        g10.writeString(str);
        g10.writeInt(i3);
        AbstractC0841a.c(g10, bVar2);
        Parcel e10 = e(g10, 2);
        Z3.a N3 = Z3.b.N(e10.readStrongBinder());
        e10.recycle();
        return N3;
    }

    public final Z3.a O(Z3.b bVar, String str, int i3, Z3.b bVar2) {
        Parcel g10 = g();
        AbstractC0841a.c(g10, bVar);
        g10.writeString(str);
        g10.writeInt(i3);
        AbstractC0841a.c(g10, bVar2);
        Parcel e10 = e(g10, 3);
        Z3.a N3 = Z3.b.N(e10.readStrongBinder());
        e10.recycle();
        return N3;
    }
}
