package e6;

import ba.AbstractC0534b;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class d extends AbstractC0534b {
    public final void l(StringBuilder sb2, int i3) {
        sb2.append(StubApp.getString2(17326));
        int length = sb2.length();
        sb2.append('9');
        m(sb2, i3, length);
    }

    public final void m(StringBuilder sb2, int i3, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            int o5 = a5.c.o((i11 * 10) + i3, 10, (T5.a) ((a5.c) this.f10728b).f9282b);
            if (o5 / 100 == 0) {
                sb2.append('0');
            }
            if (o5 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(o5);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 13; i13++) {
            int charAt = sb2.charAt(i13 + i10) - '0';
            if ((i13 & 1) == 0) {
                charAt *= 3;
            }
            i12 += charAt;
        }
        int i14 = 10 - (i12 % 10);
        sb2.append(i14 != 10 ? i14 : 0);
    }
}
