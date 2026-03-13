package io.flutter.view;

import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class s implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f15218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ac.q f15219b;

    public s(Ac.q qVar, long j) {
        this.f15219b = qVar;
        this.f15218a = j;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long nanoTime = System.nanoTime() - j;
        long j3 = nanoTime < 0 ? 0L : nanoTime;
        Ac.q qVar = this.f15219b;
        ((FlutterJNI) qVar.f382c).onVsync(j3, qVar.f381b, this.f15218a);
        qVar.f383d = this;
    }
}
