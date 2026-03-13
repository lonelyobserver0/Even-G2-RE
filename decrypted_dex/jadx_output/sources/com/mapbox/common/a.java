package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12376b;

    public /* synthetic */ a(Object obj, int i3) {
        this.f12375a = i3;
        this.f12376b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12375a) {
            case 0:
                ((ConnectionChangeCallback) this.f12376b).lambda$notifyReachability$0();
                break;
            default:
                RunloopErrorHandler.postErrorToMainLooper$lambda$0((Throwable) this.f12376b);
                break;
        }
    }
}
