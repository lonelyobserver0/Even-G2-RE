package lc;

import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llc/a;", "Ldb/b;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "flutter_timezone_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lc.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C1253a implements InterfaceC0825b, MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f16839a;

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = new MethodChannel(binding.f13554b, StubApp.getString2(26090));
        this.f16839a = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.f16839a;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Collection collection;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        if (Intrinsics.areEqual(str, "getLocalTimezone")) {
            String id = ZoneId.systemDefault().getId();
            Intrinsics.checkNotNull(id);
            result.success(id);
        } else {
            if (!Intrinsics.areEqual(str, "getAvailableTimezones")) {
                result.notImplemented();
                return;
            }
            Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
            Intrinsics.checkNotNullExpressionValue(availableZoneIds, "getAvailableZoneIds(...)");
            collection = CollectionsKt___CollectionsKt.toCollection(availableZoneIds, new ArrayList());
            result.success((List) collection);
        }
    }
}
