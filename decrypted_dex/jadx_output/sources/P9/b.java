package P9;

import Xa.AbstractActivityC0364d;
import Ya.d;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.EventChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LP9/b;", "Ldb/b;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "Leb/a;", "<init>", "()V", "keyboard_height_plugin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements InterfaceC0825b, EventChannel.StreamHandler, eb.a {

    /* renamed from: a, reason: collision with root package name */
    public EventChannel.EventSink f5646a;

    /* renamed from: b, reason: collision with root package name */
    public EventChannel f5647b;

    /* renamed from: c, reason: collision with root package name */
    public eb.b f5648c;

    @Override // eb.a
    public final void onAttachedToActivity(eb.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f5648c = binding;
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        EventChannel eventChannel = new EventChannel(flutterPluginBinding.f13554b, StubApp.getString2(5042));
        this.f5647b = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        this.f5648c = null;
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f5648c = null;
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        EventChannel eventChannel = this.f5647b;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        ViewTreeObserver viewTreeObserver;
        AbstractActivityC0364d abstractActivityC0364d;
        Window window;
        View decorView;
        this.f5646a = eventSink;
        eb.b bVar = this.f5648c;
        View rootView = (bVar == null || (abstractActivityC0364d = ((d) bVar).f8882a) == null || (window = abstractActivityC0364d.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootView();
        if (rootView == null || (viewTreeObserver = rootView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a(rootView, this, eventSink));
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(eb.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f5648c = binding;
    }
}
