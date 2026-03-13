package e6;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class e extends d {
    public abstract void n(StringBuilder sb2, int i3);

    public abstract int o(int i3);

    public final void p(StringBuilder sb2, int i3, int i10) {
        int o5 = a5.c.o(i3, i10, (T5.a) ((a5.c) this.f10728b).f9282b);
        n(sb2, o5);
        int o10 = o(o5);
        int i11 = 100000;
        for (int i12 = 0; i12 < 5; i12++) {
            if (o10 / i11 == 0) {
                sb2.append('0');
            }
            i11 /= 10;
        }
        sb2.append(o10);
    }
}
