package o6;

import Ya.d;
import android.R;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import eb.b;
import io.flutter.plugin.common.EventChannel;

/* renamed from: o6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1463a implements InterfaceC0825b, eb.a, EventChannel.StreamHandler, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public EventChannel.EventSink f18375a;

    /* renamed from: b, reason: collision with root package name */
    public View f18376b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18377c;

    @Override // eb.a
    public final void onAttachedToActivity(b bVar) {
        View findViewById = ((d) bVar).f8882a.findViewById(R.id.content);
        this.f18376b = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        new EventChannel(c0824a.f13554b, StubApp.getString2(21618)).setStreamHandler(this);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        this.f18375a = null;
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        View view = this.f18376b;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f18376b = null;
        }
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        View view = this.f18376b;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f18376b = null;
        }
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        View view = this.f18376b;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f18376b = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.f18376b != null) {
            Rect rect = new Rect();
            this.f18376b.getWindowVisibleDisplayFrame(rect);
            ?? r02 = ((double) rect.height()) / ((double) this.f18376b.getRootView().getHeight()) < 0.85d ? 1 : 0;
            if (r02 != this.f18377c) {
                this.f18377c = r02;
                EventChannel.EventSink eventSink = this.f18375a;
                if (eventSink != null) {
                    eventSink.success(Integer.valueOf((int) r02));
                }
            }
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f18375a = eventSink;
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(b bVar) {
        View findViewById = ((d) bVar).f8882a.findViewById(R.id.content);
        this.f18376b = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
