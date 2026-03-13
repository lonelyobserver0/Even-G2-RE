package com.dexterous.flutterlocalnotifications;

import io.flutter.plugin.common.EventChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11105a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public EventChannel.EventSink f11106b;

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        this.f11106b = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        ArrayList arrayList = this.f11105a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eventSink.success((Map) it.next());
        }
        arrayList.clear();
        this.f11106b = eventSink;
    }
}
