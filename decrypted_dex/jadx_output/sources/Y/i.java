package Y;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC0440o;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0444t;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0440o f8668a;

    public i(EmojiCompatInitializer emojiCompatInitializer, AbstractC0440o abstractC0440o) {
        this.f8668a = abstractC0440o;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void d(InterfaceC0444t interfaceC0444t) {
        b.a(Looper.getMainLooper()).postDelayed(new k(0), 500L);
        this.f8668a.b(this);
    }
}
