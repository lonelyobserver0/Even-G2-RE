package J2;

import X2.g;
import android.bluetooth.le.ScanSettings;
import com.fzfstudio.ezw_ble.ble.BleManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3398a;

    public /* synthetic */ b(int i3) {
        this.f3398a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ScanSettings scanSettings_delegate$lambda$0;
        switch (this.f3398a) {
            case 0:
                d dVar = c.f3400b;
                if (dVar != null) {
                    dVar.invoke();
                }
                return Unit.INSTANCE;
            case 1:
                return 33554432;
            case 2:
                return new g(0);
            case 3:
                return new g(0);
            case 4:
                return new g(0);
            case 5:
                return new g(0);
            case 6:
                scanSettings_delegate$lambda$0 = BleManager.scanSettings_delegate$lambda$0();
                return scanSettings_delegate$lambda$0;
            case 7:
                return new g(1);
            default:
                return new g(2);
        }
    }
}
