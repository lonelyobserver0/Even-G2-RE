package S3;

import R3.InterfaceC0240i;
import android.content.Intent;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t extends u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f6564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0240i f6565b;

    public t(Intent intent, InterfaceC0240i interfaceC0240i) {
        this.f6564a = intent;
        this.f6565b = interfaceC0240i;
    }

    @Override // S3.u
    public final void a() {
        Intent intent = this.f6564a;
        if (intent != null) {
            this.f6565b.startActivityForResult(intent, 2);
        }
    }
}
