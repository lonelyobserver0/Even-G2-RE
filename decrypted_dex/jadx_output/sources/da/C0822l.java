package da;

import androidx.datastore.preferences.protobuf.AbstractC0410j;
import com.stub.StubApp;
import java.util.Arrays;

/* renamed from: da.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0822l extends AbstractC0410j {

    /* renamed from: c, reason: collision with root package name */
    public int[] f13513c;

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int b(int i3, int i10) {
        return i10 < 0 ? i3 : this.f13513c[i10];
    }

    public final String toString() {
        return String.format(StubApp.getString2(17214), Integer.valueOf(this.f9807a), Arrays.toString(this.f13513c));
    }
}
