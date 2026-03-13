package com.fzfstudio.ezw_ble.ble.models.enums;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import kotlin.Metadata;
import n3.a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J(\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/enums/BleConnectStateAdapter;", "Lcom/google/gson/JsonSerializer;", "Lcom/fzfstudio/ezw_ble/ble/models/enums/BleConnectState;", "Lcom/google/gson/JsonDeserializer;", "<init>", "()V", "serialize", "Lcom/google/gson/JsonElement;", "src", "typeOfSrc", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonSerializationContext;", "deserialize", "json", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BleConnectStateAdapter implements JsonSerializer<BleConnectState>, JsonDeserializer<BleConnectState> {
    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        if (r1 == null) goto L7;
     */
    @Override // com.google.gson.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fzfstudio.ezw_ble.ble.models.enums.BleConnectState deserialize(com.google.gson.JsonElement r1, java.lang.reflect.Type r2, com.google.gson.JsonDeserializationContext r3) {
        /*
            r0 = this;
            if (r1 == 0) goto L31
            java.lang.String r1 = r1.getAsString()
            if (r1 == 0) goto L31
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            kotlin.text.Regex r2 = new kotlin.text.Regex
            r3 = 11223(0x2bd7, float:1.5727E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r2.<init>(r3)
            r3 = 11224(0x2bd8, float:1.5728E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            java.lang.String r1 = r2.replace(r1, r3)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r2)
            java.lang.String r2 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            if (r1 != 0) goto L38
        L31:
            r1 = 207(0xcf, float:2.9E-43)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
        L38:
            com.fzfstudio.ezw_ble.ble.models.enums.BleConnectState r1 = com.fzfstudio.ezw_ble.ble.models.enums.BleConnectState.valueOf(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fzfstudio.ezw_ble.ble.models.enums.BleConnectStateAdapter.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext):com.fzfstudio.ezw_ble.ble.models.enums.BleConnectState");
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(BleConnectState src, Type typeOfSrc, JsonSerializationContext context) {
        String name;
        return new JsonPrimitive((src == null || (name = src.name()) == null) ? null : a.a(name));
    }
}
