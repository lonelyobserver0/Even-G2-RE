package S3;

import android.app.Activity;
import android.content.Intent;
import d0.AbstractComponentCallbacksC0789t;

/* renamed from: S3.s, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0284s extends u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f6561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6562c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6563d;

    public /* synthetic */ C0284s(Intent intent, Object obj, int i3, int i10) {
        this.f6560a = i10;
        this.f6561b = intent;
        this.f6563d = obj;
        this.f6562c = i3;
    }

    @Override // S3.u
    public final void a() {
        switch (this.f6560a) {
            case 0:
                Intent intent = this.f6561b;
                if (intent != null) {
                    ((Activity) this.f6563d).startActivityForResult(intent, this.f6562c);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f6561b;
                if (intent2 != null) {
                    ((AbstractComponentCallbacksC0789t) this.f6563d).startActivityForResult(intent2, this.f6562c);
                    break;
                }
                break;
        }
    }
}
