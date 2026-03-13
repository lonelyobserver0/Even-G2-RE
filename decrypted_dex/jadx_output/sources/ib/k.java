package ib;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface k {
    static void b(BinaryMessenger binaryMessenger, C1069c c1069c) {
        p pVar = p.f15012a;
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", pVar);
        if (c1069c != null) {
            basicMessageChannel.setMessageHandler(new g(c1069c, 0));
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", pVar);
        if (c1069c != null) {
            basicMessageChannel2.setMessageHandler(new g(c1069c, 1));
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.delete", pVar);
        if (c1069c != null) {
            basicMessageChannel3.setMessageHandler(new g(c1069c, 2));
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
    }
}
