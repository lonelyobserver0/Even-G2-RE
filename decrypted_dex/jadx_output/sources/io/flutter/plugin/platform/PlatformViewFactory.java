package io.flutter.plugin.platform;

import android.content.Context;
import io.flutter.plugin.common.MessageCodec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class PlatformViewFactory {
    private final MessageCodec<Object> createArgsCodec;

    public PlatformViewFactory(MessageCodec<Object> messageCodec) {
        this.createArgsCodec = messageCodec;
    }

    public abstract PlatformView create(Context context, int i3, Object obj);

    public final MessageCodec<Object> getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
