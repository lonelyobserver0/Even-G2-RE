package a0;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* renamed from: a0.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0387i extends Y.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9249a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f9250b;

    public C0387i(EditText editText) {
        this.f9250b = new WeakReference(editText);
    }

    @Override // Y.f
    public void a() {
        switch (this.f9249a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f9250b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
        }
    }

    @Override // Y.f
    public final void b() {
        switch (this.f9249a) {
            case 0:
                C0388j.a((EditText) this.f9250b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f9250b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
        }
    }

    public C0387i(SwitchCompat switchCompat) {
        this.f9250b = new WeakReference(switchCompat);
    }
}
