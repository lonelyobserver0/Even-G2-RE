package dev.steenbakker.nordicdfu;

import com.stub.StubApp;
import kotlin.Metadata;
import no.nordicsemi.android.dfu.DfuBaseService;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldev/steenbakker/nordicdfu/DfuService;", "Lno/nordicsemi/android/dfu/DfuBaseService;", "<init>", "()V", "nordic_dfu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class DfuService extends DfuBaseService {
    static {
        StubApp.interface11(7659);
    }

    @Override // no.nordicsemi.android.dfu.DfuBaseService
    public final native Class getNotificationTarget();

    @Override // no.nordicsemi.android.dfu.DfuBaseService
    public final native boolean isDebug();
}
