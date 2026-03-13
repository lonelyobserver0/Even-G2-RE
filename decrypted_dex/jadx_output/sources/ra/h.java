package ra;

import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import oa.C1468a;
import oa.C1472e;
import oa.p;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h extends AbstractC1582a {

    /* renamed from: e, reason: collision with root package name */
    public final a5.c f20543e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f20544f;

    /* renamed from: g, reason: collision with root package name */
    public g f20545g;

    public h(p pVar, C1472e c1472e, a5.c cVar) {
        super(new c(pVar.Z()));
        this.f20544f = new int[3];
        this.f20545g = null;
        this.f20501c = c1472e;
        this.f20543e = cVar;
        try {
            w(pVar);
        } catch (IOException e10) {
            j jVar = this.f20500b;
            if (jVar != null) {
                jVar.close();
            }
            this.f20501c = null;
            throw e10;
        }
    }

    public static long x(int i3, int i10, byte[] bArr) {
        long j = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j += (bArr[i11 + i3] & 255) << (((i10 - i11) - 1) * 8);
        }
        return j;
    }

    public final void w(p pVar) {
        C1468a F3 = pVar.F(oa.j.F3);
        if (F3 == null) {
            throw new IOException(StubApp.getString2(22965));
        }
        int size = F3.f18393a.size();
        int[] iArr = this.f20544f;
        if (size != 3) {
            throw new IOException(StubApp.getString2(22964) + Arrays.toString(iArr));
        }
        for (int i3 = 0; i3 < 3; i3++) {
            iArr[i3] = F3.F(i3, 0);
        }
        if (iArr[0] < 0 || iArr[1] < 0 || iArr[2] < 0) {
            throw new IOException(StubApp.getString2(22963) + Arrays.toString(iArr));
        }
        C1468a F10 = pVar.F(oa.j.f18454H1);
        if (F10 == null) {
            F10 = new C1468a();
            F10.a(oa.i.f18412d);
            F10.a(oa.i.H(pVar.N(oa.j.f18534d3, null, 0)));
        }
        ArrayList arrayList = F10.f18393a;
        if (arrayList.size() == 0 || arrayList.size() % 2 == 1) {
            throw new IOException(StubApp.getString2(22962) + Arrays.toString(iArr));
        }
        this.f20545g = new g(F10);
    }
}
