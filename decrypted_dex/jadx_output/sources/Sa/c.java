package Sa;

import android.content.Intent;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements PluginRegistry.ActivityResultListener {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel.Result f6675a;

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f6676b;

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i3, int i10, Intent intent) {
        MethodChannel.Result result;
        if (i3 != 22643) {
            return false;
        }
        String str = SharePlusPendingIntent.f13559a;
        if (this.f6676b.compareAndSet(false, true) && (result = this.f6675a) != null) {
            Intrinsics.checkNotNull(result);
            result.success(str);
            this.f6675a = null;
        }
        return true;
    }
}
