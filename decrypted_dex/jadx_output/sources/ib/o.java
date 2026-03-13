package ib;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface o {
    static void a(BinaryMessenger binaryMessenger, C1069c c1069c) {
        p pVar = p.f15012a;
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.initializeApp", pVar);
        if (c1069c != null) {
            basicMessageChannel.setMessageHandler(new g(c1069c, 3));
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.initializeCore", pVar);
        if (c1069c != null) {
            basicMessageChannel2.setMessageHandler(new g(c1069c, 4));
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.optionsFromResource", pVar);
        if (c1069c != null) {
            basicMessageChannel3.setMessageHandler(new g(c1069c, 5));
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
    }
}
