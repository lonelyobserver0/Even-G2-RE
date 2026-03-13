package T0;

import com.stub.StubApp;
import java.util.ArrayList;
import o0.C1406C;
import r0.AbstractC1540a;
import r0.C1553n;

/* renamed from: T0.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0314e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6992a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6993b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6994c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6995d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6996e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6997f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6998g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6999h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7000i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final float f7001k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7002l;

    public C0314e(ArrayList arrayList, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, String str) {
        this.f6992a = arrayList;
        this.f6993b = i3;
        this.f6994c = i10;
        this.f6995d = i11;
        this.f6996e = i12;
        this.f6997f = i13;
        this.f6998g = i14;
        this.f6999h = i15;
        this.f7000i = i16;
        this.j = i17;
        this.f7001k = f10;
        this.f7002l = str;
    }

    public static C0314e a(C1553n c1553n) {
        String str;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        try {
            c1553n.H(4);
            int u2 = (c1553n.u() & 3) + 1;
            if (u2 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int u10 = c1553n.u() & 31;
            for (int i17 = 0; i17 < u10; i17++) {
                int A4 = c1553n.A();
                int i18 = c1553n.f20177b;
                c1553n.H(A4);
                byte[] bArr = c1553n.f20176a;
                byte[] bArr2 = AbstractC1540a.f20137a;
                byte[] bArr3 = new byte[A4 + 4];
                System.arraycopy(AbstractC1540a.f20137a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i18, bArr3, 4, A4);
                arrayList.add(bArr3);
            }
            int u11 = c1553n.u();
            for (int i19 = 0; i19 < u11; i19++) {
                int A5 = c1553n.A();
                int i20 = c1553n.f20177b;
                c1553n.H(A5);
                byte[] bArr4 = c1553n.f20176a;
                byte[] bArr5 = AbstractC1540a.f20137a;
                byte[] bArr6 = new byte[A5 + 4];
                System.arraycopy(AbstractC1540a.f20137a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i20, bArr6, 4, A5);
                arrayList.add(bArr6);
            }
            if (u10 > 0) {
                s0.m i21 = s0.n.i(u2, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i22 = i21.f20633e;
                int i23 = i21.f20634f;
                int i24 = i21.f20636h + 8;
                int i25 = i21.f20637i + 8;
                int i26 = i21.f20643p;
                int i27 = i21.f20644q;
                int i28 = i21.f20645r;
                int i29 = i21.f20646s;
                float f11 = i21.f20635g;
                str = AbstractC1540a.a(i21.f20629a, i21.f20630b, i21.f20631c);
                i12 = i27;
                i13 = i28;
                i14 = i29;
                f10 = f11;
                i10 = i23;
                i11 = i24;
                i15 = i25;
                i16 = i26;
                i3 = i22;
            } else {
                str = null;
                i3 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = 16;
                f10 = 1.0f;
                i15 = -1;
                i16 = -1;
            }
            return new C0314e(arrayList, u2, i3, i10, i11, i15, i16, i12, i13, i14, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C1406C.a(StubApp.getString2(6114), e10);
        }
    }
}
