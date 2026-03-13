package com.fzfstudio.ezw_ble.ble;

import com.fzfstudio.ezw_ble.ble.models.BleConnectTemp;
import com.fzfstudio.ezw_ble.ble.models.enums.BleConnectState;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/fzfstudio/ezw_ble/ble/BleManager$connect$4", "Ljava/util/TimerTask;", "run", "", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleManager.kt\ncom/fzfstudio/ezw_ble/ble/BleManager$connect$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1143:1\n295#2,2:1144\n*S KotlinDebug\n*F\n+ 1 BleManager.kt\ncom/fzfstudio/ezw_ble/ble/BleManager$connect$4\n*L\n325#1:1144,2\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BleManager$connect$4 extends TimerTask {
    final /* synthetic */ String $name;
    final /* synthetic */ String $uuid;
    final /* synthetic */ BleManager this$0;

    public BleManager$connect$4(BleManager bleManager, String str, String str2) {
        this.this$0 = bleManager;
        this.$uuid = str;
        this.$name = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean run$lambda$1(String str, Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getFirst(), str);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        Set set;
        List list;
        List list2;
        List list3;
        Object obj;
        set = this.this$0.preConnectedDevices;
        boolean contains = set.contains(this.$uuid);
        String string2 = StubApp.getString2(11247);
        if (!contains) {
            this.this$0.sendLog(defpackage.a.f9226b, string2 + this.$uuid + StubApp.getString2(11249));
            list = this.this$0.disconnectingDevices;
            CollectionsKt__MutableCollectionsKt.removeAll(list, (Function1) new a(this.$uuid, 5));
            list2 = this.this$0.disconnectingDevices;
            String str = this.$uuid;
            BleConnectState bleConnectState = BleConnectState.TIMEOUT;
            list2.add(new Pair(str, bleConnectState));
            BleManager.handleConnectState$default(this.this$0, this.$uuid, this.$name, bleConnectState, false, 0, 24, null);
            return;
        }
        this.this$0.sendLog(defpackage.a.f9225a, string2 + this.$uuid + StubApp.getString2(11248));
        list3 = this.this$0.waitingConnectDevices;
        String str2 = this.$uuid;
        Iterator it = list3.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((BleConnectTemp) obj).getUuid(), str2)) {
                    break;
                }
            }
        }
        BleConnectTemp bleConnectTemp = (BleConnectTemp) obj;
        if (bleConnectTemp != null) {
            bleConnectTemp.setTimeoutTimer(null);
        }
    }
}
