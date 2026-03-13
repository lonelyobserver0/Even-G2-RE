package s0;

import J1.s;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b extends s {

    /* renamed from: c, reason: collision with root package name */
    public final long f20591c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f20592d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f20593e;

    public b(int i3, long j) {
        super(i3, 4);
        this.f20591c = j;
        this.f20592d = new ArrayList();
        this.f20593e = new ArrayList();
    }

    public final b s(int i3) {
        ArrayList arrayList = this.f20593e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            if (bVar.f3376b == i3) {
                return bVar;
            }
        }
        return null;
    }

    public final c t(int i3) {
        ArrayList arrayList = this.f20592d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) arrayList.get(i10);
            if (cVar.f3376b == i3) {
                return cVar;
            }
        }
        return null;
    }

    @Override // J1.s
    public final String toString() {
        return s.i(this.f3376b) + StubApp.getString2(23025) + Arrays.toString(this.f20592d.toArray()) + StubApp.getString2(23026) + Arrays.toString(this.f20593e.toArray());
    }
}
