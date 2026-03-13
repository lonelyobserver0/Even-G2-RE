package c3;

import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class ViewOnKeyListenerC0564a implements View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0565b f10813a;

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        C0565b c0565b = this.f10813a;
        if ((!c0565b.f10815b || i3 != 24) && i3 != 25) {
            return false;
        }
        MethodChannel methodChannel = c0565b.f10814a;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            methodChannel = null;
        }
        methodChannel.invokeMethod(StubApp.getString2(9410), i3 == 24 ? StubApp.getString2(9408) : StubApp.getString2(9409));
        ((AudioManager) c0565b.f10818e.getValue()).adjustStreamVolume(3, i3 == 24 ? 1 : -1, 8);
        return true;
    }
}
