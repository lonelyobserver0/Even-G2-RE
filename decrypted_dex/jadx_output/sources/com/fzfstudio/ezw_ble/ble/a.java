package com.fzfstudio.ezw_ble.ble;

import com.fzfstudio.ezw_ble.ble.models.BleConnectTemp;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11149b;

    public /* synthetic */ a(String str, int i3) {
        this.f11148a = i3;
        this.f11149b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean disconnectDevice$lambda$17;
        boolean disconnectDevice$lambda$20;
        boolean handleConnectState$lambda$22;
        boolean handleConnectState$lambda$23;
        boolean handleConnectState$lambda$24;
        boolean run$lambda$1;
        switch (this.f11148a) {
            case 0:
                disconnectDevice$lambda$17 = BleManager.disconnectDevice$lambda$17(this.f11149b, (Pair) obj);
                return Boolean.valueOf(disconnectDevice$lambda$17);
            case 1:
                disconnectDevice$lambda$20 = BleManager.disconnectDevice$lambda$20(this.f11149b, (BleConnectTemp) obj);
                return Boolean.valueOf(disconnectDevice$lambda$20);
            case 2:
                handleConnectState$lambda$22 = BleManager.handleConnectState$lambda$22(this.f11149b, (Pair) obj);
                return Boolean.valueOf(handleConnectState$lambda$22);
            case 3:
                handleConnectState$lambda$23 = BleManager.handleConnectState$lambda$23(this.f11149b, (BleConnectTemp) obj);
                return Boolean.valueOf(handleConnectState$lambda$23);
            case 4:
                handleConnectState$lambda$24 = BleManager.handleConnectState$lambda$24(this.f11149b, (Pair) obj);
                return Boolean.valueOf(handleConnectState$lambda$24);
            default:
                run$lambda$1 = BleManager$connect$4.run$lambda$1(this.f11149b, (Pair) obj);
                return Boolean.valueOf(run$lambda$1);
        }
    }
}
