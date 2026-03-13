package Z9;

import com.stub.StubApp;
import java.util.Arrays;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class z extends E {

    /* renamed from: b, reason: collision with root package name */
    public int f9154b;

    /* renamed from: c, reason: collision with root package name */
    public int f9155c;

    /* renamed from: d, reason: collision with root package name */
    public A[] f9156d;

    /* renamed from: e, reason: collision with root package name */
    public int f9157e;

    @Override // Z9.E
    public final int a(int i3) {
        int i10 = 0;
        while (true) {
            int i11 = this.f9155c;
            if (i10 >= i11) {
                return 0;
            }
            A[] aArr = this.f9156d;
            A a3 = aArr[i10];
            if (a3.f9069b <= i3) {
                int i12 = i10 + 1;
                if (i12 >= i11) {
                    if (this.f9157e > i3) {
                        return a3.f9070c;
                    }
                    return -1;
                }
                if (aArr[i12].f9069b > i3) {
                    return a3.f9070c;
                }
            }
            i10++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Xa.h.w(z.class, sb2, StubApp.getString2(8247));
        sb2.append(this.f9154b);
        sb2.append(StubApp.getString2(8252));
        sb2.append(this.f9155c);
        sb2.append(StubApp.getString2(8253));
        sb2.append(Arrays.toString(this.f9156d));
        sb2.append(StubApp.getString2(8254));
        return AbstractC1482f.f(this.f9157e, StubApp.getString2(511), sb2);
    }
}
