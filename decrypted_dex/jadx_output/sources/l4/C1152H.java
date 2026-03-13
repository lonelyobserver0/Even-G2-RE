package l4;

import android.os.Parcel;
import c4.AbstractC0566a;
import java.util.List;

/* renamed from: l4.H, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1152H extends AbstractC0566a implements InterfaceC1153I {
    @Override // l4.InterfaceC1153I
    public final void F(List list) {
        Parcel g10 = g();
        g10.writeTypedList(list);
        M(g10);
    }
}
