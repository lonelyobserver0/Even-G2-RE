package L4;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    public final char f4179a;

    public c(char c10) {
        this.f4179a = c10;
    }

    @Override // L4.b
    public final boolean a(char c10) {
        return c10 == this.f4179a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(3364));
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c10 = this.f4179a;
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = StubApp.getString2(3365).charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append(StubApp.getString2(2142));
        return sb2.toString();
    }
}
