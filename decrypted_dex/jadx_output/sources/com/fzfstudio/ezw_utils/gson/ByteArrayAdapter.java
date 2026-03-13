package com.fzfstudio.ezw_utils.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/fzfstudio/ezw_utils/gson/ByteArrayAdapter;", "Lcom/google/gson/JsonSerializer;", "", "Lcom/google/gson/JsonDeserializer;", "<init>", "()V", "flutter_ezw_utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nByteArrayAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteArrayAdapter.kt\ncom/fzfstudio/ezw_utils/gson/ByteArrayAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ByteArrayAdapter implements JsonSerializer<byte[]>, JsonDeserializer<byte[]> {
    @Override // com.google.gson.JsonDeserializer
    public final byte[] deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        String asString;
        if (jsonElement == null || (asString = jsonElement.getAsString()) == null) {
            return null;
        }
        return Base64.decode$default(Base64.INSTANCE, asString, 0, 0, 6, (Object) null);
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(byte[] bArr, Type type, JsonSerializationContext jsonSerializationContext) {
        byte[] bArr2 = bArr;
        if (bArr2 != null) {
            return new JsonPrimitive(Base64.encode$default(Base64.INSTANCE, bArr2, 0, 0, 6, null));
        }
        return null;
    }
}
