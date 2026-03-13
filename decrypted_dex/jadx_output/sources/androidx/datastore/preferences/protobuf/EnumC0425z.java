package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum EnumC0425z {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0407g.class, C0407g.f9780c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* renamed from: a, reason: collision with root package name */
    public final Serializable f9865a;

    EnumC0425z(Class cls, Serializable serializable) {
        this.f9865a = serializable;
    }
}
