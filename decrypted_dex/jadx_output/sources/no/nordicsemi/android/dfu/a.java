package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGatt;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DfuBaseService.AnonymousClass5 f18006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BluetoothGatt f18007c;

    public /* synthetic */ a(DfuBaseService.AnonymousClass5 anonymousClass5, BluetoothGatt bluetoothGatt, int i3) {
        this.f18005a = i3;
        this.f18006b = anonymousClass5;
        this.f18007c = bluetoothGatt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18005a) {
            case 0:
                this.f18006b.lambda$onServiceChanged$1(this.f18007c);
                break;
            default:
                this.f18006b.lambda$onConnectionStateChange$0(this.f18007c);
                break;
        }
    }
}
