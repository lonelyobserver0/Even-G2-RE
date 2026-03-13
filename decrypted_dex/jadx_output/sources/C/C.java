package C;

import android.os.Bundle;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public C0036m f780a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f781b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f782c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f783d = false;

    public void a(Bundle bundle) {
        if (this.f783d) {
            bundle.putCharSequence(StubApp.getString2(736), this.f782c);
        }
        CharSequence charSequence = this.f781b;
        if (charSequence != null) {
            bundle.putCharSequence(StubApp.getString2(737), charSequence);
        }
        String c10 = c();
        if (c10 != null) {
            bundle.putString(StubApp.getString2(705), c10);
        }
    }

    public abstract void b(E e10);

    public String c() {
        return null;
    }

    public void d(Bundle bundle) {
        String string2 = StubApp.getString2(736);
        if (bundle.containsKey(string2)) {
            this.f782c = bundle.getCharSequence(string2);
            this.f783d = true;
        }
        this.f781b = bundle.getCharSequence(StubApp.getString2(737));
    }
}
