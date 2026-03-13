package Ra;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRa/a;", "Ldb/b;", "<init>", "()V", "device_info_plus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements InterfaceC0825b {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f6351a;

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        BinaryMessenger binaryMessenger = binding.f13554b;
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        Context context = binding.f13553a;
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        this.f6351a = new MethodChannel(binaryMessenger, StubApp.getString2(5868));
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService(StubApp.getString2(2680));
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkNotNull(contentResolver);
        b bVar = new b(packageManager, (ActivityManager) systemService, contentResolver);
        MethodChannel methodChannel = this.f6351a;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(bVar);
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.f6351a;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }
}
