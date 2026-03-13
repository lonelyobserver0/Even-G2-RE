package io.flutter.embedding.engine.renderer;

import io.flutter.view.p;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f15026b;

    public /* synthetic */ e(p pVar, int i3) {
        this.f15025a = i3;
        this.f15026b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15025a) {
            case 0:
                ((FlutterRenderer$ImageReaderSurfaceProducer) this.f15026b).lambda$dequeueImage$0();
                break;
            default:
                ((j) this.f15026b).getClass();
                break;
        }
    }
}
