package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum q0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C0407g.f9780c),
    ENUM(null),
    MESSAGE(null);


    /* renamed from: a, reason: collision with root package name */
    public final Serializable f9847a;

    q0(Serializable serializable) {
        this.f9847a = serializable;
    }
}
