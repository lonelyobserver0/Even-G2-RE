package no.nordicsemi.android.dfu.internal.scanner;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18009b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BootloaderScanner f18010c;

    public /* synthetic */ a(BootloaderScanner bootloaderScanner, long j, int i3) {
        this.f18008a = i3;
        this.f18010c = bootloaderScanner;
        this.f18009b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18008a) {
            case 0:
                ((BootloaderScannerLollipop) this.f18010c).lambda$searchUsing$0(this.f18009b);
                break;
            default:
                ((BootloaderScannerJB) this.f18010c).lambda$searchUsing$0(this.f18009b);
                break;
        }
    }
}
