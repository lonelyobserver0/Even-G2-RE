package Q9;

import android.content.Context;
import android.media.AudioManager;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LQ9/e;", "Ldb/b;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "audio_session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements InterfaceC0825b, MethodChannel.MethodCallHandler {

    /* renamed from: c, reason: collision with root package name */
    public static Map f5781c;

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f5782d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f5783a;

    /* renamed from: b, reason: collision with root package name */
    public a f5784b;

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        BinaryMessenger messenger = flutterPluginBinding.f13554b;
        Intrinsics.checkNotNullExpressionValue(messenger, "getBinaryMessenger(...)");
        MethodChannel methodChannel = new MethodChannel(messenger, StubApp.getString2(5372));
        this.f5783a = methodChannel;
        Intrinsics.checkNotNull(methodChannel);
        methodChannel.setMethodCallHandler(this);
        Context applicationContext = flutterPluginBinding.f13553a;
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(messenger, "messenger");
        a manager = new a();
        if (a.f5772c == null) {
            a.f5772c = new B6.a(applicationContext, 1);
        }
        manager.f5773a = messenger;
        manager.f5774b = new MethodChannel(messenger, StubApp.getString2(5373));
        B6.a aVar = a.f5772c;
        Intrinsics.checkNotNull(aVar);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(manager, "manager");
        ((ArrayList) aVar.f667a).add(manager);
        MethodChannel methodChannel2 = manager.f5774b;
        Intrinsics.checkNotNull(methodChannel2);
        methodChannel2.setMethodCallHandler(manager);
        this.f5784b = manager;
        f5782d.add(this);
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.f5783a;
        Intrinsics.checkNotNull(methodChannel);
        methodChannel.setMethodCallHandler(null);
        this.f5783a = null;
        a manager = this.f5784b;
        Intrinsics.checkNotNull(manager);
        MethodChannel methodChannel2 = manager.f5774b;
        Intrinsics.checkNotNull(methodChannel2);
        methodChannel2.setMethodCallHandler(null);
        B6.a aVar = a.f5772c;
        Intrinsics.checkNotNull(aVar);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(manager, "manager");
        ((ArrayList) aVar.f667a).remove(manager);
        B6.a aVar2 = a.f5772c;
        Intrinsics.checkNotNull(aVar2);
        if (((ArrayList) aVar2.f667a).size() == 0) {
            B6.a aVar3 = a.f5772c;
            Intrinsics.checkNotNull(aVar3);
            aVar3.a();
            AudioManager audioManager = (AudioManager) aVar3.f672f;
            Intrinsics.checkNotNull(audioManager);
            audioManager.unregisterAudioDeviceCallback((c) aVar3.f673g);
            aVar3.f671e = null;
            aVar3.f672f = null;
            a.f5772c = null;
        }
        manager.f5774b = null;
        this.f5784b = null;
        f5782d.remove(this);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        Object obj = call.arguments;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        String str = call.method;
        if (!Intrinsics.areEqual(str, "setConfiguration")) {
            if (Intrinsics.areEqual(str, "getConfiguration")) {
                result.success(f5781c);
                return;
            } else {
                result.notImplemented();
                return;
            }
        }
        f5781c = (Map) list.get(0);
        result.success(null);
        Map map = f5781c;
        Intrinsics.checkNotNull(map);
        Object[] objArr = {map};
        Iterator it = f5782d.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            List mutableList = ArraysKt.toMutableList(objArr);
            MethodChannel methodChannel = eVar.f5783a;
            Intrinsics.checkNotNull(methodChannel);
            methodChannel.invokeMethod(StubApp.getString2(5374), mutableList);
        }
    }
}
