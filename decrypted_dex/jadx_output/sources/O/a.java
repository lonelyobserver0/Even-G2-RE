package O;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f5055a;

    /* renamed from: b, reason: collision with root package name */
    public final e f5056b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5057c;

    public a(int i3, e eVar, int i10) {
        this.f5055a = i3;
        this.f5056b = eVar;
        this.f5057c = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(StubApp.getString2(3626), this.f5055a);
        this.f5056b.f5069a.performAction(this.f5057c, bundle);
    }
}
