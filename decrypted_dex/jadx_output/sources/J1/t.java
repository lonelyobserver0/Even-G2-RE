package J1;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3377a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3378b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3379c;

    public /* synthetic */ t(String str, boolean z2, int i3) {
        this.f3377a = i3;
        this.f3378b = str;
        this.f3379c = z2;
    }

    public String toString() {
        switch (this.f3377a) {
            case 1:
                String str = this.f3378b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
                sb2.append(StubApp.getString2(1352));
                sb2.append(str);
                sb2.append(StubApp.getString2(265));
                sb2.append(this.f3379c);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public t(boolean z2, String str) {
        this.f3377a = 0;
        this.f3379c = z2;
        this.f3378b = str;
    }
}
