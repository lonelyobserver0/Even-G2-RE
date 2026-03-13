package com.dexterous.flutterlocalnotifications;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f11108a;

    public c(MethodChannel.Result result) {
        this.f11108a = result;
    }

    @Override // com.dexterous.flutterlocalnotifications.j
    public final void a() {
        this.f11108a.error(StubApp.getString2(9883), StubApp.getString2(9884), null);
    }

    @Override // com.dexterous.flutterlocalnotifications.j
    public final void b(boolean z2) {
        this.f11108a.success(Boolean.valueOf(z2));
    }
}
