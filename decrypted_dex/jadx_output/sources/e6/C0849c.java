package e6;

/* renamed from: e6.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0849c extends e {

    /* renamed from: c, reason: collision with root package name */
    public final String f13637c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13638d;

    public C0849c(T5.a aVar, String str, String str2) {
        super(aVar);
        this.f13637c = str2;
        this.f13638d = str;
    }

    @Override // ba.AbstractC0534b
    public final String j() {
        if (((T5.a) this.f10727a).f7182b != 84) {
            throw N5.i.a();
        }
        StringBuilder sb2 = new StringBuilder();
        l(sb2, 8);
        p(sb2, 48, 20);
        int o5 = a5.c.o(68, 16, (T5.a) ((a5.c) this.f10728b).f9282b);
        if (o5 != 38400) {
            sb2.append('(');
            sb2.append(this.f13637c);
            sb2.append(')');
            int i3 = o5 % 32;
            int i10 = o5 / 32;
            int i11 = (i10 % 12) + 1;
            int i12 = i10 / 12;
            if (i12 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i12);
            if (i11 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i11);
            if (i3 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i3);
        }
        return sb2.toString();
    }

    @Override // e6.e
    public final void n(StringBuilder sb2, int i3) {
        sb2.append('(');
        sb2.append(this.f13638d);
        sb2.append(i3 / 100000);
        sb2.append(')');
    }

    @Override // e6.e
    public final int o(int i3) {
        return i3 % 100000;
    }
}
