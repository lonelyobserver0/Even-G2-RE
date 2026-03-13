package com.fzfstudio.ezw_ble.ble.tools;

import com.stub.StubApp;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/tools/MessageDigestTool;", "", "<init>", "()V", "md5Hash", "", "input", "", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageDigestTool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageDigestTool.kt\ncom/fzfstudio/ezw_ble/ble/tools/MessageDigestTool\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n12897#2,3:18\n*S KotlinDebug\n*F\n+ 1 MessageDigestTool.kt\ncom/fzfstudio/ezw_ble/ble/tools/MessageDigestTool\n*L\n15#1:18,3\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MessageDigestTool {
    public static final MessageDigestTool INSTANCE = new MessageDigestTool();

    private MessageDigestTool() {
    }

    public final int md5Hash(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        MessageDigest messageDigest = MessageDigest.getInstance(StubApp.getString2(4894));
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNull(digest);
        int i3 = 0;
        for (byte b2 : digest) {
            i3 = (i3 * 31) + b2;
        }
        return i3;
    }
}
