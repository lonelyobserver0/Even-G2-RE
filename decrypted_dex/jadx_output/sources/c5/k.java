package c5;

import android.os.Bundle;
import com.stub.StubApp;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f10890b;

    public k(l lVar, long j) {
        this.f10890b = lVar;
        this.f10889a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt(StubApp.getString2(9474), 1);
        bundle.putLong(StubApp.getString2(1350), this.f10889a);
        this.f10890b.f10902k.m(bundle);
        return null;
    }
}
