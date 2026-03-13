package da;

import androidx.datastore.preferences.protobuf.AbstractC0410j;
import com.stub.StubApp;

/* renamed from: da.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0821k extends AbstractC0410j {

    /* renamed from: c, reason: collision with root package name */
    public short f13512c;

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int b(int i3, int i10) {
        return i10 < 0 ? i3 : i3 + this.f13512c;
    }

    public final String toString() {
        return String.format(StubApp.getString2(17213), Integer.valueOf(this.f9807a), Short.valueOf(this.f13512c));
    }
}
